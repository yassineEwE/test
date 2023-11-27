package tn.esprit.examenblancspring.Services;

import tn.esprit.examenblancspring.Entities.Clinique;
import tn.esprit.examenblancspring.Entities.Medicin;
import tn.esprit.examenblancspring.Entities.Patient;
import tn.esprit.examenblancspring.Entities.RendezVous;

public interface IService {
    public Clinique addClinique(Clinique clinique);
    public Medicin addMedicinAndAssignToClinique(Medicin medicin , Long cliniqueId);
    public Patient addPatient(Patient patient);
    public void addRDVAndAssignMedAndPatient(RendezVous rdv , Long idMedecin , Long idPatient);
}
