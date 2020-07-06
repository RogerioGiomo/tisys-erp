package br.com.tisyserp.model.produto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "ncm")

public class Ncm  extends PanacheEntityBase {
	
	public static  Long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    public Long ncm_id;
    
    @NotNull
    @Size(max = 10)
    public String ncm_codi;

    @NotNull
    @Size(max = 120)
    public String ncm_desc;

}