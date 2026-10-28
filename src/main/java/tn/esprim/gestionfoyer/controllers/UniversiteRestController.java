package tn.esprim.gestionfoyer.controllers;

import tn.esprim.gestionfoyer.entities.Universite;
import tn.esprim.gestionfoyer.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    @Autowired
    private IUniversiteService universiteService;

    //http://localhost:8088/foyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    //http://localhost:8088/foyer/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long id) {
        Universite universite = universiteService.retrieveUniversite(id);
        return universite;
    }

    //http://localhost:8088/foyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    //http://localhost:8088/foyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long id) {
        universiteService.removeUniversite(id);
    }

    //http://localhost:8088/foyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.modifyUniversite(u);
        return universite;
    }
}

