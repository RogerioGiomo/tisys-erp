package br.com.tisyserp.model.fiscal;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "ipi")

public class Ipi extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long ipi_id;
	
	@NotNull
	public BigDecimal ipi_aliq;

	
}
