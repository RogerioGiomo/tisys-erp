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
@Table(name = "situacao_financeiro")
public class SituacaoFinanceira extends PanacheEntityBase  {

	public static  Long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long sifi_id;

	@NotNull
	@Size(max = 4)
	public String sifi_codi;

	@NotNull
	@Size(max = 60)
	public String sifi_desc;
	
}