package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_obra_responsavel")

public class ParceiroObraResponsavel extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer pare_id;

	@NotNull
	@Size(max = 60)
	public String pare_desc;   /// Nome do Resposanvel / o mesmo cadastrado no parceiro
	
	@JoinColumn(name = "pare_paob_id", referencedColumnName = "paob_id")
	public ParceiroObra pare_paob_id;

}