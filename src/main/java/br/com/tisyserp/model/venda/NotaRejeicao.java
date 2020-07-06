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
@Table(name = "nota_rejeicao")

public class NotaRejeicao extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long notrej_id;

    @Size(max = 10)
	public String notrej_nota_id;

    @Size(max = 3)
	public String notrej_codi_rejeicao;

    @Size(max = 5000)
	public String notrej_rejeicao;
	
    @Size(max = 2)
	public String notrej_empr_id;
}