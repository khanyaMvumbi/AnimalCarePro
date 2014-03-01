/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.Inheritance.Correction;


import cput.designprinceplespro.Service.Encapsulation.Correction.AnimalCorrection;
import cput.designprinceplespro.Service.ISP.Correction.impl.FeedAnimal;

/**
 *
 * @author Khanya
 */
public class FeedingAnimal extends AnimalCorrection implements FeedAnimal{

    boolean feed = true;
    public boolean feedAnimal() {
        return feed;
    }
    
    
}
