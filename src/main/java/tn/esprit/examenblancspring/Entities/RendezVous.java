package tn.esprit.examenblancspring.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    @Temporal(TemporalType.DATE)
    private Date dateRDV;
    private String remarque;
    @JsonIgnore
    @ManyToOne
    private Medicin medicin;
    @JsonIgnore
    @ManyToOne
    private Patient patient;

}
