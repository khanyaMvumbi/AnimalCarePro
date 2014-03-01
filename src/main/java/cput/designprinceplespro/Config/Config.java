/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.Config;

import cput.designprinceplespro.Service.Encapsulation.Correction.AnimalCorrection;
import cput.designprinceplespro.Service.Encapsulation.Violation.AnimalViolation;
import cput.designprinceplespro.Service.Inheritance.Correction.checkSickness;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Khanya
 */
public class Config {
    
    @Bean (name = "InheritanceCorr")
    public checkSickness corr()
    {
        return new checkSickness();
    }
    
    @Bean (name = "LSPViolation")
    public AnimalViolation care()
    {
        return new AnimalViolation();
    }
    
    @Bean (name = "LSPCorrection")
    public AnimalCorrection correction()
    {
        return new AnimalCorrection();
    }
    
    
}
