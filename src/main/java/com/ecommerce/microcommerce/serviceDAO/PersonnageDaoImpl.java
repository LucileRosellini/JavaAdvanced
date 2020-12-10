package com.ecommerce.microcommerce.serviceDAO;
import com.ecommerce.microcommerce.model.Personnage;
import com.ecommerce.microcommerce.serviceDAO.PersonnageBdd;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PersonnageDaoImpl implements PersonnageDao{

   private static PersonnageBdd personnageBdd =new PersonnageBdd();


    @Override
    public ArrayList<Personnage> findAll() {
        return personnageBdd.getListCharacter();
    }

    @Override
    public Personnage findById(int id) {
        for (Personnage personnage : personnageBdd.getListCharacter()) {
            if(personnage.getID()== id){
                return personnage;
            }
        }
        return null;
    }

    @Override
    public Personnage save(Personnage personnage) {
        personnageBdd.getListCharacter().add(personnage);
        return personnage;
    }
}
