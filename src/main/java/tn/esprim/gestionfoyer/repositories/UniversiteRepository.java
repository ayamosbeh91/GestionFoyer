package tn.esprim.gestionfoyer.repositories;

import tn.esprim.gestionfoyer.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Reservation,Long> {
}
