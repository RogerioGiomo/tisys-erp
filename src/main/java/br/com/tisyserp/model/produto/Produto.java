package br.com.tisyserp.model.produto;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.pessoa.Parceiro;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "produto")

public class Produto  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer prod_id;
	
	@NotNull
	@Size(max = 20)
	public String prod_codi_prop;  // Codigo proprio / codigo determinado pela empresa 

	@NotNull
	@Size(max = 120)
	public String prod_desc;

	@NotNull
	@Size(max = 80)
	public String prod_desc_redu;

	@JoinColumn(name = "prod_fabr_id", referencedColumnName = "parc_id")  // Codigo dos itens da receita codigo fiho
	public Parceiro parc_id;
	
	@JoinColumn(name = "prod_grup_id", referencedColumnName = "grup_id")  // Codigo dos itens da receita codigo fiho
	public ProdutoGrupo grup_id;

	@JoinColumn(name = "prod_fami_id", referencedColumnName = "fami_id")  // Codigo dos itens da receita codigo fiho
	public ProdutoFamilia fami_id;

	@JoinColumn(name = "prod_emba_id", referencedColumnName = "emba_id")  // Codigo dos itens da receita codigo fiho
	public Embalagem emba_id;
	
	@JoinColumn(name = "prod_unme_id", referencedColumnName = "unme_id")  // Codigo dos itens da receita codigo fiho
	public UnidadeMedida unme_id;

	@JoinColumn(name = "prod_tipr_id", referencedColumnName = "tipr_id")  // Tipo do Produto diferente do Sped
	public ProdutoTipo tipr_id;

	@JoinColumn(name = "prod_tiprs_id", referencedColumnName = "tiprs_id")  // Tipo do Produto diferente do Sped
	public ProdutoSpedTipo tiprs_id;

	//@JoinColumn(name = "prod_orig_id", referencedColumnName = "orig_id")  // Tipo do Produto diferente do Sped
	//public ProdutoOrigem orig_id;

	@JoinColumn(name = "prod_prfin_id", referencedColumnName = "prfin_id")  // Tipo do Produto diferente do Sped
	public ProdutoFinalidade prfin_id;

	@NotNull
	@Size(max = 16)
	public String prod_barr_ean;

	@NotNull
	@Size(max = 10)
	public String prod_ncm;
	
	@NotNull
	public Double prod_prec_venda;

	@NotNull
	public Double prod_prec_custo;
	
	@NotNull
	public Double prod_prec_compra;

	@NotNull
	public Double prod_prec_medio;
	
	@NotNull
	public Double prod_prec_tabela;  // geralmente  é o preco minimo e ou ref. ao preco de venda quando se pagacomissao entre a diferencao do preco de venda
	
	@NotNull
	public Double prod_prec_ulti_custo;
	
	@NotNull
	public Double prod_prec_mini;
	
	@NotNull
	public Double prod_prec_maxi;

	@NotNull
	public Double prod_marg_venda;

	@NotNull
	public Double prod_peso_liqu;
	
	@NotNull
	public Double prod_peso_brut;
	
	@NotNull
	public Double prod_esto_mini;

	@NotNull
	public Double prod_esto_maxi;

	@NotNull
	public Double prod_esto_segu;   // Estoque de segurança

	@NotNull
	public Date prod_data_cada;   // data do cadastro do produto
	
	@NotNull
	public Date prod_data_alte;  // data a ultima alteraçao
	
	@NotNull
	public Date prod_data_movi;  // data do ultimo movimento
	
	@NotNull
	public Date prod_data_comp;  // data do ultima compra
	
	@NotNull
	@Size(max = 50)
	public String prod_usua_desc;  // ultimo usuario que fez a alteraçao no cadastro

	@NotNull
	public Integer prod_dias_entr;  // quantiade de dias que o fornecedor demora para entregar a mercadoria - lead time

	@NotNull
	public Integer prod_dema_media;  // demanda media 

	@NotNull
	public Integer prod_temp_dema_media;  // demanda media em dias ou meses para calculo da demanda media 

	@NotNull
	public String prod_uso_interno;  // informa se o produto é de uso interno, nao é para venda 
	
	@NotNull
	public String prod_stat;  // staus do produto ativo / inativo S/N 

	@NotNull
	@Size(max = 10)
	public String prod_local;   // localizacao interna do produto no estoque 
	
	@NotNull
	@Size(max = 14)
	public String prod_cest;   // codigo codigo estadual da situacao tributaria  CEST 
	
	@NotNull
	@Size(max = 20)
	public String prod_codi_bem_ativo;   // codigo do bem indicado para o ativo imobilizado da empresa 

	@NotNull
	@Size(max = 4)
	public String prod_codi_contabil;   // codigo contabil para exportacao de dados contabilidade 
	
	@NotNull
	public Double prod_comi_vend;  /// Comissao de venda que o produto pode gerar para o vendedor
	
	@NotNull
	@Size(max = 14)
	public String prod_ean_trib;   // codigo de barras para unidade tributavek  

//   cubagem do produto 
	@NotNull
	public Double prod_altura;  /// Altura da embalagem 

	@NotNull
	public Double prod_largura;  /// largura da embalagem
	
	@NotNull
	public Double prod_comprimento;  /// comprimento da embalagem
	
		
}
