package br.com.tisyserp.model.tabelaauxiliar;
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
@Table(name = "tipo_emissao_nota")
public class TipoEmissaoNota extends PanacheEntityBase  {

	public static final Long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long tiemno_id;
	
	@NotNull
	@Size(max = 60)
	public String tiemno_desc;

}
