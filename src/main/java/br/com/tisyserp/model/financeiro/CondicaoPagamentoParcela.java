package  br.com.tisyserp.model.financeiro;



import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "condicao_pagamento_parcela")

public class  CondicaoPagamentoParcela extends PanacheEntityBase  {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long copp_id;

	@NotNull
	public Long copp_nume_parc;

	@NotNull
	public Long copp_nume_dias_parc;
	
	@NotNull
	public Double copp_perc_parc;  // percentual da parcela 


}