package br.com.tisyserp.model.pessoa;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "parceiro_endereco", indexes = {
	       @Index(name = "idpaen_pate_id", columnList = "paen_pate_id"),
	       @Index(name = "idpaen_pais_id", columnList = "paen_pais_id"),
	       @Index(name = "idxpaen_cida_id", columnList = "paen_cida_id"),
	       @Index(name = "idxpaen_parc_id", columnList = "paen_parc_id")})

public class ParceiroEndereco extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long paen_id;
	@Size(max = 120)
	public String paen_logr;
	@Size(max = 60)
	public String paen_nume;
	@Size(max = 60)
	public String paen_comp;
	@Size(max = 120)
	public String paen_bair;
	@Size(max = 10)
	public String paen_codi_ibge;

	@Size(max = 2)
	public String paen_uf;
	@Size(max = 9)
	public String paen_cep;
	
	public Long paen_parc_id;
	// @Size(max = 4)

	// public Long paen_pais_id;
	@JoinColumn(name = "paen_pais_id", referencedColumnName = "pais_id")
	@OneToOne
	public Pais paen_pais_id;

	@JoinColumn(name = "paen_pate_id", referencedColumnName = "pate_id")
	@OneToOne
	public ParceiroTipoEndereco paen_pate_id;

	@JoinColumn(name = "paen_cida_id", referencedColumnName = "cida_id" )
	@OneToOne
	public Cidade paen_cida_id;

	@JsonbTransient
	@OneToOne  //(cascade = CascadeType.ALL)
	@JoinColumn(name = "paen_parc_id", updatable=false, insertable=false) // , referencedColumnName = "parc_id")
	public Parceiro parceiro;

}
