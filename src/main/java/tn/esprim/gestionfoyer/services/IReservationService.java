package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(String idReservation);
    Reservation updateReservation(Reservation reservation);
    void removeReservation(String idReservation);

    Reservation ajouterReservation(Long idBloc, long cinEtudiant);
    Reservation annulerReservation(long cinEtudiant);
    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(LocalDate anneeUniversitaire, String nomUniversite);
}
