package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer retrieveFoyer(Long idFoyer);
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void removeFoyer(Long idFoyer);

    Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, Long idUniversite);
}
