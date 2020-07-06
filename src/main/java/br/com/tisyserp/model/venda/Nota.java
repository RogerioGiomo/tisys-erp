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
@Table(name = "nota")

public class Nota extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long nota_id;

    @Size(max = 10)
	public String nota_nota;

    public long nota_pedi_id;

	@NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date nota_data_emis;   

    @NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date nota_data_said;   

	@NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date nota_data_canc;   

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_base_icm;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_aliq_icm;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_icm;

    @Size(max = 10)
	public String nota_especie;

    @Size(max = 6)
	public String nota_serie;

    @Size(max = 14)
	public String nota_cnpj;

    @Size(max = 14)
	public String nota_insc_esta;

    @Size(max = 120)
	public String nota_clie_desc;

    @Size(max = 2)
	public String nota_clie_uf;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_isento;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_outro;
    
    @Column(columnDefinition = "BigDecimal default 1")
    public Integer nota_quantidade;

    @Size(max = 10)
	public String nota_marca;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_peso_liqu;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_peso_brut;

    @NotNull	
	@JsonbDateFormat(value = "dd-MM-yyyy") 
	@Size(max = 10)
	public Date nota_data_devo;   

    @Size(max = 4000)
	public String nota_dados_adicionais;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_Base_ipi;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_ipi;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_base_subs_trib;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_subs_trib;

    public Integer nota_tipo_frete;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal nota_valo_frete;

    @Size(max = 10)
	public String nota_volume;
    
    @Size(max = 44)
	public String nota_chave;

    @Size(max = 1)
	public String nota_situacao_envio_nfe;

    @Size(max = 20)
    public String nota_lote_recibo;
    
    @Size(max = 20)
    public String nota_protocolo;

    @Size(max = 20)
    public String nota_protocolo_cancelado;

    @Size(max = 20)
    public String nota_envio_email_nfe;

    @Size(max = 10)
    public String nota_placa_veiculo;

    @Size(max = 2)
    public String nota_uf_placa_veiculo;

    @Size(max = 1)
    public String nota_canhoto;

    public Long modfis_id;;

    public long nota_mdfc_cte;
}