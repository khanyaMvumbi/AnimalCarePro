/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.Encapsulation.Correction;

import cput.designprinceplespro.Service.ISP.Correction.impl.FeedAnimal;
import cput.designprinceplespro.Service.ISP.Correction.impl.Sick;
import java.util.Map;

/**
 *
 * @author Khanya
 */
public class AnimalCorrection implements Sick, FeedAnimal{
 private String name;
 private String PetsOwner;
 private int age;
 private String animalType;
 private String color;
 
 public AnimalCorrection()
 {
     
 }
 public AnimalCorrection(Map<Integer, String> m)
 {     
     this.name = m.get(1);
     this.age = Integer.parseInt(m.get(2)); 
     PetsOwner = m.get(3);
     animalType =  m.get(4);
     color =  m.get(5);
 }
 

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the PetsOwner
     */
    public String getPetsOwner() {
        return PetsOwner;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the animalType
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * @param animalType the animalType to set
     */    
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    
    public boolean isSick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean feedAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
 
    
}
