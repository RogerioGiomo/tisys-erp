package  br.com.tisyserp.model.financeiro;



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
@Table(name = "centro_custo_grupo")

public class CentroCustoGrupo extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long ccgr_id;
	
	@NotNull
	@Size(max = 4)
	public String ccgr_codi;

	@NotNull
	@Size(max = 40)
	public String ccgr_desc;

	
}