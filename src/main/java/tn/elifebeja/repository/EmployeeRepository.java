package tn.elifebeja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.elifebeja.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	@Query("select count(e) from Employee e ")
	public long getCountEmployee(); 
	@Query("select nom from Employee e ")
	public List<String> getNomEmployee();
	@Query("select e from Employee e join e.Departements dep join dep.entreprise entre where entre.id=:identreprise")
	public List<Employee> listEmployeeByEntreprise(@Param("identreprise") long identreprise);
	public Employee findByNomAndEmail(String nom, String email);
	 
	
	
	

}
