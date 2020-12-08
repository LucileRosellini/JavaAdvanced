package com.ecommerce.microcommerce.serviceDAO;

import com.ecommerce.microcommerce.model.Character;

import java.util.ArrayList;

public class CharacterBDD {

    public ArrayList<Character> ListCharacter(){
        ArrayList <Character> ListCharacter=new ArrayList<Character>();
        ListCharacter.add(new Character());
        return ListCharacter;
    }
}
