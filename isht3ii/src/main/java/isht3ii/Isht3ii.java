package isht3ii;

import com.mycompany.isht3ii.funciones.Palindromes;


public class Isht3ii {


    public static void main(String[] args) {        
        
        Palindromes palindrome = new Palindromes();
        //Prueba palindromo 1
        System.out.println("La palabra ana es un palindromo: "+palindrome.evaluate("ana"));
        //Prueba palindromo 2
        System.out.println("La palabra hola es un palindromo: "+palindrome.evaluate("Hola"));
        //Prueba palindromo 3
        System.out.println("La cadena 11011 es un palindromo: "+palindrome.evaluate("11011"));
        //Prueba palindromo 4
        System.out.println("La cadena 110 es un palindromo: "+palindrome.evaluate("110"));
        //Prueba palindromo 5
        System.out.println("La letra f es un palindromo: "+palindrome.evaluate("f"));
        //Prueba palindromo 6
        System.out.println("La frase ali tomo tila es un palindromo: "+palindrome.evaluate("ali tomo tila"));
        //Prueba palindromo 7        
        System.out.println("una cadena vacia es un palindromo: "+palindrome.evaluate(""));
        //Prueba palindromo 8
        System.out.println("Los saltos de linea son palindromos: "+palindrome.evaluate("\n ala \n"));
        //Prueba palindromo 9        
        System.out.println("una cadena llena de espacios es un palindromo: "+palindrome.evaluate("        "));
        //Prueba palindromo 10
        System.out.println("una cadena con caracteres especiales es un palindromo: "+palindrome.evaluate("!@ 2hah2 @!"));        
        
    }
       
}
