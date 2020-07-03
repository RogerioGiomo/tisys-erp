package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_rede")   // rede de clientes

public class ParceiroRede extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer paco_id;
	
	public String paco_desc;
	
	public Integer paco_parc_id;
	// @JoinColumn(name = "paco_parc_id", referencedColumnName = "parc_id")
	// public Parceiro paco_parc_id;
	
}