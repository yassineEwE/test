package tn.esprit.examenblancspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.Entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
