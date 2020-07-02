package  br.com.tisyserp.model.financeiro;

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
@Table(name = "condicao_pagamento")

public class CondicaoPagamento extends PanacheEntityBase  {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer copa_id;

	@NotNull
	@Size(max = 4)
	public String copa_codi;

	@NotNull
	@Size(max = 200)
	public String copa_desc;

	@NotNull
	@Size(max = 3)
	public Integer copa_parc;
	
	@NotNull
	public Double copa_acre_parc;  // juros sobre o valor do parcelamento

	@NotNull
	public Integer copa_praz_medi; // prazo medio ((10-20-30) / 3 = 20 dias
	
	@NotNull
	public Integer copa_dia_paga_acont; // 1o dia do pagamento acontece em (periodicidade)

	@NotNull
	@Size(max = 1)
	public String copa_stat;   // ativo ou inativo  (s/n) ou 0 / 1
	
	@NotNull
	@Size(max = 1)
	public String copa_palm;   // ativo ou inativo para uso no celular , forca de vendas
	
	@NotNull
	@Size(max = 1)
	public String copa_dias_fora_sema;   // inicia sempre na 2a feira seguinte
	
	@NotNull
	@Size(max = 1)
	public String copa_dias_fora_dece;   // incia 10 dias apos 
	
	@NotNull
	@Size(max = 1)
	public String copa_dias_fora_quin;   // fora o quinzena 
	
	@NotNull
	@Size(max = 1)
	public String copa_dias_fora_mes;   // fora o mes
	
	@NotNull
	@Size(max = 1)
	public String copa_soma_ipi_1parc;   // soma o total do ipi na 1a parcela 

	@NotNull
	@Size(max = 1)
	public String copa_soma_st_1parc;   // soma o total do ST na 1a parcela
	
	@NotNull
	@Size(max = 1)
	public String copa_soma_frete_1parc ;   // soma o total do frete na 1a parcela 
	
	@NotNull
	public String copa_perc_repr_parc;   // percentual que representa a parcela 

	@JoinColumn(name = "copa_id", referencedColumnName = "copa_id")
	@OneToOne
	public CondicaoPagamentoParcela copp_id;

}