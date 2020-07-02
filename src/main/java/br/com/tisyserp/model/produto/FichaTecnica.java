package br.com.tisyserp.model.produto;



import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "ficha_tecnica")   ///   Cabecario da Ficha Tecnica

public class FichaTecnica  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer fite_id;
	
	public String fite_desc;
	
	public String getFite_desc() {
		return fite_desc;
	}

	public void setFite_desc(String fite_desc) {
		this.fite_desc = fite_desc;
	}

	@JoinColumn(name = "fite_prod_id", referencedColumnName = "prod_id")   //Codigo da Receita , codigo pai    
	public Produto prod_id;

	@NotNull
	public double fite_preco_custo;  //  valor total da somatoria dos itens da ficha tecnica
	
	@NotNull
	public double fite_peso_ficha;   /// peso total da ficha (pai)

}
