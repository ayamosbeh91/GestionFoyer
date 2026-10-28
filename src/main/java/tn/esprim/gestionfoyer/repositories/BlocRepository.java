
package tn.esprim.gestionfoyer.repositories;

import tn.esprim.gestionfoyer.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;
@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findByFoyerNomFoyer(String nomFoyer);
    List<Bloc> findByCapaciteBlocGreaterThanEqual(long capacite);
}