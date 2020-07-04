package  br.com.tisyserp.model.financeiro;


import java.util.Date;

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

import br.com.tisyserp.model.tabelaauxiliar.Empresa;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Table(name = "conta_bancaria")

public class ContaBancaria extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer coba_id;
	
	@JoinColumn(name = "coba_empr_id", referencedColumnName = "empr_id")
	@OneToOne
	public Empresa empr_id;


	@JoinColumn(name = "coba_banc_id", referencedColumnName = "banc_id")
	@OneToOne
	public Banco banc_id;

	@NotNull
	@Size(max = 5)
	public String coba_agen_numero;

	@NotNull
	@Size(max = 40)
	public String coba_agen_desc;
	
	@NotNull
	@Size(max = 20)
	public String coba_nume_conta;

	@NotNull
	@Size(max = 40)
	public String coba_desc_conta;

	@NotNull
	@Size(max = 10)
	public String coba_conta_contabil;  //  conta conabil para exportacao de dados contabilidade
	
	@NotNull
	@Size(max = 1)
	public String coba_usa_cnab;   // identifica se a conta tem cnab autoriado para emissao
	
	@NotNull
	@Size(max = 20)
	public String coba_pref_arqv_cnab; // nome do arquivo para envio ao banco
	
	@NotNull
	@Size(max = 1)
	public String coba_stat;  // ativo / inativo'
	
	@NotNull
	public Date coba_data_abertura;  // ativo / inativo'

	@NotNull
	public Double coba_juros_Dia ;

	@NotNull
	public Double coba_multa;
	
	@NotNull
	public Integer coba_prox_bole;
	
	@Size(max = 10)
	public String coba_carteira_banco;  // codigo da carteira para o cnab

	@NotNull
	@Size(max = 1)
	public String coba_numro_sequ_arquivo;  // utilizado para o bradesco no cnab
	
	@Size(max = 10)
	public String coba_contrato_banco;  // numero do contrato para o cnab
	
	@Size(max = 10)
	public String coba_convenio_banco;  // numero do convenio para o cnab

	@Size(max = 60)
	public String coba_local_arqv_envio_banco;  // local onde o arquivo de envio da cobranca bancaria esta.

	@Size(max = 60)
	public String coba_local_arqv_remessa_banco;  // local onde o arquivo de envio da remessa de retorno para baixa 

}