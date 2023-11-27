package tn.esprit.examenblancspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblancspring.Entities.Clinique;
import tn.esprit.examenblancspring.Entities.Medicin;
import tn.esprit.examenblancspring.Entities.Patient;
import tn.esprit.examenblancspring.Repository.CliniqueRepository;
import tn.esprit.examenblancspring.Services.ServiceImp;

@RestController
@AllArgsConstructor
public class RestAppController {

    private final ServiceImp serviceImp;

    @GetMapping("/addClinique")
    public Clinique addClinique(@RequestBody Clinique clinique){
        return serviceImp.addClinique(clinique);
    }
    @PostMapping("/addMedicinAndAssignToClinique/{cliniqueId}")
    public Medicin addMedicinAndAssignToClinique(@RequestBody Medicin medicin,@PathVariable Long cliniqueId){
        return serviceImp.addMedicinAndAssignToClinique(medicin, cliniqueId);
    }
    @GetMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        return serviceImp.addPatient(patient);
    }




}
