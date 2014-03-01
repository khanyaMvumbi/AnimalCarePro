/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.designprinceplespro.LSP.Correction;

import cput.designprinceplespro.Service.Encapsulation.Correction.AnimalCorrection;
import cput.designprinceplespro.Service.LSP.Correction.LSPCorrection;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Khanya
 */
public class TestLSPCorrection {
    
    public TestLSPCorrection() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private static AnimalCorrection corre;
    private Map <Integer, String> m = new HashMap<Integer, String>();
     @Test
     public void testAddAnimal() {
         
        m.put(1, "Bruce");
        m.put(2, "3");
        m.put(3, "Dog");
        m.put(4, "Anele");
        m.put(5, "black");    
        corre = new AnimalCorrection(m);
         Assert.assertEquals("Good", "Bruce", corre.getName());
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(LSPCorrection.class);
        corre = (LSPCorrection) ctx.getBean("LSPCorrection");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
