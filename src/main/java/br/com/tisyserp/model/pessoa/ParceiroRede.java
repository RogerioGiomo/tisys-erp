package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	public Integer getPaco_id() {
		return paco_id;
	}

	public void setPaco_id(Integer paco_id) {
		this.paco_id = paco_id;
	}

	public String getPaco_desc() {
		return paco_desc;
	}

	public void setPaco_desc(String paco_desc) {
		this.paco_desc = paco_desc;
	}

	public Parceiro getParc_id() {
		return parc_id;
	}

	public void setParc_id(Parceiro parc_id) {
		this.parc_id = parc_id;
	}

	@JoinColumn(name = "paco_parc_id", referencedColumnName = "parc_id")
	public Parceiro parc_id;
	
}