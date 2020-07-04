package br.com.tisyserp.model.produto;


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
@Table(name = "produto_tipo_sped")

public class ProdutoSpedTipo  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long tiprs_id;

	@NotNull
	@Size(max = 2)
	public String tiprs_codi_sped;
	
	@NotNull
	@Size(max = 60)
	public String tiprs_desc;

}
