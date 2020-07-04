package br.com.tisyserp.model.tabelaauxiliar;

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

import br.com.tisyserp.model.produto.Produto;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tabela_preco")

public class TabelaPreco extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer tape_id;

	@NotNull
	@Size(max = 20)
	public String tape_desc;

	@NotNull
	@Size(max = 1)
	public String ibpt_stat;  // status ativo inativo

	@JoinColumn(name = "tape_prod_id", referencedColumnName = "prod_id")
	@OneToOne
	public Produto prod_id;
	
	@NotNull
	public Double tape_preco_venda;
	
	@NotNull
	public Double tape_preco_venda_mini;
	
	@NotNull
	public Double tape_preco_venda_maxi;
	
	@NotNull
	public Double tape_preco_venda_tabe;
	
	@NotNull
	public Double tape_quan_venda;  // quantidade min para dar desconto
	
	@NotNull
	public Double tape_desc_quan;  // desconto se a quantidade > q
	
	@NotNull
	public Double tape_comi_vend;

}
