package tn.esprim.gestionfoyer.repositories;

import tn.esprim.gestionfoyer.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    List<Reservation> findByEstValideTrue();
    List<Reservation> findByEtudiantsCin(long cin);
}

