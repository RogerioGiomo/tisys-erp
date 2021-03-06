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
@Table(name = "banco")

public class Banco extends PanacheEntityBase  {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long banc_id;

	@NotNull
	@Size(max = 4)
	public String banc_codi;   // codigo bancario 237-bradesco 341-itau 001 brasil

	@NotNull
	@Size(max = 60)
	public String banc_desc;

	@NotNull
	@Size(max = 10)
	public String banc_desc_redu;
	
}