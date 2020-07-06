package br.com.tisyserp.model.venda;

import java.math.BigDecimal;
import java.sql.Date;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "compra_vencimento")

public class CompraVencimento extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cove_id;

    public Long cove_pedi_id;
    public Long cove_nota_id;
    public Long cove_empr_id;
    
    @NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date cove_data_venc;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal cove_valo;
	
    public Long cove_parcela;
    
    @Size(max = 6)
    public String cove_coba_nome_redu;
    
	@Size(max = 10)
	public String cove_dupl;

    @NotNull
	@Size(max = 4)
	public String cove_cecon_conta;

    @NotNull
	@Size(max = 4)
    public String cove_ccgr_codi;
    
}