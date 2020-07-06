package br.com.tisyserp.model.producao;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.produto.Produto;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "ficha_tecnica_item")   ///   Cabecario da Ficha Tecnica

public class FichaTecnicaItem  extends PanacheEntityBase {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long fitei_id;
	
	@NotNull
	@Size(max = 60)
	public String fitei_desc;

	@JoinColumn(name = "fite_fitei_id", referencedColumnName = "fite_id")   //Codigo da Receita , codigo pai    
	@ManyToOne
	public FichaTecnica fite_fitei_id;

	@JoinColumn(name = "fitei_prod_id", referencedColumnName = "prod_id")   //Codigo da Receita , codigo pai    
	@ManyToOne
	public Produto fitei_prod_id;

	@NotNull
	public double fitei_preco_custo;  //  valor de custo do item 
	
	@NotNull
	public double fitei_quan;  //  quantidade do item para a produzir

}
