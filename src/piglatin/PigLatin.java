/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

import java.util.Scanner;

/**
 *
 * @author Saleron
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word, consonants, vowels, again;
        char first, vowelChar, consonantChar;
        int i, a = 0, b = 0;
       
        
        vowels = "aeiou";
        consonants = "bcdfghjklmnpqrstvwxyz";
        
        Scanner input = new Scanner(System.in);
        
       
                    
                
            System.out.println("Type in a word: ");
            word = input.nextLine();
        
            for (i = 0; i < vowels.length(); i++)
                {
                    first = word.toLowerCase().charAt(0);
                    vowelChar = vowels.charAt(i);
                    if (vowelChar == first)
                        {
                            a++;
                        }
                
                }
            for (i = 0; i < consonants.length(); i++)
                {
                    first = word.toLowerCase().charAt(1);
                    consonantChar = consonants.charAt(i);
                    if (consonantChar == first)
                        {
                            b++;
                        }
                
                }
        
            if (a > 0)
                {
                    System.out.println("The pig latin is: " + word + "ay"); 
                }
        
            if (a == 0 && b == 0)
                {
                    System.out.println("The pig latin is: " + word.substring(1, word.length()) + word.substring(0, 1) + "ay");
                }
        
            if (a ==0 && b == 1)
                {
                    System.out.println("The pig latin is: " + word.substring(2, word.length()) + word.substring(0, 2) + "ay");
                }
               
    }
    
}
