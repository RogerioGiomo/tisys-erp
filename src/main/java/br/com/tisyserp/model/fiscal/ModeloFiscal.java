package br.com.tisyserp.model.fiscal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "modelo_fiscal")
public class ModeloFiscal extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long modfis_id;
	
	@NotNull
	@Size(max = 4)
	public String modfis_sigla;  // sigla, nome abreviado do modelo 

	@NotNull
	@Size(max = 60)
	public String modfis_desc;  // nome do modelo da nota fiscal 

}