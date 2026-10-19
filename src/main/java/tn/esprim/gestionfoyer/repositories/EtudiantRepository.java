package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.domain.Sort;
import tn.esprim.gestionfoyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,String> {

    List<Etudiant> findByDateNaissanceBetween(Date dFrom, Date dTo);
    Optional<Etudiant> findByCin(long cin);

}