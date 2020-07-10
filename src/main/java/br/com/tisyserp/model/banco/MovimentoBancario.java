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
@Table(name = "movimento_bancario")  

public class MovimentoBancario extends PanacheEntityBase  {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long movban_id;

	@NotNull
	@Size(max = 20)
	@Column(columnDefinition = "String default ''")
	public String movban_conta;   // codigo bancario 237-bradesco 341-itau 001 brasil

	@NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date movban_data;   

	@Size(max = 20)
	@Column(columnDefinition = "String default ''")
	public String movban_documento;
	
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal movban_valo;

	@Size(max = 1)
	public String movban_sinal;

	@Size(max = 120)
	@Column(columnDefinition = "String default ''")
	public String movban_historico;
	
	@Size(max = 1)
	public String movban_conci;

	public Long movban_empr_id;

	@Size(max = 20)
	@Column(columnDefinition = "String default ''")
	public Long movban_cecon_conta;
	
	@Size(max = 1)
	public String movban_movban_tipo;

	@NotNull
	@Size(max = 20)
	@Column(columnDefinition = "String default ''")
	public String movban_conta_dest_trans;   // conta par ondehouve a transferencia
    
}