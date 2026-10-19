package tn.esprim.gestionfoyer.services;

import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repositories.FoyerRepository;
import tn.esprim.gestionfoyer.repositories.UniversiteRepository;
@Service
public class FoyerServiceImpl implements IFoyerService{
    private final FoyerRepository foyerRepository;
    private final UniversiteRepository universiteRepository;
}
