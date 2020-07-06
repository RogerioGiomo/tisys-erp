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
@Table(name = "nota_item")

public  class NotaItem extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long notite_id;

	@NotNull
	public  Long notite_pedi;

	@NotNull
	@Size(max = 10) 
	public  String notite_prod_codi; 

	@NotNull
	public  BigDecimal notite_quan;

	public  BigDecimal notite_quan_fatu;

	@NotNull
	public  BigDecimal notite_unit;

	@NotNull
	public  BigDecimal notite_unit_liqu;

	public  BigDecimal notite_desc_valo;

	public  BigDecimal notite_desc_perc;

	@NotNull
	public  BigDecimal notite_total;

	@NotNull
	public  BigDecimal notite_total_liqu;

	public  BigDecimal notite_desc_espe;   // desconto especial 

	@JsonbDateFormat(value = "dd-MM-yyyy") 
	public  Date notite_data_incl; // data da inclusao do item no pedido

	public  BigDecimal notite_desc_pedi;  // desconto oferecido no pedido 

}