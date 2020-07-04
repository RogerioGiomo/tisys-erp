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
@Table(name = "unidade_medida")

public class UnidadeMedida  extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long unme_id;
	
	@NotNull
	@Size(max = 10)
	public String unme_unid;
	
	@NotNull
	@Size(max = 40)
	public String unme_desc;
	
	public UnidadeMedida() {
	}

}