package br.com.tisyserp.model.pessoa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "parceiro_rede")   // rede de clientes
public class ParceiroRede extends PanacheEntityBase {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long pare_id;
	
	public String pare_desc;
	
	@JoinColumn(name = "pare_parc_id", referencedColumnName = "parc_id")
	@ManyToOne
	public Parceiro pare_parc_id;
	
}