package one.digitalinnovation.labpadroesprojetojavaspring.repositories;

import one.digitalinnovation.labpadroesprojetojavaspring.entities.Separete;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SepareteRepository extends CrudRepository<Separete, Long> {

}
