package com.ecommerce.microcommerce.model;

public class Character {

    private String name ;
    private int ID;
    private boolean type;


    //ICI Declaration des attributs de character
    //ID NAME CLASSE PERSO
    //getter setter
    //constructeur avec 0 arguments ==> Convention . On définit toujours un constructeur vide.
    //constructeur avec 3 arguments


    public Character (String nomJoueur, int Identifiant , boolean typeWarrior ) {
        this.name = nomJoueur;
        this.ID = Identifiant;
        this.type = typeWarrior;
    }


    public String getName() {
        return(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return (this.ID);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean getType() {
        return (this.type);
    }

    public void setType(boolean type) {
        this.type = type;
    }
}



