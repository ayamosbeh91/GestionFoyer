package tn.esprim.gestionfoyer.repositories;
import tn.esprim.gestionfoyer.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByTypeC(TypeChambre typeC);
    List<Chambre> findByBlocNomBloc(String nomBloc);
    Chambre findByNumeroChambre(long numeroChambre);
}
