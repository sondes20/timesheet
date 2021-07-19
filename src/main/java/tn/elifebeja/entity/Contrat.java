package tn.elifebeja.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "reference")
	private long id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private String typeContrat;
	private float salaire;
	@OneToOne(mappedBy="contrat")
	private Employee employee;
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat(Date dateDebut, String typeContrat, float salaire) {
		super();
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
	}
	public long getReference() {
		return id;
	}
	public void setReference(long reference) {
		this.id = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Contrat [reference=" + id + ", dateDebut=" + dateDebut + ", typeContrat=" + typeContrat
				+ ", salaire=" + salaire + ", employee=" + employee + "]";
	}
	

}
