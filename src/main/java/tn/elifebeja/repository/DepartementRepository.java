package tn.elifebeja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.elifebeja.entity.Departement;
@Repository
public interface DepartementRepository extends CrudRepository<Departement, Long> {

}
