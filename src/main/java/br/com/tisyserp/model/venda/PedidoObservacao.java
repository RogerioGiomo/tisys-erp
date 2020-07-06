package br.com.tisyserp.model.venda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "pedido_observacao")

public  class PedidoObservacao extends PanacheEntityBase {

	public static  long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long pdob_id;
	
	@NotNull
	public Long pdob_empe_id;

	@NotNull
	@Size(max = 200)
	public String pdob_obsv_pedi;  

	@NotNull
	@Size(max = 200)
	public String pdob_obsv_nota;  

	@NotNull
	@Size(max = 200)
	public String pdob_obsv_interna;  

	@NotNull
	@Size(max = 200)
	public String pdob_obsv_financeira;  

	@NotNull
	@Size(max = 10)
	public String pdob_nota_id;  

	@NotNull
	@Size(max = 10)
	public String pdob_pedi_id;  
}