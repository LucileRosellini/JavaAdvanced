package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.model.Personnage;
import com.ecommerce.microcommerce.serviceDAO.PersonnageBdd;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PersonnageController {

    ArrayList <Personnage> listCharacter= PersonnageBdd.getListCharacter();;

    @RequestMapping(value = "/personnages", method = RequestMethod.GET)
    public ArrayList<Personnage> viewCharacter() {
        return listCharacter;
    }

    @RequestMapping(value = "/personnage/{id}", method = RequestMethod.GET)
    //@RequestMapping => mapper une requête HTTP à une méthode en utilisant certains critères de base.
    // autre possibilité @GetMapping(value="/Produits/{id}")
    @ResponseBody
    public Personnage getIdCharacter(@PathVariable("id") Integer id) {
        for( Personnage valeur : listCharacter ) {
            if( valeur.getID() == id ) {
                return valeur;
            }if(valeur.getID()>listCharacter.size()){
                return null;
            }
        }
        return null;
    }
}




//@RequestMapping("/Hello")
// public String SayHi(){
//   return "Hello world!";
// private PersonnageBDD personnageBDD;
//@Autowired => Crée une instance de Character permet d'avoir accés à toutes ses méthodes avec character
//@RequestMapping => mapper une requête HTTP à une méthode en utilisant certains critères de base.
//@PathVariable est une annotation Spring qui indique qu'un paramètre de méthode doit être lié à une variable de modèle d'URI.
//
