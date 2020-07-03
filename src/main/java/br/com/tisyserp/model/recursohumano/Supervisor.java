package br.com.tisyserp.model.recursohumano;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "supervisor")

public class Supervisor extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer supe_id;
	
	//public Integer supe_func_id;
	@JoinColumn(name = "supe_func_id", referencedColumnName = "func_id" )
	@OneToOne
	public Funcionario supe_func_id;

	@NotNull
	@Size(max = 20)
	public String supe_desc;

	@NotNull
	@Size(max = 1)
	public String supe_status;  // ativo ou inativo

}