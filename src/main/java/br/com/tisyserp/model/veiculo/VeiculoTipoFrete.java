package br.com.tisyserp.model.veiculo;

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
@Table(name = "veiculo_tipo_frete")
public class VeiculoTipoFrete extends PanacheEntityBase  {
	
	public static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer veitif_id;
	
	@NotNull
	@Size(max = 60)
	public String veitif_desc;
	
}
