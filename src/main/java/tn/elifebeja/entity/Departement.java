package tn.elifebeja.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	@ManyToMany(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Employee> employees=new ArrayList<>();
	@OneToMany(mappedBy="departement",cascade=CascadeType.PERSIST)
	private List<Mission> missionsList;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Entreprise entreprise;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Departement [id=" + id + ", name=" + name + "]";
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
