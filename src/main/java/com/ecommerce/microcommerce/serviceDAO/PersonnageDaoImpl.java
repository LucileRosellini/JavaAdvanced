package com.ecommerce.microcommerce.serviceDAO;
import com.ecommerce.microcommerce.model.Personnage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;



@Repository
public class PersonnageDaoImpl implements PersonnageDao{

    private PersonnageBdd personnageBdd =new PersonnageBdd();


    @Override
    public ArrayList<Personnage> findAll() {
        return personnageBdd.getListPersonnages();
    }

    @Override
    public Personnage findById(int id) {
        for (Personnage personnage : personnageBdd.getListPersonnages()) {
            if(personnage.getID()== id){
                return personnage;
            }
        }
        return null;
    }

    @Override
    public Personnage save(Personnage personnage) {
        personnageBdd.listPersonnage.add(personnage);
        return personnage;
    }

   @Override
    public Personnage delete(int id){
        for(Personnage personnage: personnageBdd.getListPersonnages()){
            if (personnage.getID()==id){
                personnageBdd.listPersonnage.remove(personnage);
                return personnage;
            }
        }
        return null;
    }

    @Override
    public Personnage update(Personnage newPersonnage){
        //for(Personnage personnage: personnageBdd.getListPersonnages()){
            //if (personnage.getID()==newPersonnage.getID()){
               // int id = personnageBdd.listPersonnage.indexOf(personnage);
                //personnageBdd.listPersonnage.set(id,newPersonnage);
                //return newPersonnage;
           // }
        //}
        //return null;
        Personnage personnageUdated=findById(newPersonnage.getID());
        personnageUdated.setName(newPersonnage.getName());
        personnageUdated.setType(newPersonnage.getType());
        return personnageUdated;
    }
}