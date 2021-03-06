package br.com.tisyserp.model.compra;

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
@Table(name = "compra_item")

public  class CompraItem extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long copIte_id;

	@NotNull
	public  Long copIte_pedi;

	@NotNull
	@Size(max = 10) 
	public  String copIte_prod_codi; 

	@NotNull
	public  BigDecimal copIte_quan;

	public  BigDecimal copIte_quan_fatu;

	@NotNull
	public  BigDecimal copIte_unit;

	@NotNull
	public  BigDecimal copIte_unit_liqu;

	public  BigDecimal copIte_desc_valo;

	public  BigDecimal copIte_desc_perc;

	@NotNull
	public  BigDecimal copIte_total;

	@NotNull
	public  BigDecimal copIte_total_liqu;

	public  BigDecimal copIte_desc_espe;   // desconto especial 

	@JsonbDateFormat(value = "dd-MM-yyyy") 
	public  Date copIte_data_incl; // data da inclusao do item no pedido

	public  BigDecimal copIte_desc_pedi;  // desconto oferecido no pedido 

	public  BigDecimal copIte_libe_preco;;


}