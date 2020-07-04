package br.com.tisyserp.model.venda;

import java.math.BigDecimal;
import java.util.Date;

import javax.json.bind.annotation.JsonbDateFormat;
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
@Table(name = "pedido_item")

public  class PedidoItem extends PanacheEntityBase {

	public  static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Integer pdit_ID;

	@NotNull
	public  Integer pdit_PEDI;

	@NotNull
	@Size(max = 10) 
	public  String pdit_prod_codi; 

	@NotNull
	public  BigDecimal pdit_quan;

	public  BigDecimal pdit_quan_fatu;

	@NotNull
	public  BigDecimal pdit_unit;

	@NotNull
	public  BigDecimal pdit_unit_liqu;

	@NotNull
	public  BigDecimal pdit_desc_valo;

	@NotNull
	public  BigDecimal pdit_desc_perc;

	@NotNull
	public  BigDecimal pdit_total;

	@NotNull
	public  BigDecimal pdit_total_liqu;

	public  BigDecimal pdit_aliq_icm;

	public  BigDecimal pdit_base_icm;

	public  BigDecimal pdit_icm_calc;

	@Size(max = 3) 
	public  String pdit_codi_situ_trib;

	public  BigDecimal pdit_valor_isento;

	public  BigDecimal pdit_valor_outros;

	public  BigDecimal pdit_desc_espe;   // desconto especial 

	@JsonbDateFormat(value = "dd-MM-yyyy") 
	public  Date pdit_data_incl; // data da inclusao do item no pedido

	public  BigDecimal pdit_desc_pedi;  // desconto oferecido no pedido 
	
	public  Integer pdit_empr_id;   /// codigo da empresa

	public  BigDecimal pdit_base_ipi; 
	
	public  BigDecimal pdit_valo_ipi;
	
	public  BigDecimal pdit_BASE_SUBS_TRIB;
	
	public  BigDecimal pdit_VALO_SUBS_TRIB;
	
	public  Integer pdit_cfop_codi;

	public  BigDecimal pdit_prod_medi_valo;

	public  Integer pdit_aliq_ipi;

	public  BigDecimal pdit_base_pis;

	public  BigDecimal pdit_base_cofins;

	public  BigDecimal pdit_pis_calc;

	public  BigDecimal pdit_cofins_calc;

	public  BigDecimal pdit_libe_preco;;

	public  BigDecimal pdit_valo_tabe;    // valor findo da tabela de preco ao indicar o produto

	public  BigDecimal pdit_valo_troca ;  // valor da troca quando houve devolucao

	@Size(max = 3) 
	public  String pdit_cst_pis_cofins;

	@Size(max = 3) 
	public  String pdit_cst_ipi;

	public  BigDecimal pdit_aliq_pis;

	public  BigDecimal pdit_aliq_cofins;

	public  Integer pdit_aliq_fcp;

	public  BigDecimal pdit_valor_fcp;

}