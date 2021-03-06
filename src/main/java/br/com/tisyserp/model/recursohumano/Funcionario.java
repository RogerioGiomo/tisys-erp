package br.com.tisyserp.model.recursohumano;

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
@Table(name = "funcionario")

public class Funcionario extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long func_id;

	public Long func_parc_id;

	@NotNull
	@Size(max = 10)
	public String func_codi;  // para importar codigos ja existentes

	@NotNull
	@Size(max = 120)
	public String func_desc;

}