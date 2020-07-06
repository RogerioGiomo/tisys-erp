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
@Table(name = "tipo_movimento")

public class TipoMovimento extends PanacheEntityBase {

	public static  long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long timo_id;
	
	@NotNull
	@Size(max = 80)
	public String timo_desc;

	@NotNull
	@Size(max = 40)
	public String timo_desc_redu;

	@NotNull
	@Size(max = 1)
	public String timo_tipo_movimento;  // (E)ntrada ou (S)aida
	
	@NotNull
	@Size(max = 1)
	public String timo_esto_movi;  // movimenta estoque
	
	@NotNull
	@Size(max = 1)
	public String timo_calc_icms;  // calcula_icms
	
	@NotNull
	@Size(max = 1)
	public String timo_calc_ipi;  // calcula_ipi

	@NotNull
	@Size(max = 1)
	public String timo_vencimentos;  // tem vencimentos / parcelamento / financeiro

	@NotNull
	@Size(max = 1)
	public String timo_item;  // tem itens no pedido
	
	@NotNull
	@Size(max = 1)
	public String timo_atua_prec_compra;  // atualiza preco de compra/reposicao (compras)
	
	@NotNull
	@Size(max = 1)
	public String timo_calc_pis_cofins;  // se calcula pis ou cofins

	@NotNull
	@Size(max = 1)
	public String timo_tipo_venda;  // tipo do movimento no sistema ((v)enda, (B)onificacao, (P)roduao, (Remessa) Devolucao

	@NotNull
	@Size(max = 1)
	public String timo_vale;  // gera um vale debito ou credito na venda ou na compra
	
	
}