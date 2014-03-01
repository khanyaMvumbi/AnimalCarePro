/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Service.LSP.Correction;

import cput.designprinceplespro.Service.Encapsulation.Correction.AnimalCorrection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Khanya
 */
public class LSPCorrection extends AnimalCorrection  {
    private List <AnimalCorrection> l = new ArrayList<>();
    private Map <Integer, String> m = new HashMap<>();  
    private LSPCorrection lsp;
    
    public void AddAnimal()
    {
        m.put(1, "Bruce");
        m.put(1, "3");
        m.put(1, "Dog");
        m.put(1, "Anele");
        m.put(1, "black");        
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Williams");
        m.put(1, "6");
        m.put(1, "Dog");
        m.put(1, "Skit");
        m.put(1, "black");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Darlington");
        m.put(1, "5");
        m.put(1, "Cat");
        m.put(1, "Susan");
        m.put(1, "black");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Meow");
        m.put(1, "2");
        m.put(1, "Cat");
        m.put(1, "bryan");
        m.put(1, "White");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
        m.put(1, "Sting");
        m.put(1, "3");
        m.put(1, "Dog");
        m.put(1, "allen");
        m.put(1, "black");
        lsp = (LSPCorrection) new AnimalCorrection(m);
        
    }
    
    
}
