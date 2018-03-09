package br.com.express.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_employe database table.
 * 
 */
@Embeddable
public class EmployePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="sector_id", insertable=false, updatable=false)
	private int sectorId;

	@Column(name="occupation_id", insertable=false, updatable=false)
	private int occupationId;

	public EmployePK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSectorId() {
		return this.sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public int getOccupationId() {
		return this.occupationId;
	}
	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmployePK)) {
			return false;
		}
		EmployePK castOther = (EmployePK)other;
		return 
			(this.id == castOther.id)
			&& (this.sectorId == castOther.sectorId)
			&& (this.occupationId == castOther.occupationId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.sectorId;
		hash = hash * prime + this.occupationId;
		
		return hash;
	}
}