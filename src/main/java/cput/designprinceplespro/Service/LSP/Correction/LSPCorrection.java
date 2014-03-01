/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.LSP.Correction;

import cput.designprinceplespro.Service.Encapsulation.Correction.AnimalCorrection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Khanya
 */
public class LSPCorrection extends AnimalCorrection  {
    private Map <Integer, String> m = new HashMap<>();  
    private static  AnimalCorrection lsp;
    
    public void AddAnimal()
    {
        m.put(1, "Bruce");
        m.put(2, "3");
        m.put(3, "Dog");
        m.put(4, "Anele");
        m.put(5, "black");        
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Williams");
        m.put(2, "6");
        m.put(3, "Dog");
        m.put(4, "Skit");
        m.put(5, "black");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Darlington");
        m.put(2, "5");
        m.put(3, "Cat");
        m.put(4, "Susan");
        m.put(5, "black");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Meow");
        m.put(2, "2");
        m.put(3, "Cat");
        m.put(4, "bryan");
        m.put(5, "White");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Sting");
        m.put(2, "3");
        m.put(3, "Dog");
        m.put(4, "allen");
        m.put(5, "black");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
    }
    
    
}
