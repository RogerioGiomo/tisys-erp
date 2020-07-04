package br.com.tisyserp.model.fiscal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
@Entity
@Table(name = "serie_fiscal")
public class SerieFiscal extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer serfis_id;
	
	@JoinColumn(name = "serfis_modFis_id", referencedColumnName = "modfis_id")
	@ManyToOne
	public ModeloFiscal modfis_id;
	
	@NotNull
	@Size(max = 10)
	public String serfis_desc;  // nome do modelo da nota fiscal 

	@NotNull
	@Size(max = 4)
	public String serfis_serie;  // serie da nota fiscal  001, 002...
	
	@NotNull
	@Size(max = 1)
	public String serfis_danfe_orien;  // tipo de impressao do danfe portrait ou landscape
	
	@NotNull
	@Size(max = 10)
	public String serfis_nume_nota;  // proximo numero da nota
	
	@NotNull
	@Size(max = 1)
	public String serfis_status;  // ativo / inativo

}

