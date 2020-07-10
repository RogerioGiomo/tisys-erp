package  br.com.tisyserp.model.banco;

import java.math.BigDecimal;
import java.sql.Date;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "movimento_caixa")  

public class MovimentoCaixa extends PanacheEntityBase  {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long movcxa_id;

	@Size(max = 20)
	@Column(columnDefinition = "String default ''")
	public String movcxa_documento;

	@NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date movcxa_data;   
	
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal movcxa_valo;

	@Size(max = 120)
	@Column(columnDefinition = "String default ''")
	public String movcxa_historico;

	@Size(max = 2)
	@Column(columnDefinition = "String default ''")
	public String movcxa_timo_id;    // tipo movimento

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal movcxa_valo_credito;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal movcxa_valo_debito;

}