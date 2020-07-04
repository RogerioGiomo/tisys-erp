package br.com.tisyserp.model.pessoa;



import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "Contato")

public class Contato extends PanacheEntityBase {

	public static final Long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cont_id;

	@Size(max = 10)
	public String cont_tipo_telefone;

	@Size(max = 120)
	public String Cont_nome_contato;
	
	@Size(max = 60)
	public String Cont_email;
		
	@Size(max = 40)
	public String Cont_depto;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cont_depto == null) ? 0 : Cont_depto.hashCode());
		result = prime * result + ((Cont_email == null) ? 0 : Cont_email.hashCode());
		result = prime * result + ((Cont_nome_contato == null) ? 0 : Cont_nome_contato.hashCode());
		result = prime * result + ((cont_id == null) ? 0 : cont_id.hashCode());
		result = prime * result + ((cont_tipo_telefone == null) ? 0 : cont_tipo_telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (Cont_depto == null) {
			if (other.Cont_depto != null)
				return false;
		} else if (!Cont_depto.equals(other.Cont_depto))
			return false;
		if (Cont_email == null) {
			if (other.Cont_email != null)
				return false;
		} else if (!Cont_email.equals(other.Cont_email))
			return false;
		if (Cont_nome_contato == null) {
			if (other.Cont_nome_contato != null)
				return false;
		} else if (!Cont_nome_contato.equals(other.Cont_nome_contato))
			return false;
		if (cont_id == null) {
			if (other.cont_id != null)
				return false;
		} else if (!cont_id.equals(other.cont_id))
			return false;
		if (cont_tipo_telefone == null) {
			if (other.cont_tipo_telefone != null)
				return false;
		} else if (!cont_tipo_telefone.equals(other.cont_tipo_telefone))
			return false;
		return true;
	}

	public Long getCont_id() {
		return cont_id;
	}

	public void setCont_id(Long cont_id) {
		this.cont_id = cont_id;
	}

	public String getCont_tipo_telefone() {
		return cont_tipo_telefone;
	}

	public void setCont_tipo_telefone(String cont_tipo_telefone) {
		this.cont_tipo_telefone = cont_tipo_telefone;
	}

	public String getCont_nome_contato() {
		return Cont_nome_contato;
	}

	public void setCont_nome_contato(String cont_nome_contato) {
		Cont_nome_contato = cont_nome_contato;
	}

	public String getCont_email() {
		return Cont_email;
	}

	public void setCont_email(String cont_email) {
		Cont_email = cont_email;
	}

	public String getCont_depto() {
		return Cont_depto;
	}

	public void setCont_depto(String cont_depto) {
		Cont_depto = cont_depto;
	}

	

}
