
package tn.esprim.gestionfoyer.repositories;

import tn.esprim.gestionfoyer.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    Optional<Bloc> findByNomBloc(String nomBloc);

}