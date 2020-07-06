package br.com.tisyserp.model.lote;

import java.sql.Date;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "lote")

public  class Lote extends PanacheEntityBase {

	public static  long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long lote_id;
	
	@NotNull
	@Size(max = 10)
	public String lote_prod_id;

	@NotNull
	@Size(max = 10)
	public String lote_lote;

	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date lote_data;   // Data Da Fabricao do Lote

	public Long lote_said;

	public Long lote_entr;
	
	public Long lote_atua;

	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date lote_vali;   // Data Da validade 

	public Long lote_nota_id;
	
	public Long lote_comp_id;
	
	public Long lote_empr_id;
	
	public Long stat_id;
	
}