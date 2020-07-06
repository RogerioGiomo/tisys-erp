package br.com.tisyserp.model.tabelaauxiliar;


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
@Table(name = "empresa")

public class Empresa extends PanacheEntityBase  {
	
	public static  Long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long empr_id;
	
	@JoinColumn(name = "empe_parc_id", referencedColumnName = "parc_id")
	@OneToOne
	public Parceiro parc_id;

	@NotNull
	@Size(max = 14)   
	public String empr_insc_muni;

	@NotNull
	@Size(max = 14)
	public String empr_insc_suframa;

	@NotNull
	@Size(max = 50)
	public String empr_site;
	
	@NotNull
	@Size(max = 1)
	public String empr_regi_trib;  // 'crt 1 2 3'
	
	@NotNull
	public Double empr_aliq_pis;

	@NotNull
	public Double empr_aliq_cofins;
	
	@NotNull
	public Double empr_aliq_Simp_naci;
	
	@NotNull
	public Double empr_aliq_Unic_Lei_trans;

	
}