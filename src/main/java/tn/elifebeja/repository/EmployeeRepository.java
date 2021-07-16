package tn.elifebeja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.elifebeja.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	

}
