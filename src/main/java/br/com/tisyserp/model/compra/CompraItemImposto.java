package br.com.tisyserp.model.compra;

import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "Compra_Item_Imposto")

public  class CompraItemImposto extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long cpIteImp_ID;

	@NotNull
	public  Long cpIteImp_cpIteImp_id;

	public  BigDecimal cpIteImp_aliq_icm;

	public  BigDecimal cpIteImp_base_icm;

	public  BigDecimal cpIteImp_icm_calc;

	@Size(max = 3) 
	public  String cpIteImp_codi_situ_trib;

	public  BigDecimal cpIteImp_valor_isento;

	public  BigDecimal cpIteImp_valor_outros;

	public  BigDecimal cpIteImp_desc_pedi;  // desconto oferecido no pedido 
	
	public  BigDecimal cpIteImp_base_ipi; 
	
	public  BigDecimal cpIteImp_valo_ipi;
	
	public  BigDecimal cpIteImp_base_subs_trib;
	
	public  BigDecimal cpIteImp_valo_subs_trib;
	
	public  Long cpIteImp_cfop_codi;

	public  BigDecimal cpIteImp_prod_medi_valo;

	public  Long cpIteImp_aliq_ipi;

	public  BigDecimal cpIteImp_base_pis;

	public  BigDecimal cpIteImp_base_cofins;

	public  BigDecimal cpIteImp_pis_calc;

	public  BigDecimal cpIteImp_cofins_calc;

	@Size(max = 3) 
	public  String cpIteImp_cst_pis_cofins;

	@Size(max = 3) 
	public  String cpIteImp_cst_ipi;

	public  BigDecimal cpIteImp_aliq_pis;

	public  BigDecimal cpIteImp_aliq_cofins;

	public  Long cpIteImp_aliq_fcp;

	public  BigDecimal cpIteImp_valor_fcp;

}