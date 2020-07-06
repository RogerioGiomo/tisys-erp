package br.com.tisyserp.model.estoque;

import java.math.BigDecimal;
import java.sql.Date;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "inventario")

public class Inventario extends PanacheEntityBase {
    
    public static  Long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigDecimal inve_id;

    public BigDecimal inve_empe_id;
    
    public String inve_prod_id;

    @Size(max = 20)
    public String inve_local;
    
    @Size(max = 20)
    public String inve_almoxarifado;

    public BigDecimal inve_saldo_atual;

    public BigDecimal inve_preco_medio;
    
    public BigDecimal inve_preco_custo;

    @JsonbDateFormat(value = "dd-MM-yyyy") 
    @Size(max = 10)
    public Date inve_data_movi;

}

