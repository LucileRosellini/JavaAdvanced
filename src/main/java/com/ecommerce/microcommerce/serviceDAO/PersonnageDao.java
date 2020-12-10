package com.ecommerce.microcommerce.serviceDAO;
import com.ecommerce.microcommerce.model.Personnage;
import java.util.ArrayList;

public interface PersonnageDao{
    public ArrayList<Personnage>findAll();
    public Personnage findById(int id);
    public Personnage save(Personnage product);
}

