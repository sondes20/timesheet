package tn.elifebeja.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Timesheet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TimesheetPK timesheetPK;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private boolean isValide;
	@ManyToOne
	@JoinColumn(name="idMission", referencedColumnName="id", insertable=false, updatable=false)
	private Mission mission;
	@ManyToOne
	@JoinColumn(name="idEmployee", referencedColumnName="id", insertable=false, updatable=false)
	private Employee employee;
	
	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimesheetPK getTimesheetPK() {
		return timesheetPK;
	}
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public boolean isValide() {
		return isValide;
	}
	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}
	
	public Mission getMission() {
		return mission;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	@Override
	public String toString() {
		return "Timesheet [timesheetPK=" + timesheetPK + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", isValide=" + isValide + ", mission=" + mission + ", employee=" + employee + "]";
	}
	
	

}
