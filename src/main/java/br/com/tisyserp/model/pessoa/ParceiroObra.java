package br.com.tisyserp.model.pessoa;


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

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_obra")

public class ParceiroObra extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer paob_id;

	@NotNull
	@Size(max = 60)
	public String paob_desc; /// Nome da Obra

	@Size(max = 120)
	public String paob_logr;

	@Size(max = 60)
	public String paob_nume;

	@Size(max = 60)
	public String paob_comp;

	@Size(max = 120)
	public String paob_bair;

	@Size(max = 2)
	public String paob_uf;
	
	@Size(max = 9)
	public String paob_cep;

	public Integer paob_parc_id;

	@JoinColumn(name = "paob_pais_id", referencedColumnName = "pais_id")
	@OneToOne
	public Pais paob_pais_id;

	@JoinColumn(name = "paob_cida_id", referencedColumnName = "cida_id")
	@OneToOne
	public Cidade paob_cida_id;

}
