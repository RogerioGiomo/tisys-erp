package br.com.tisyserp.model.venda;

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
@Table(name = "Nota_Item_Imposto")

public  class NotaItemImposto extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long notiteImp_ID;

	@NotNull
	public  Long notiteImp_notiteImp_id;

	public  BigDecimal notiteImp_aliq_icm;

	public  BigDecimal notiteImp_base_icm;

	public  BigDecimal notiteImp_icm_calc;

	@Size(max = 3) 
	public  String notiteImp_codi_situ_trib;

	public  BigDecimal notiteImp_valor_isento;

	public  BigDecimal notiteImp_valor_outros;

	public  BigDecimal notiteImp_desc_pedi;  // desconto oferecido no pedido 
	
	public  BigDecimal notiteImp_base_ipi; 
	
	public  BigDecimal notiteImp_valo_ipi;
	
	public  BigDecimal notiteImp_base_subs_trib;
	
	public  BigDecimal notiteImp_valo_subs_trib;
	
	public  Long notiteImp_cfop_codi;

	public  BigDecimal notiteImp_prod_medi_valo;

	public  Long notiteImp_aliq_ipi;

	public  BigDecimal notiteImp_base_pis;

	public  BigDecimal notiteImp_base_cofins;

	public  BigDecimal notiteImp_pis_calc;

	public  BigDecimal notiteImp_cofins_calc;

	@Size(max = 3) 
	public  String notiteImp_cst_pis_cofins;

	@Size(max = 3) 
	public  String notiteImp_cst_ipi;

	public  BigDecimal notiteImp_aliq_pis;

	public  BigDecimal notiteImp_aliq_cofins;

	public  Long notiteImp_aliq_fcp;

	public  BigDecimal notiteImp_valor_fcp;

}