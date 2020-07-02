package br.com.tisyserp.model.TabelaAuxiliar;



import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "tipo_pessoa")
public class TipoPessoa extends PanacheEntityBase  {

	public static final Long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer tipe_id;
	
	@NotNull
	@Size(max = 60)
	public String tipe_desc;

	public Integer getTipe_id() {
		return tipe_id;
	}

	public void setTipe_id(Integer tipe_id) {
		this.tipe_id = tipe_id;
	}

	public String getTipe_desc() {
		return tipe_desc;
	}

	public void setTipe_desc(String tipe_desc) {
		this.tipe_desc = tipe_desc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipe_desc == null) ? 0 : tipe_desc.hashCode());
		result = prime * result + ((tipe_id == null) ? 0 : tipe_id.hashCode());
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
		TipoPessoa other = (TipoPessoa) obj;
		if (tipe_desc == null) {
			if (other.tipe_desc != null)
				return false;
		} else if (!tipe_desc.equals(other.tipe_desc))
			return false;
		if (tipe_id == null) {
			if (other.tipe_id != null)
				return false;
		} else if (!tipe_id.equals(other.tipe_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoPessoa [tipe_id=" + tipe_id + ", tipe_desc=" + tipe_desc + "]";
	}

}
