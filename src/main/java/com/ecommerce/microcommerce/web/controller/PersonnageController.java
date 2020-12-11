package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Personnage;
import com.ecommerce.microcommerce.serviceDAO.PersonnageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.ArrayList;

@RestController
public class PersonnageController {


    @Autowired
    private PersonnageDao personnageDao;

    //Récupérer la liste des personnages
    @RequestMapping(value = "/personnages", method = RequestMethod.GET)
    public ArrayList<Personnage> listePersonnages() {
        return personnageDao.findAll();

    }

    //Récupérer un personnage par son Id
    @GetMapping(value = "/personnage/{id}")
    public Personnage afficherUnPersonnage(@PathVariable int id) {
        return personnageDao.findById(id);

    }

   @DeleteMapping(value="/personnage/{id}")
    public Personnage SupprimerUnPersonnage(@PathVariable int id){
        return personnageDao.delete(id);
   }

    @PostMapping(value = "/personnages")
    public ResponseEntity AjouterPersonnage(@RequestBody Personnage personnage) {
        if (personnage == null) {
            return ResponseEntity.noContent().build();
        }
        Personnage personnage2 = personnageDao.save(personnage);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(personnage2.getID())
                .toUri();
        return ResponseEntity.created(location).build();
        //stackoverflow https://stackoverflow.com/questions/42546141/add-location-header-to-spring-mvcs-post-response

    }


}


//@Autowired => Crée une instance de Character permet d'avoir accés à toutes ses méthodes avec character
//@RequestMapping => mapper une requête HTTP à une méthode en utilisant certains critères de base.
//@PathVariable est une annotation Spring qui indique qu'un paramètre de méthode doit être lié à une variable de modèle d'URI.

