package br.com.tisyserp.model.produto;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//	codigo	ex	tipo	descricao	nacionalfederal	importadosfederal	estadual	municipal	vigenciainicio	vigenciafim	chave	versao	fonte
@Entity
@Table(name = "tabela_ibpt")

public class TabelaIbpt  extends PanacheEntityBase {
	
	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long ipbt_id;

	@NotNull
	@Size(max = 8)
	public String ibpt_codi;

	@NotNull
	@Size(max = 2)
	public String ibpt_ex;

	@NotNull
	@Size(max = 2)
	public String ibpt_tipo;

	@NotNull
	@Size(max = 200)
	public String ibpt_desc;
	
	@NotNull
	public Double ibpt_impo_impo;

	@NotNull
	public Double ibpt_impo_esta;
	
	@NotNull
	public Double ibpt_impo_fede;

	@NotNull
	public Double ibpt_impo_muni;
	
	@NotNull
	public Date ibpt_vige_inic;
	
	@NotNull
	public Date ibpt_vige_Fim;
	
	@NotNull
	@Size(max = 10)
	public String ibpt_chave;
	
	@NotNull
	@Size(max = 10)	
	public String ibpt_versao;
	
	@NotNull
	@Size(max = 50)
	public String ibpt_Font;


}

	

