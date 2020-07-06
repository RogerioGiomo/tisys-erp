package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "cidade", indexes = {
	       @Index(name = "idxcida_uf", columnList = "cida_uf"),
	       @Index(name = "idxcida_ibge", columnList = "cida_ibge"),
	       @Index(name = "idxcida_cida", columnList = "cida_cida")})

public class Cidade extends PanacheEntityBase {
	public static  Long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cida_id;

	@Size(max = 2)
	public String cida_uf;
	
	@Size(max = 10)
	public String cida_ibge;
	
	@Size(max = 120)
	//@Index(name="idxcida_cida", columnList = "cida_cida")
	public String cida_cida;


}
