/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.Inheritance.Violation;

import cput.designprinceplespro.Service.Encapsulation.Correction.AnimalCorrection;
import cput.designprinceplespro.Service.ISP.Violation.AnimalCare;

/**
 *
 * @author Khanya
 */
public class ServiceAnimal extends AnimalCorrection implements AnimalCare{
   boolean clean = true;
   public boolean washClean() {
       return clean;
     }

    public boolean takeTreatment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean washAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean feedAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isSick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
