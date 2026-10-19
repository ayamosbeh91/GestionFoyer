package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant retrieveEtudiant(Long idEtudiant);
    Etudiant retrieveEtudiantParCin(long cin);
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> addEtudiants(List<Etudiant> etudiants);
    Etudiant updateEtudiant(Etudiant etudiant);
    void removeEtudiant(Long idEtudiant);

    List<Etudiant> findByDateNaissanceBetween(Date dateDebut, Date dateFin);
}
