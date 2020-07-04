package br.com.tisyserp.model.pessoa;

import javax.json.bind.annotation.JsonbTransient;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_contato")
public class ParceiroContato extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long paco_id;

	@Size(max = 60)
	public String paco_desc;

	@Size(max = 60)
	public String paco_tele;
	
	@Size(max = 60)
	public String paco_email;

	@Size(max = 16)
	public String paco_tipo_email;

	public Long paco_parc_id;
	
	@JsonbTransient
	@ManyToOne
	@JoinColumn(name = "paco_parc_id" , updatable=false, insertable=false)
	public Parceiro parceiro;

}
	
