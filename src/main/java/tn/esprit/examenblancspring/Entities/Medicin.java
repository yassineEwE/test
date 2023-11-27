package tn.esprit.examenblancspring.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medicin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedicin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private int telephone;
    private int prixConsultation;
    @JsonIgnore
    @OneToMany(mappedBy = "medicin")
    private List<RendezVous> rendezVousList;
    @JsonIgnore
    @ManyToMany()
    private List<Clinique> cliniqueList;
}
