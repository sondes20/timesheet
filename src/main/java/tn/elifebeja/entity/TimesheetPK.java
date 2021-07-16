package tn.elifebeja.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TimesheetPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idMission;
	private long idEmployee;
	
	public TimesheetPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idEmployee ^ (idEmployee >>> 32));
		result = prime * result + (int) (idMission ^ (idMission >>> 32));
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
		TimesheetPK other = (TimesheetPK) obj;
		if (idEmployee != other.idEmployee)
			return false;
		if (idMission != other.idMission)
			return false;
		return true;
	}
	public long getIdMission() {
		return idMission;
	}
	public void setIdMission(long idMission) {
		this.idMission = idMission;
	}
	public long getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(long idEmployee) {
		this.idEmployee = idEmployee;
	}

}
