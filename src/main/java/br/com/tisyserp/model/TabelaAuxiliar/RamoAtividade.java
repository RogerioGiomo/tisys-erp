package br.com.tisyserp.model.tabelaauxiliar;



import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "ramo_atividade")

public class RamoAtividade extends PanacheEntityBase  {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long tamo_id;

	@Size(max = 20)
	public String ramo_desc;  

}
