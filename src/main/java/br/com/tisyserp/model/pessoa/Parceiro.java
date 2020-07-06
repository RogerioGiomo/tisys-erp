package br.com.tisyserp.model.pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.tabelaauxiliar.Regiao;
import br.com.tisyserp.model.tabelaauxiliar.Status;
import br.com.tisyserp.model.tabelaauxiliar.TipoPessoa;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro")
public class Parceiro extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long parc_id;

	public Long parc_id_ext;
	
	@NotNull
	@Size(max = 120)
	public String parc_desc;

	// @NotNull
	@Size(max = 60)
	@Column
	public String parc_fant;

	@Size(max = 14)
	public String parc_cnpj_cpf;

	@Size(max = 14)
	public String parc_ie_rg;

	@Size(max = 14)
	public String parc_insc_muni;

	@Size(max = 14)
	public String parc_suframa;

	@Size(max = 4)
	public String parc_conta_contabil;

	@JoinColumn(name = "parc_stat_id", referencedColumnName = "stat_id")
	@OneToOne
	public Status parc_stat_id;
	
	@JoinColumn(name = "parc_tipe_id", referencedColumnName = "tipe_id")
	@OneToOne
	public TipoPessoa parc_tipe_id;

	@JoinColumn(name = "regi_id", referencedColumnName = "regi_id")
	@OneToOne
	public Regiao regi_id;

	@Valid
	@Column(name = "parceiroEnde", insertable = false, updatable = false)
	@OneToMany(cascade = CascadeType.ALL,  mappedBy = "parceiro")
	public List<ParceiroEndereco> parceiroEnde = new ArrayList<ParceiroEndereco>();

	@Column(name = "parceiroContato", insertable = false, updatable = false)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "parceiro")
	public List<ParceiroContato> parceiroContato = new ArrayList<ParceiroContato>();	

}
