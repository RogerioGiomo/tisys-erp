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
@Table(name = "produto_tipo")

public class ProdutoTipo  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long tipr_id;

	@NotNull
	@Size(max = 60)
	public String tiprs_desc;

	public Long getTipr_id() {
		return tipr_id;
	}

	public void setTipr_id(Long tipr_id) {
		this.tipr_id = tipr_id;
	}

	public String getTiprs_desc() {
		return tiprs_desc;
	}

	public void setTiprs_desc(String tiprs_desc) {
		this.tiprs_desc = tiprs_desc;
	}

}
