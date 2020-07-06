package br.com.tisyserp.model.compra;

import java.sql.Date;
import java.sql.Time;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.tisyserp.model.financeiro.CondicaoPagamento;
import br.com.tisyserp.model.fiscal.SerieFiscal;
import br.com.tisyserp.model.recursohumano.Motorista;
import br.com.tisyserp.model.recursohumano.Supervisor;
import br.com.tisyserp.model.recursohumano.Usuario;
import br.com.tisyserp.model.recursohumano.Vendedor;
import br.com.tisyserp.model.pessoa.Parceiro;
import br.com.tisyserp.model.pessoa.ParceiroObra;
import br.com.tisyserp.model.pessoa.ParceiroTransportadora;
import br.com.tisyserp.model.tabelaauxiliar.Empresa;
import br.com.tisyserp.model.tabelaauxiliar.TipoEmissaoNota;
import br.com.tisyserp.model.veiculo.Veiculo;
import br.com.tisyserp.model.veiculo.VeiculoTipoFrete;
import br.com.tisyserp.model.venda.TipoMovimento;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "compra_Pedido")
public class CompraPedido extends PanacheEntityBase {
	
	public static  long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long comp_id;
	
	@NotNull
	@Size(max = 10)
	public String comp_nume;  // numero pedido que pode ser alfanumerico criado pelo sistema ou o mesmo do id

	@NotNull
	@Size(max = 1)
	public String comp_tipo;  // tidpo de pedido - Orcamento / Pedido / ....

	@JoinColumn(name = "comp_parc_id", referencedColumnName = "parc_id")   // codigo do cliente 
	@ManyToOne
	public Parceiro comp_parc_id;

	@JoinColumn(name = "comp_timo_id", referencedColumnName = "timo_id")   // tipo de movimento
	@ManyToOne
	public TipoMovimento timo_id;
	
	@JoinColumn(name = "comp_patr_id", referencedColumnName = "patr_id") // transportadora 
	@ManyToOne
	public ParceiroTransportadora comp_patr_id;
	
	@JoinColumn(name = "comp_vend_id", referencedColumnName = "vend_id")  // vendeddor
	@ManyToOne
	public Vendedor vend_id;

	@JoinColumn(name = "comp_supe_id", referencedColumnName = "supe_id")  // vendeddor
	@ManyToOne
	public Supervisor supe_id;

	@JoinColumn(name = "comp_usua_id", referencedColumnName = "usua_id")  // usuario
	@ManyToOne
	public Usuario usua_id;
	
	@JoinColumn(name = "comp_copa_id", referencedColumnName = "copa_id")   // condicao de pagamento
	@ManyToOne
	public CondicaoPagamento copa_id;
	
	@JoinColumn(name = "comp_empr_id", referencedColumnName = "empr_id")   // empresa 
	@ManyToOne
	public Empresa empr_id;

	@JoinColumn(name = "comp_paob_id", referencedColumnName = "paob_id")   // empresa 
	@ManyToOne
	public ParceiroObra paob_id;

	@JoinColumn(name = "comp_moto_id", referencedColumnName = "moto_id")   // motorista 
	@ManyToOne
	public Motorista moto_id;

	@JoinColumn(name = "comp_veic_id", referencedColumnName = "veic_id")   // placa do veiculo 
	@ManyToOne
	public Veiculo veic_id;

	@JoinColumn(name = "comp_tipo_veitif_id", referencedColumnName = "veitif_id")   // placa do veiculo 
	@ManyToOne
	public VeiculoTipoFrete comp_tipo_veitif_id;

	@JoinColumn(name = "comp_tipo_emis_nota", referencedColumnName = "tiemno_id")   // tipo de emissao 
	@OneToOne
	public TipoEmissaoNota comp_tipo_emis_nota;

	@JoinColumn(name = "comp_serfis_id", referencedColumnName = "serfis_id")   // serie da nota
	@ManyToOne
	public SerieFiscal serfis_id;
	
