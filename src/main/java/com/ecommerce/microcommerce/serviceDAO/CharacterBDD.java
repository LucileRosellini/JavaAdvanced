package com.ecommerce.microcommerce.serviceDAO;

import com.ecommerce.microcommerce.model.Character;

import java.util.ArrayList;

public class CharacterBDD {

    public ArrayList<Character> ListCharacter(){
        ArrayList <Character> ListCharacter=new ArrayList<Character>();
        ListCharacter.add(new Character("Gandalf", 0, false));
        ListCharacter.add(new Character("Melchior", 1, false));
        ListCharacter.add(new Character("Chaussette", 2, false));
        ListCharacter.add(new Character("Edmund", 3, false));
        ListCharacter.add(new Character("Tinky", 4, false));
        ListCharacter.add(new Character("Agatha", 5, false));
        ListCharacter.add(new Character("Elminster", 6, false));
        ListCharacter.add(new Character("Tara", 7, false));
        ListCharacter.add(new Character("Mandrakef", 8, false));
        ListCharacter.add(new Character("Merlin", 9, false));
        ListCharacter.add(new Character("Wendy", 10, false));
        ListCharacter.add(new Character("Misstic", 11, false));
        ListCharacter.add(new Character("Black", 12, false));
        ListCharacter.add(new Character("Pixie", 13, false));
        ListCharacter.add(new Character("Viviane", 14, false));

        ListCharacter.add(new Character("Beowulf", 15, true));
        ListCharacter.add(new Character("Ganthar", 16, true));
        ListCharacter.add(new Character("Muther", 17, true));
        ListCharacter.add(new Character("Sheera", 18, true));
        ListCharacter.add(new Character("Entrapta", 19, true));
        ListCharacter.add(new Character("Demonia", 20, true));
        ListCharacter.add(new Character("Isildur", 21, true));
        ListCharacter.add(new Character("Catra", 22, true));
        ListCharacter.add(new Character("Elisabeth", 23, true));
        ListCharacter.add(new Character("Fleche", 24, true));
        ListCharacter.add(new Character("Olween", 25, true));
        ListCharacter.add(new Character("Thalos", 26, true));
        ListCharacter.add(new Character("Nessa", 27, true));
        ListCharacter.add(new Character("Ragnor", 28, true));
        ListCharacter.add(new Character("Lilith", 29, true));

        return ListCharacter;
    }
}
