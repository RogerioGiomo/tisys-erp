package br.com.tisyserp.model.recursohumano;



import javax.json.bind.annotation.JsonbTransient;
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
@Table(name = "usuario_acesso")

public class UsuarioAcesso extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long usac_id;
	
	@JsonbTransient
	@JoinColumn(name = "usac_id", referencedColumnName = "usua_id") 
	@OneToOne
	public Usuario usua_id;
	
	@NotNull
	@Size(max = 1)
	public String usac_incluir;  

	@NotNull
	@Size(max = 1)
	public String usac_editar;
	
	@NotNull
	@Size(max = 1)
	public String usac_excluir;


}
