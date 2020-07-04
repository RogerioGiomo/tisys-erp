package br.com.tisyserp.model.veiculo;

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
@Table(name = "veiculo")

public class Veiculo extends PanacheEntityBase {

	public static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long veic_id;

	@NotNull
	@Size(max = 60)
	public String veic_desc;
	
	@JoinColumn(name = "veic_veimar_id", referencedColumnName = "veimar_id" )
	@OneToOne
	public VeiculoMarca veic_veimar_id;
	
	@JoinColumn(name = "veic_veimod_id", referencedColumnName = "veimod_id" )
	@OneToOne
	public VeiculoModelo veic_veimod_id;

	@JoinColumn(name = "veic_veitip_id", referencedColumnName = "veitip_id" )
	@OneToOne
	public VeiculoTipo veic_veitip_id;

	@NotNull
	@Size(max = 10)
	public String veic_combus;
	
	@NotNull
	@Size(max = 10)
	public String veic_Placa;
	
	@NotNull
	@Size(max = 14)
	public String veic_renavan;
	
	@NotNull
	@Size(max = 60)
	public String veic_chassi;
	
	@NotNull
	@Size(max = 20)
	public String veic_cor;
	
	@NotNull
	@Size(max = 4)
	public String veic_ano_mode;

	@NotNull
	@Size(max = 4)
	public String veic_ano_Fabr;

	@NotNull
	public Double veic_tara;

	@NotNull
	@Size(max = 2)
	public String veic_tipo_rodagem;

	@NotNull
	@Size(max = 2)
	public String veic_tipo_carroceria;

	@NotNull
	@Size(max = 2)
	public String veic_uf_placa;


}	