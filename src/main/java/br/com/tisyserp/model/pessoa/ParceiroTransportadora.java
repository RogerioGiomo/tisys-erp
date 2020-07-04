package br.com.tisyserp.model.pessoa;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_transportadora")
public class ParceiroTransportadora extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer patr_id;

	@JoinColumn(name = "patr_parc_id", referencedColumnName = "parc_id")
	@ManyToOne
	public Parceiro patr_parc_id;

	@NotNull
	@Size(max = 60)
	public String patr_desc; /// Nome da Transportadora

}