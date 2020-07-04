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
@Table(name = "regiao")

public class Regiao extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long regi_id;
	
	@NotNull
	@Size(max = 60)
	public String regi_desc;

	public Long getRegi_id() {
		return regi_id;
	}

	public void setRegi_id(Long regi_id) {
		this.regi_id = regi_id;
	}

	public String getRegi_desc() {
		return regi_desc;
	}

	public void setRegi_desc(String regi_desc) {
		this.regi_desc = regi_desc;
	}



}