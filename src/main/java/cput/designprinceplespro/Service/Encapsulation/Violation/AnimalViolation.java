/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.Encapsulation.Violation;

import cput.designprinceplespro.Service.ISP.Violation.AnimalCare;
import java.util.Map;

/**
 *
 * @author Khanya
 */
public class AnimalViolation {
 private String name;
 private String PetsOwner;
 private int age;
 private String animalType;
 private String color;
 
 
 public AnimalViolation()
 {
     
 }
 public AnimalViolation(Map<Integer, String> m)
 {     
     this.name = m.get(1);
     this.age = Integer.parseInt(m.get(2)); 
     PetsOwner = m.get(3);
     animalType =  m.get(4);
     color =  m.get(5);
 }
 public void setName(String name)
 {
     this.name = name;
 }
 public void setAge(int age)
 {
     this.age = age; 
     
 }
 public void petsOwner(String owner)
 {
     PetsOwner = owner;
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
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean feedAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean takeTreatment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean washAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
 
    
}
