package tn.elifebeja.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.elifebeja.entity.Timesheet;
import tn.elifebeja.entity.TimesheetPK;
@Repository
public interface TimesheetRepository extends CrudRepository<Timesheet, TimesheetPK> {

}
