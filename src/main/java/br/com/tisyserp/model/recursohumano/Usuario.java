package br.com.tisyserp.model.recursohumano;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "usuario")

public class Usuario extends PanacheEntityBase {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long usua_id;
	
	@JoinColumn(name = "usua_func_id", referencedColumnName = "func_id") 
	@ManyToOne
	public Funcionario func_id;

	@NotNull
	@Size(max = 20)
	public String usua_desc;

	@NotNull
	@Size(max = 60)
	public String usua_login;
	
	@NotNull
	@Size(max = 10)
	public String usua_senha;
	
	@NotNull
	@Size(max = 1)
	public String usua_ativo;
	
}
