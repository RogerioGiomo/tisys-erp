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
@Table(name = "pedido_item_devolvido")

public  class PedidoItemDevolvido extends PanacheEntityBase {

	public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long pditdev_id;

	@NotNull
	public  Long pditdev_pedi;

	@NotNull
	@Size(max = 10) 
	public  String pditdev_prod_codi; 

	@NotNull
	public  BigDecimal pditdev_quan;

	public  BigDecimal pditdev_quan_fatu;

	@NotNull
	public  BigDecimal pditdev_unit;

	@NotNull
	public  BigDecimal pditdev_unit_liqu;

	public  BigDecimal pditdev_desc_valo;

	public  BigDecimal pditdev_desc_perc;

	@NotNull
	public  BigDecimal pditdev_total;

	@NotNull
	public  BigDecimal pditdev_total_liqu;

	public  BigDecimal pditdev_desc_espe;   // desconto especial 

	@JsonbDateFormat(value = "dd-MM-yyyy") 
	public  Date pditdev_data_incl; // data da inclusao do item no pedido

	public  BigDecimal pditdev_desc_pedi;  // desconto oferecido no pedido 

	public  BigDecimal pditdev_libe_preco;;
}