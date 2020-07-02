package br.com.tisyserp.model.produto;



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
@Table(name = "ficha_tecnica_item")   ///   Cabecario da Ficha Tecnica

public class FichaTecnicaItem  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer fitei_id;
	
	@NotNull
	@Size(max = 60)
	public String fitei_desc;

	@JoinColumn(name = "fitei_id", referencedColumnName = "fite_id")   //Codigo da Receita , codigo pai    
	public FichaTecnica fite_id;

	@JoinColumn(name = "fitei_prod_id", referencedColumnName = "prod_id")   //Codigo da Receita , codigo pai    
	public Produto prod_id;

	@NotNull
	public double fitei_preco_custo;  //  valor total da somatoria dos itens da ficha tecnica
	
	@NotNull
	public double fitei_quan;  //  quantidade do item para a produzir

}
