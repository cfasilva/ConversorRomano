/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Conversor.ConversorRomano;

/**
 * @author cfasilva
 */
public class ConversorRomanoTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void deveEntenderOSimboloI(){
        ConversorRomano conversor = new ConversorRomano();
        int numero = conversor.Converte("I");
        
        assertEquals(1, numero);
    }
    
}
