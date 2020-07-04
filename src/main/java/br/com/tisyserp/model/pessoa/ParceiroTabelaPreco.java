package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.tabelaauxiliar.Empresa;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_tabela_preco")

public class ParceiroTabelaPreco extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long ptabpr_id;
	
	@JoinColumn(name = "ptabpr_empr_id", referencedColumnName = "empr_id")
	@OneToOne
	public Empresa empr_id;

	public Long ptabpr_prod_id;
	// @JoinColumn(name = "ptabpr_prod_id", referencedColumnName = "prod_id")  // Codigo dos itens da receita codigo fiho
	// public Produto ptabpr_prod_id;

	@NotNull
	@Size(max = 12)
	public String ptabpr_desc;
	
	@NotNull
	public Double ptabpr_preco_venda;  /// preco a ser utilizada para venda na tabela
	
	@NotNull
	public Double ptabpr_preco_mini;   //  preco minimo para venda
	
	@NotNull
	public Double ptabpr_preco_max;   //  preco maximo
	
	@NotNull
	public Double ptabpr_preco_tabela; // preco de base para referencia de valor
	
	@NotNull
	public Double ptabpr_desco; //  desconto para quantidades a partir de quando tiver ou desconto permitido
	
	@NotNull
	public Double ptabpr_quant; //  quandidade minimo para oferecer desconto.
	
	@NotNull
	public Double ptabpr_comi_venda; //  valor de comissao para o vendedor

}
