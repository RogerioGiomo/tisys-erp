package br.com.tisyserp.model.produto;

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
@Table(name = "produto_fornecedor")

public class ProdutoFornecedor  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer prfo_id;
	
	@NotNull
	@Size(max = 120)
	public String prfo_desc;

	@JoinColumn(name = "prfo_prod_id", referencedColumnName = "prod_id")  // Codigo dos itens da receita codigo fiho
	public Produto prod_id;

	@JoinColumn(name = "prfo_parc_id", referencedColumnName = "parc_id")  // Codigo dos itens da receita codigo fiho
	public Parceiro parc_id;
	
	@JoinColumn(name = "prod_unme_id", referencedColumnName = "unme_id")  // Codigo dos itens da receita codigo fiho
	public UnidadeMedida unme_id;

	@JoinColumn(name = "prod_emba_id", referencedColumnName = "emba_id")  // Codigo dos itens da receita codigo fiho
	public Embalagem emba_id;

	@NotNull
	@Size(max = 20)
	public String prfo_codi_prod_forn;

}