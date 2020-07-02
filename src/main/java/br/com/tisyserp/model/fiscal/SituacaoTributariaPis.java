package br.com.tisyserp.model.fiscal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "Situacao_tributaria_pis")

public class SituacaoTributariaPis extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer sitpis_id;
	
	@NotNull
	@Size(max = 2)
	public String sitpis_codi;  // definido pela legislacao

	@NotNull
	@Size(max = 60)
	public String sitpis_desc;

}