	@NotNull
	@Size(max = 20)
	public String comp_contato;  // contato (cliente) 
	
	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date comp_data_emis;  // da de emissao 
	
	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date comp_data_entr;   // data prevista para entrega
	
	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date comp_data_fatu;   // data prevista para faturamento

	@NotNull
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date comp_data_incl;   // da da inclusao 

	@NotNull
	@JsonbDateFormat(value = "HH:mm:ss") 
	@Size(max = 10)
	public Time comp_hora_incl;   // liberacao do pedido
	
	@NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date comp_data_libe;   // liberacao do pedido

	@NotNull
	@JsonbDateFormat(value = "HH:mm:ss") 
	@Size(max = 10)
	public Time comp_hora_libe;   // liberacao do pedido

	@NotNull
	@Size(max = 1)
	public String comp_situacao;  // situacao do pedido - pendente - sem saldo - liberado, a faturar..

	@NotNull
	public Double comp_desc_item;  // total do Desconto No item  

	@NotNull
	public Double comp_desc_pedi;  // total do Desconto No Pedido  

	@NotNull
	public Double comp_total_prod;  // total dos produtos  
	
	@NotNull
	public Double comp_total_frete;  // total do frete  

	@NotNull
	public Double comp_total_tabela;  // total do valor da somatorio da quantidade * valor da tabela, valor base  

	@NotNull
	public Double comp_total;  // total do pedido   

	@NotNull
	public Double comp_total_servico;  // total do pedido   

	@NotNull
	public Double comp_base_icm;  
	
	@NotNull
	public Double comp_icm_calc;    

	@NotNull
	public Double comp_base_st;
	
	@NotNull
	public Double comp_st_calc;
	
	@NotNull
	public Double comp_base_ipi;
	
	@NotNull
	public Double comp_ipi_calc;
	
	@NotNull
	public Double comp_base_pis;    

	@NotNull
	public Double comp_base_cofins;    

	@NotNull
	public Double comp_pis_calc;    

	@NotNull
	public Double comp_cofins_calc;    

	@NotNull
	public Double comp_valor_seguro;
	
	@NotNull
	public Double comp_desp_acess;    

	@NotNull
	public Double comp_base_iss;    

	@NotNull
	public Double comp_iss_calc;    
	
	@NotNull
	public Double comp_issqn_reti_fonte;
	
	@NotNull
	public Double comp_pis_reti_fonte;

	@NotNull
	public Double comp_cofins_reti_fonte;

	@NotNull
	public Double comp_csll_reti_fonte;

	@NotNull
	public Double comp_icm_desc_op;  // desconto do icms descontado para orgao publico   

	@NotNull
	public Double comp_iten_quan;  // qtdd de itens no pedido  

	@NotNull
	@Size(max = 1)
	public String comp_canal_atend;  // canal de atendimento - internet, b2b, ...  

	@NotNull
	@Size(max = 3)
	public String comp_volume;  // canal de atendimento - internet, b2b, ...
	
	@NotNull
	@Size(max = 10)
	public String comp_marca;  // marca

	@NotNull
	@Size(max = 10)
	public String comp_especie;  

	@NotNull
	@Size(max = 3)
	public String comp_numeros;  

	@NotNull
	public Double comp_peso_liqu;
	
	@NotNull
	public Double comp_peso_brut;

	@NotNull
	public Long comp_quantidade;
	
	@NotNull
	@Size(max = 1)
	public String comp_finalidade;  // idade da nota, normal, ajuste, complementar...  
	
	@NotNull
	@Size(max = 20)
	public String comp_nume_comp_cliente;  // numero do pedido do cliente
	
	@NotNull
	@Size(max = 1)
	public String comp_ambi_sefaz;  // ambiente de emissao da nota - producao / homologaçao  

	@NotNull
	@Size(max = 60)
	public String comp_natu_operacao;  // ambiente de emissao da nota - producao / homologaçao  

}
