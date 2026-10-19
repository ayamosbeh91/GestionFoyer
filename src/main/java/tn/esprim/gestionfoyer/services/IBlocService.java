package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc retrieveBloc(Long idBloc);
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void removeBloc(Long idBloc);

    Bloc affecterChambresABloc(List<Long> numerosChambre, Long idBloc);
    Bloc affecterBlocAFoyer(String nomBloc, String nomFoyer);
}
