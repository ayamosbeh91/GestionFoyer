package tn.esprim.gestionfoyer.repositories;
import tn.esprim.gestionfoyer.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findByNumeroChambreIn(List<Long> numerosChambre);

    List<Chambre> findByBloc_NomBloc(String nomBloc);

    List<Chambre> findByBloc_Foyer_NomFoyerAndTypeC(String nomFoyer, TypeChambre typeC);

    long countByTypeCAndBloc_IdBloc(TypeChambre typeC, Long idBloc);
}
