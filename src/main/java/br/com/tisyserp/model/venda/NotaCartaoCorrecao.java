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
@Table(name = "nota_carta_correcao")

public class NotaCartaoCorrecao extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long notcarcor_id;

	public long notcarcor_nota_id;
	public long notcarcor_nota_seque;
    
    @Size(max = 200)
	public String notcarcor_texto;
}
