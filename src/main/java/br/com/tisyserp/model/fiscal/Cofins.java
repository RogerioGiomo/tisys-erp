package br.com.tisyserp.model.fiscal;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "cofins")
public class Cofins extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer cofi_id;
	
	@NotNull
	@Column(columnDefinition = "BigDecimal default 0")
	public BigDecimal cofi_aliq;

}
