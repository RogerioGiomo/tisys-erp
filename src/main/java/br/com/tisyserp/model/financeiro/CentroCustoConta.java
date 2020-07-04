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
@Table(name = "centro_custo_conta")

public class CentroCustoConta extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cecon_id;
	
	@NotNull
	@Size(max = 4)
	public String cecon_conta;

	@NotNull
	@Size(max = 50)
	public String cecon_desc;
	
	@NotNull
	@Size(max = 1)
	public String cecon_debcred;
	
	@NotNull
	@Size(max = 4)
	public String cecon_conta_contabil;


}