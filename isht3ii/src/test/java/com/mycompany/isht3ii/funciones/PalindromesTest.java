
package com.mycompany.isht3ii.funciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class PalindromesTest {
    
    @Test
    public void testVacia() {
        System.out.println("cadena vacia");
        String word = "";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPares(){
        System.out.println("cadena par 1001 palindromo");
        String word = "1001";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testImpares(){
        System.out.println("cadena impar !0a0! palindromo");
        String word = "!0a0!";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);        
    }
    
    
    @Test
    public void testFalso(){
        System.out.println("prueba de retorno false");
        String word = "HOLA";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertNotEquals(expResult, result);        
    }
    
    @Test
    public void testEspacio(){
        System.out.println("prueba de importancia de espacios");
        String word = "ali tomo tila";
        String word2 = "alitomotila";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        boolean result2 = instance.evaluate(word2);
        assertNotEquals(expResult, result);        
        assertEquals(expResult, result2);
        
    }
    
    @Test
    public void testMayuscula(){
        System.out.println("prueba de importancia de mayusculas");
        String word = "Ho-oh";
        String word2 = "Ho-oH";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        boolean result2 = instance.evaluate(word2);
        assertNotEquals(expResult, result);        
        assertEquals(expResult, result2);        
    }
    
    @Test
    public void testEspacioTabulador(){
        System.out.println("prueba de texto solo con espacios y tabuladores");
        String word = "  \t  ";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);          
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testCaracterUnico(){
        System.out.println("prueba de caracteres unicos");
        String caracter = "a";
        String caracter2 = "1";
        String caracter3 = " ";
        String caracter4 = "@";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(caracter);
        boolean result2 = instance.evaluate(caracter2);
        boolean result3 = instance.evaluate(caracter3);
        boolean result4 = instance.evaluate(caracter4);
        assertEquals(expResult, result);        
        assertEquals(expResult, result2);        
        assertEquals(expResult, result3);        
        assertEquals(expResult, result4);
    }
    
    
}
