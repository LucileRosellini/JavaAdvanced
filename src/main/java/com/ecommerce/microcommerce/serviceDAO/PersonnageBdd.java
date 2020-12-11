package com.ecommerce.microcommerce.serviceDAO;

import com.ecommerce.microcommerce.model.Personnage;


import java.util.ArrayList;
import java.util.Arrays;

public class PersonnageBdd {

    public ArrayList <Personnage> listPersonnage=new ArrayList<>(

            Arrays.asList(
                    new Personnage("Gandalf",0,false),
                    new Personnage("Melchior",1,false),
                    new Personnage("Muther",2,true),
                    new Personnage("Sheera",3,true)

            )
    );

    public ArrayList<Personnage> getListPersonnages(){
        return listPersonnage;
    }



}

