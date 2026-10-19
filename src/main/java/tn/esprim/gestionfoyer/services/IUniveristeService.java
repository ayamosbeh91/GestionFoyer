package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long idUniversite);
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void removeUniversite(Long idUniversite);

    Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite);
    Universite desaffecterFoyerAUniversite(Long idUniversite);
}
