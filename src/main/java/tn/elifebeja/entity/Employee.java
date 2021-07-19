package tn.elifebeja.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String prenom;
	private String nom;
	private String email;
	private boolean isActif;
	@Enumerated(EnumType.STRING)
	private Role role;
	@OneToOne
	private Contrat contrat;
	@ManyToMany(mappedBy="employees", cascade={CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.EAGER)
	private List<Departement> Departements;
	@OneToMany(mappedBy="employee")
	private List<Timesheet> timesheets;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String prenom, String nom, String email, boolean isActif, Role role) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActif() {
		return isActif;
	}
	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	public List<Timesheet> getTimesheets() {
		return timesheets;
	}
	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", isActif=" + isActif + ", role="
				+ role + "]";
	}

	public List<Departement> getDepartements() {
		return Departements;
	}

	public void setDepartements(List<Departement> departements) {
		Departements = departements;
	}


}
