package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.domain.Sort;
import tn.esprim.gestionfoyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant findByCin(long cin);
    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);
    List<Etudiant> findByEcoleIgnoreCase(String ecole);
}