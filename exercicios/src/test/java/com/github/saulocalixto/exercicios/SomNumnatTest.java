/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.github.saulocalixto.exercicios;

import com.github.saulocalixto.exercicios.SomNumnat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saulocalixto
 */
public class SomNumnatTest {
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numInvalido() {
        
        SomNumnat.somNume(-1);
    }

    /**
     *
     */
    @Test
    public void numValido() {
        
        SomNumnat.somNume(5);
    }
    
    /**
     *
     */
    @Test
    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
        new SomNumnat();
    }

   
    
}
