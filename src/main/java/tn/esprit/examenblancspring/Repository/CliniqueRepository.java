package tn.esprit.examenblancspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.Entities.Clinique;

public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}
