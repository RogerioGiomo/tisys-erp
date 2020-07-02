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
@Table(name = "vendedor")
//
public class Vendedor extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer vend_id;

	@NotNull
	@Size(max = 120)
	public String vend_desc;

	@NotNull
	public Double vend_comi_valor;
	
	@JoinColumn(name = "vend_func_id", referencedColumnName = "func_id" )
	@OneToOne
	public Funcionario func_id;

	@JoinColumn(name = "vend_supe_id", referencedColumnName = "supe_id")  // vendeddor
	public Supervisor supe_id;
	
	@NotNull
	@Size(max = 1)
	public String vend_status;
	
	@NotNull
	@Size(max = 1)
	public String vend_gera_verba;
	
	@NotNull
	@Size(max = 50)
	public String vend_email;
	
	@JoinColumn(name = "vend_gera_id", referencedColumnName = "func_id")
	@OneToOne
	public Funcionario func_id_gere;

	@JoinColumn(name = "vend_supe_id", referencedColumnName = "func_id")
	@OneToOne
	public Funcionario func_id_supe;

}

