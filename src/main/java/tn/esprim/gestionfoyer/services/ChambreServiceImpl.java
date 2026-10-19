package tn.esprim.gestionfoyer.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.entities.Chambre;
import tn.esprim.gestionfoyer.entities.TypeChambre;
import tn.esprim.gestionfoyer.repositories.ChambreRepository;
import tn.esprim.gestionfoyer.repositories.ReservationRepository;
import tn.esprim.gestionfoyer.utils.AnneeUniversitaireUtil;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private final ChambreRepository chambreRepository;
    private final ReservationRepository reservationRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre)
                .orElseThrow(() -> new EntityNotFoundException("Chambre introuvable : id=" + idChambre));
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        if (chambre.getIdChambre() == null || !chambreRepository.existsById(chambre.getIdChambre())) {
            throw new EntityNotFoundException("Chambre introuvable : id=" + chambre.getIdChambre());
        }
        return chambreRepository.save(chambre);
    }

    @Override
    public void removeChambre(Long idChambre) {
        if (!chambreRepository.existsById(idChambre)) {
            throw new EntityNotFoundException("Chambre introuvable : id=" + idChambre);
        }
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getChambresParNomBloc(String nomBloc) {
        return chambreRepository.findByBloc_NomBloc(nomBloc);
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, Long idBloc) {
        return chambreRepository.countByTypeCAndBloc_IdBloc(type, idBloc);
    }

    /** Chambres d'un foyer, d'un type donné, encore disponibles pour l'année universitaire en cours. */
    @Override
    public List<Chambre> getChambresNonReserveParNomFoyerEtTypeChambre(String nomFoyer, TypeChambre type) {
        LocalDate aujourdhui = LocalDate.now();
        Date debut = AnneeUniversitaireUtil.toDate(AnneeUniversitaireUtil.debut(aujourdhui));
        Date fin = AnneeUniversitaireUtil.toDate(AnneeUniversitaireUtil.fin(aujourdhui));

        return chambreRepository.findByBloc_Foyer_NomFoyerAndTypeC(nomFoyer, type).stream()
                .filter(c -> reservationRepository.countOccupants(c.getIdChambre(), debut, fin)
                        < c.getTypeC().getCapacite())
                .toList();
    }
}
