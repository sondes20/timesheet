package tn.elifebeja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.elifebeja.entity.Entreprise;
@Repository
public interface EntrepriseRepository extends CrudRepository<Entreprise, Long> {

}
