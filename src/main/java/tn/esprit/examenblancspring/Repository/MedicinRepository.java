package tn.esprit.examenblancspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenblancspring.Entities.Medicin;

public interface MedicinRepository extends JpaRepository<Medicin,Long> {
}
