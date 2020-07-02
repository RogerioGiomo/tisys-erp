package br.com.tisyserp.model.pessoa;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_obra")

public class ParceiroObra extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer paob_id;

	@NotNull
	@Size(max = 60)
	public String paob_desc; /// Nome da Obra

	@Size(max = 120)
	public String paob_logr;
	@Size(max = 60)
	public String paob_nume;
	@Size(max = 60)
	public String paob_comp;
	@Size(max = 120)
	public String paob_bair;

	@Size(max = 2)
	public String paob_uf;
	@Size(max = 9)
	public String paob_cep;

	public Integer paob_parc_id;

	@JoinColumn(name = "paob_pais_id", referencedColumnName = "pais_id")
	@OneToOne
	public Pais paob_pais_id;

	@JoinColumn(name = "paob_cida_id", referencedColumnName = "cida_id")
	@OneToOne
	public Cidade paob_cida_id;

	public Integer getPaob_id() {
		return paob_id;
	}

	public void setPaob_id(Integer paob_id) {
		this.paob_id = paob_id;
	}

	public String getPaob_desc() {
		return paob_desc;
	}

	public void setPaob_desc(String paob_desc) {
		this.paob_desc = paob_desc;
	}

	public String getPaob_logr() {
		return paob_logr;
	}

	public void setPaob_logr(String paob_logr) {
		this.paob_logr = paob_logr;
	}

	public String getPaob_nume() {
		return paob_nume;
	}

	public void setPaob_nume(String paob_nume) {
		this.paob_nume = paob_nume;
	}

	public String getPaob_comp() {
		return paob_comp;
	}

	public void setPaob_comp(String paob_comp) {
		this.paob_comp = paob_comp;
	}

	public String getPaob_bair() {
		return paob_bair;
	}

	public void setPaob_bair(String paob_bair) {
		this.paob_bair = paob_bair;
	}

	public String getPaob_uf() {
		return paob_uf;
	}

	public void setPaob_uf(String paob_uf) {
		this.paob_uf = paob_uf;
	}

	public String getPaob_cep() {
		return paob_cep;
	}

	public void setPaob_cep(String paob_cep) {
		this.paob_cep = paob_cep;
	}

	public Integer getPaob_parc_id() {
		return paob_parc_id;
	}

	public void setPaob_parc_id(Integer paob_parc_id) {
		this.paob_parc_id = paob_parc_id;
	}

	public Pais getPaob_pais_id() {
		return paob_pais_id;
	}

	public void setPaob_pais_id(Pais paob_pais_id) {
		this.paob_pais_id = paob_pais_id;
	}

	public Cidade getPaob_cida_id() {
		return paob_cida_id;
	}

	public void setPaob_cida_id(Cidade paob_cida_id) {
		this.paob_cida_id = paob_cida_id;
	}

}
