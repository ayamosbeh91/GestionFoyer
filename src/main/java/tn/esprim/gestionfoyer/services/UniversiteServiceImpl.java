package tn.esprim.gestionfoyer.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprim.gestionfoyer.entities.Foyer;
import tn.esprim.gestionfoyer.entities.Universite;
import tn.esprim.gestionfoyer.repositories.FoyerRepository;
import tn.esprim.gestionfoyer.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;
}