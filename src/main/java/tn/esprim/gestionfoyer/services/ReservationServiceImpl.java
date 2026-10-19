package tn.esprim.gestionfoyer.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestionfoyer.entities.Bloc;
import tn.esprim.gestionfoyer.entities.Chambre;
import tn.esprim.gestionfoyer.entities.Etudiant;
import tn.esprim.gestionfoyer.entities.Reservation;
import tn.esprim.gestionfoyer.repositories.BlocRepository;
import tn.esprim.gestionfoyer.repositories.EtudiantRepository;
import tn.esprim.gestionfoyer.repositories.ReservationRepository;
import tn.esprim.gestionfoyer.utils.AnneeUniversitaireUtil;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;
    private final BlocRepository blocRepository;
    private final EtudiantRepository etudiantRepository;
}