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
@Table(name = "status")
public class Status extends PanacheEntityBase  {
	public static final Long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer stat_id;
	
	@NotNull
	@Size(max = 60)
	public String stat_desc;

	public Integer getStat_id() {
		return stat_id;
	}

	public void setStat_id(Integer stat_id) {
		this.stat_id = stat_id;
	}

	public String getStat_desc() {
		return stat_desc;
	}

	public void setStat_desc(String stat_desc) {
		this.stat_desc = stat_desc;
	}

	@Override
	public String toString() {
		return "StatusRepository [stat_id=" + stat_id + ", stat_desc=" + stat_desc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stat_desc == null) ? 0 : stat_desc.hashCode());
		result = prime * result + ((stat_id == null) ? 0 : stat_id.hashCode());
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
		Status other = (Status) obj;
		if (stat_desc == null) {
			if (other.stat_desc != null)
				return false;
		} else if (!stat_desc.equals(other.stat_desc))
			return false;
		if (stat_id == null) {
			if (other.stat_id != null)
				return false;
		} else if (!stat_id.equals(other.stat_id))
			return false;
		return true;
	}

}
