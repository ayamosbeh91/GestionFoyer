package tn.esprim.gestionfoyer.repositories;

import tn.esprim.gestionfoyer.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.Universite;

import java.util.Optional;

@Repository
public interface UniversiteRepository extends JpaRepository<Reservation,Long> {
    Optional<Universite> findByNomUniversite(String nomUniversite);

}
