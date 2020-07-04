package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.tabelaauxiliar.Empresa;
import br.com.tisyserp.model.financeiro.SituacaoFinanceira;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_financeiro")   /// cliente_empresa
public class ParceiroFinanceiro extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer pafi_id;

	@Size(max = 4)
	public String pafi_desc;  // BRS,BRD,ITA IDENTIFICA O BANCO 

	@JoinColumn(name = "pafi_parc_id", referencedColumnName = "parc_id") 
	@OneToOne
	public Parceiro parc_id;

	@JoinColumn(name = "pafi_sifi_id", referencedColumnName = "sifi_id") 
	@OneToOne
	public SituacaoFinanceira sifi_id;

	@JoinColumn(name = "pafi_empr_id", referencedColumnName = "empr_id") 
	@OneToOne
	public Empresa empr_id;

}