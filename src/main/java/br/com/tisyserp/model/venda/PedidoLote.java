package br.com.tisyserp.model.venda;

import java.math.BigDecimal;
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
@Table(name = "pedido_lote")
public class PedidoLote extends PanacheEntityBase {

	public static  long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long pelo_id;
	
	@NotNull
	public Integer pelo_pedi_id;  

	@NotNull
	@Size(max = 10)
	public String pelo_nota_id;  

	@NotNull
	@Size(max = 10)
	public String pelo_prod_codi;  

    @NotNull
	@Size(max = 10)
	public String pelo_lote;  
	
	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date pelo_data;  // da da inclusao

	@NotNull
	public  BigDecimal pelo_quan;

    @NotNull
	public Integer pelo_empe_id;  

    @NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date pelo_vali;  // data da validade do lote

    @NotNull
	public Integer pelo_lote_id;
	
}