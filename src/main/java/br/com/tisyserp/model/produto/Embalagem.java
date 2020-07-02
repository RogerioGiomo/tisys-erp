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
@Table(name = "embalagem")

public class Embalagem  extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer emba_id;

	@NotNull
	@Size(max = 60)
	public String emba_desc;

	@NotNull
	@Size(max = 30)
	public String emba_desc_redu;

	@NotNull
	public Double emba_quan;

	@NotNull
	public Double emba_peso;
	
	@NotNull
	public Double emba_peso_indice;

}