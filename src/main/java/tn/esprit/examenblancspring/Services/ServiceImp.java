package tn.esprit.examenblancspring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examenblancspring.Entities.Clinique;
import tn.esprit.examenblancspring.Entities.Medicin;
import tn.esprit.examenblancspring.Entities.Patient;
import tn.esprit.examenblancspring.Entities.RendezVous;
import tn.esprit.examenblancspring.Repository.CliniqueRepository;
import tn.esprit.examenblancspring.Repository.MedicinRepository;
import tn.esprit.examenblancspring.Repository.PatientRepository;
import tn.esprit.examenblancspring.Repository.RendezVousRepository;

@Service
@AllArgsConstructor
public class ServiceImp implements IService{

    private final CliniqueRepository cliniqueRepository;
    private final MedicinRepository medicinRepository;
    private final PatientRepository patientRepository;
    private final RendezVousRepository rendezVousRepository;

    @Override
    public Clinique addClinique(Clinique clinique){
        return cliniqueRepository.save(clinique);
    }

    @Override
    public Medicin addMedicinAndAssignToClinique(Medicin medicin, Long cliniqueId) {
        Clinique clinique = cliniqueRepository.findById(cliniqueId).orElse(null);
        if(clinique == null) {
            return null;
        }
        clinique.getMedicinList().add(medicin);
        cliniqueRepository.save(clinique);
        medicin.getCliniqueList().add(clinique);
        return medicinRepository.save(medicin);

    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medicin medicin = medicinRepository.findById(idMedecin).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        if(medicin != null && patient != null) {
            medicin.getRendezVousList().add(rdv);
            medicinRepository.save(medicin);
            patient.getRendezVousList().add(rdv);
            patientRepository.save(patient);
            rdv.setMedicin(medicin);
            rdv.setPatient(patient);
            rendezVousRepository.save(rdv);
        }
    }
}
