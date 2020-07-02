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
@Table(name = "produto_cotacao")

public class ProdutoCotacao  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer prco_id;
	
	@JoinColumn(name = "prco_prod_id", referencedColumnName = "prod_id")  // Codigo dos itens da receita codigo fiho
	public Produto prod_id;

	@JoinColumn(name = "prco_parc_id", referencedColumnName = "parc_id")  // Codigo dos itens da receita codigo fiho
	public Parceiro parc_id;

	@NotNull
	@Size(max = 1)
	public String prco_forn_prin;  ///  fornecedor principal para cotaçao


}