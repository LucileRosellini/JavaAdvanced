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
}
