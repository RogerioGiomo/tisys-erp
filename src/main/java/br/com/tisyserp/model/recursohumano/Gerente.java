package br.com.tisyserp.model.recursohumano;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "gerente")

public class Gerente extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer gere_id;
	
	@JoinColumn(name = "gere_func_id", referencedColumnName = "func_id") 
	public Funcionario func_id;

	@NotNull
	@Size(max = 20)
	public String gere_desc;
	
	@NotNull
	@Size(max = 1)
	public String gere_status;  // ativo ou inativo

}