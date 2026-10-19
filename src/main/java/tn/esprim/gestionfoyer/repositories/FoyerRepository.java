
package tn.esprim.gestionfoyer.repositories;

import tn.esprim.gestionfoyer.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    Optional<Foyer> findByNomFoyer(String nomFoyer);

}