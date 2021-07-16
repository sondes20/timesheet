package tn.elifebeja.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Employee> employees;
	@OneToMany(mappedBy="departement",cascade=CascadeType.ALL)
	private List<Mission> missionsList;
	@ManyToOne
	private Entreprise entreprise;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(long id, String name, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.employees = employees;
	}
	
	public Departement(String name) {
		super();
		this.name = name;
	}
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Mission> getMissionsList() {
		return missionsList;
	}
	public void setMissionsList(List<Mission> missionsList) {
		this.missionsList = missionsList;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name + ", employees=" + employees + ", missionsList="
				+ missionsList + ", entreprise=" + entreprise + "]";
	}
	
}
