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
@Table(name = "pedido_item_imposto")

public  class PedidoItemImposto extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long pditimp_ID;

	@NotNull
	public  Long pditimp_pditimp_id;

	public  BigDecimal pditimp_aliq_icm;

	public  BigDecimal pditimp_base_icm;

	public  BigDecimal pditimp_icm_calc;

	@Size(max = 3) 
	public  String pditimp_codi_situ_trib;

	public  BigDecimal pditimp_valor_isento;

	public  BigDecimal pditimp_valor_outros;

	public  BigDecimal pditimp_desc_pedi;  // desconto oferecido no pedido 
	
	public  BigDecimal pditimp_base_ipi; 
	
	public  BigDecimal pditimp_valo_ipi;
	
	public  BigDecimal pditimp_base_subs_trib;
	
	public  BigDecimal pditimp_valo_subs_trib;
	
	public  Long pditimp_cfop_codi;

	public  BigDecimal pditimp_prod_medi_valo;

	public  Long pditimp_aliq_ipi;

	public  BigDecimal pditimp_base_pis;

	public  BigDecimal pditimp_base_cofins;

	public  BigDecimal pditimp_pis_calc;

	public  BigDecimal pditimp_cofins_calc;

	@Size(max = 3) 
	public  String pditimp_cst_pis_cofins;

	@Size(max = 3) 
	public  String pditimp_cst_ipi;

	public  BigDecimal pditimp_aliq_pis;

	public  BigDecimal pditimp_aliq_cofins;

	public  Long pditimp_aliq_fcp;

	public  BigDecimal pditimp_valor_fcp;

}