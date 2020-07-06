package br.com.tisyserp.model.estoque;

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
@Table(name = "estoque")

public class Estoque extends PanacheEntityBase {
    
    public static  BigDecimal serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigDecimal esto_id;

    public BigDecimal esto_empe_id;
    
    public String esto_prod_id;

    @Size(max = 20)
    public String esto_local;
    
    @Size(max = 20)
    public String esto_almoxarifado;

    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_minimo;
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_maximo;
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_saldo_anterior;
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_saida;
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_entradas;
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_Saldo_atual;
    @Column(columnDefinition = "BigDecimal default 0")
    public BigDecimal esto_reserva;

    @JsonbDateFormat(value = "dd-MM-yyyy") 
    @Size(max = 10)
    public Date esto_data_movi;

}

