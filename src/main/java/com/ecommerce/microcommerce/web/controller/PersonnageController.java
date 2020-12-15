package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Personnage;
import com.ecommerce.microcommerce.serviceDAO.PersonnageBdd;
import com.ecommerce.microcommerce.serviceDAO.PersonnageDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.ArrayList;

@Api(value="API pour es opérations CRUD sur les personnages.")
@RestController
public class PersonnageController {


    @Autowired
    private PersonnageDao personnageDao;

    @ApiOperation(value = "Affiche la liste des personnage en stock!")
    @RequestMapping(value = "/personnages", method = RequestMethod.GET)
    public ArrayList<Personnage> listePersonnages() {
        return personnageDao.findAll();

    }

    @ApiOperation(value = "Récupère un personnage grâce à son ID à condition que celui-ci soit en stock!")
    @GetMapping(value = "/personnage/{id}")
    public Personnage afficherUnPersonnage(@PathVariable int id) {
        return personnageDao.findById(id);

    }

    @ApiOperation(value = "Permet d'ajouter un personnage")
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

    @ApiOperation(value = "Permet de mettre à jour un personnage")
    @PutMapping(value = "/personnage/{id}")
    public ResponseEntity MettreAjour (@RequestBody Personnage personnage,@PathVariable int id){

        PersonnageBdd personnageBdd =new PersonnageBdd();
        if(personnage ==null){
            return ResponseEntity.notFound().build();
        }
        if(personnageBdd.listPersonnage.size()<id){
            return ResponseEntity.noContent().build();
        }

        Personnage personnage3 = personnageDao.update(personnage);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(personnage3.getID())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}


//@Autowired => Crée une instance de Character permet d'avoir accés à toutes ses méthodes avec character
//@RequestMapping => mapper une requête HTTP à une méthode en utilisant certains critères de base.
//@PathVariable est une annotation Spring qui indique qu'un paramètre de méthode doit être lié à une variable de modèle d'URI.

