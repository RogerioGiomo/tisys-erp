package br.com.tisyserp.model.produto;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.pessoa.Parceiro;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "fabricante")

public class Fabricante  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer fabr_id;
	
	@NotNull
	@Size(max = 60)
	public String fabr_desc;

	@JoinColumn(name = "fabr_parc_id", referencedColumnName = "parc_id")  // Codigo dos itens da receita codigo fiho
	@OneToOne
	public Parceiro fabr_parc_id;


}