package br.com.tisyserp.model.pessoa;
// Tabela para indicar os meios de contato com o contato do cliente fornecedor etc ou seja, email, telefone, intagram facebook etc.

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "contato_tipo")

public class ContatoTipo extends PanacheEntityBase {

	public static  Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long contip_id;

    public Long contip_Cont_id;   // contato id 

    public Long contip_tico_id;   // email, telefone, rede social

    @Size(max = 10)
    public String cont_desc;

    public Integer contip_principal;  
    
}  