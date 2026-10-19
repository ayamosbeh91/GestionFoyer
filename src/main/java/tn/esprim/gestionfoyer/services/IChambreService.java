package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Chambre;
import tn.esprim.gestionfoyer.entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre retrieveChambre(Long idChambre);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void removeChambre(Long idChambre);

    List<Chambre> getChambresParNomBloc(String nomBloc);
    long nbChambreParTypeEtBloc(TypeChambre type, Long idBloc);
    List<Chambre> getChambresNonReserveParNomFoyerEtTypeChambre(String nomFoyer, TypeChambre type);
}
