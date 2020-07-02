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

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "descricao_tecnica")

public class DescricaoTecnica  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer destec_id;
	
	@NotNull
	@Size(max = 120)
	public String destec_desc;

	@JoinColumn(name = "destec_prod_id", referencedColumnName = "prod_id")  // Codigo dos itens da receita codigo fiho
	public Produto prod_id;
	
}