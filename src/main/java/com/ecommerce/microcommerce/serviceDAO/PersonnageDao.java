package com.ecommerce.microcommerce.serviceDAO;
import com.ecommerce.microcommerce.model.Personnage;
import java.util.List;

public interface PersonnageDao{
    public List<Personnage>findAll();
    public Personnage findById(int id);
    public Personnage save(Personnage product);
}

