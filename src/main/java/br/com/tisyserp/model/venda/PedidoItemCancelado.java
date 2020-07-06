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
@Table(name = "pedido_item_Cancelado")

public  class PedidoItemCancelado extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long pditcan_id;

	@NotNull
	public  Long pditcan_pedi;

	@NotNull
	@Size(max = 10) 
	public  String pditcan_prod_codi; 

	@NotNull
	public  BigDecimal pditcan_quan;

	public  BigDecimal pditcan_quan_fatu;

	@NotNull
	public  BigDecimal pditcan_unit;

	@NotNull
	public  BigDecimal pditcan_unit_liqu;

	public  BigDecimal pditcan_desc_valo;

	public  BigDecimal pditcan_desc_perc;

	@NotNull
	public  BigDecimal pditcan_total;

	@NotNull
	public  BigDecimal pditcan_total_liqu;

	public  BigDecimal pditcan_desc_espe;   // desconto especial 

	@JsonbDateFormat(value = "dd-MM-yyyy") 
	public  Date pditcan_data_incl; // data da inclusao do item no pedido

	public  BigDecimal pditcan_desc_pedi;  // desconto oferecido no pedido 

	public  BigDecimal pditcan_libe_preco;;
}