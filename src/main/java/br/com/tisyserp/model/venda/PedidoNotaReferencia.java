package br.com.tisyserp.model.venda;

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
@Table(name = "pedido_nota_referencia")

public  class PedidoNotaReferencia extends PanacheEntityBase {

    public  static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public  Long pdnotref_id;

	@NotNull
	public  Long pdnotref_pedi_id;

    @NotNull
	@Size(max = 44) 
	public  String pdnotref_chave;
    
}