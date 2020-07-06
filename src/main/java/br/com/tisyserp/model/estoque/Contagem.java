package br.com.tisyserp.model.estoque;
import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "estoque_contagem")

public class Contagem extends PanacheEntityBase  {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cntgm_id;

	@NotNull
	@Size(max = 10)
	public String cntgm_prod_id;

    public BigDecimal cntgm_quan;
	
	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date cntgm_data;   // da da inclusao 

	public Long cntgm_empe_id;
	
	public BigDecimal cntgm_valo_cust;
}
