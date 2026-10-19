package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    private String idReservation;
    private String anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;

    @ManyToOne
    @ToString.Exclude
    private Chambre chambre;
}