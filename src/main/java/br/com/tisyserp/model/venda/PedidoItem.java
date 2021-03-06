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

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long pdit_id;

	@NotNull
	public  Long pdit_pedi;

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

	public  BigDecimal pdit_desc_valo;

	public  BigDecimal pdit_desc_perc;

	@NotNull
	public  BigDecimal pdit_total;

	@NotNull
	public  BigDecimal pdit_total_liqu;

	public  BigDecimal pdit_desc_espe;   // desconto especial 

	@JsonbDateFormat(value = "dd-MM-yyyy") 
	public  Date pdit_data_incl; // data da inclusao do item no pedido

	public  BigDecimal pdit_desc_pedi;  // desconto oferecido no pedido 

	public  BigDecimal pdit_libe_preco;;


}