package tn.esprim.gestionfoyer.services;

import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repositories.BlocRepository;
import tn.esprim.gestionfoyer.repositories.ChambreRepository;
import tn.esprim.gestionfoyer.repositories.FoyerRepository;
@Service
public class BlocServiceImpl {
    private final BlocRepository blocRepository;
    private final ChambreRepository chambreRepository;
    private final FoyerRepository foyerRepository;
}
