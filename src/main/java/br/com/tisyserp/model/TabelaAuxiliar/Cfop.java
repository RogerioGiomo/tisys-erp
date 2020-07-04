package br.com.tisyserp.model.tabelaauxiliar;

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
@Table(name = "CFOP")

public class Cfop extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cfop_id;
	
	@NotNull
	@Size(max = 4)
	public String cfop_codi;

	@NotNull
	@Size(max = 500)
	public String cfop_desc;

	@NotNull
	@Size(max = 200)
	public String cfop_desc_redu;

	
}
