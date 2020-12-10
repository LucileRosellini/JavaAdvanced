package com.ecommerce.microcommerce.serviceDAO;

import com.ecommerce.microcommerce.model.Personnage;


import java.util.ArrayList;

public class PersonnageBdd {
    public static ArrayList<Personnage> getListCharacter(){
        ArrayList <Personnage> listPersonnage=new ArrayList<Personnage>();
        listPersonnage.add(new Personnage("Gandalf", 0, false));
        listPersonnage.add(new Personnage("Melchior", 1, false));
        listPersonnage.add(new Personnage("Chaussette", 2, false));
        listPersonnage.add(new Personnage("Edmund", 3, false));
        listPersonnage.add(new Personnage("Tinky", 4, false));
        listPersonnage.add(new Personnage("Agatha", 5, false));
        listPersonnage.add(new Personnage("Elminster", 6, false));
        listPersonnage.add(new Personnage("Tara", 7, false));
        listPersonnage.add(new Personnage("Mandrakef", 8, false));
        listPersonnage.add(new Personnage("Merlin", 9, false));
        listPersonnage.add(new Personnage("Wendy", 10, false));
        listPersonnage.add(new Personnage("Misstic", 11, false));
        listPersonnage.add(new Personnage("Black", 12, false));
        listPersonnage.add(new Personnage("Pixie", 13, false));
        listPersonnage.add(new Personnage("Viviane", 14, false));

        listPersonnage.add(new Personnage("Beowulf", 15, true));
        listPersonnage.add(new Personnage("Ganthar", 16, true));
        listPersonnage.add(new Personnage("Muther", 17, true));
        listPersonnage.add(new Personnage("Sheera", 18, true));
        listPersonnage.add(new Personnage("Entrapta", 19, true));
        listPersonnage.add(new Personnage("Demonia", 20, true));
        listPersonnage.add(new Personnage("Isildur", 21, true));
        listPersonnage.add(new Personnage("Catra", 22, true));
        listPersonnage.add(new Personnage("Elisabeth", 23, true));
        listPersonnage.add(new Personnage("Fleche", 24, true));
        listPersonnage.add(new Personnage("Olween", 25, true));
        listPersonnage.add(new Personnage("Thalos", 26, true));
        listPersonnage.add(new Personnage("Nessa", 27, true));
        listPersonnage.add(new Personnage("Ragnor", 28, true));
        listPersonnage.add(new Personnage("Lilith", 29, true));

        return listPersonnage;
    }
}
