package tn.elifebeja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.elifebeja.entity.Contrat;
@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long> {

}
