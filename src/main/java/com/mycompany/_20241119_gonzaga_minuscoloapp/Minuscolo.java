package com.mycompany._20241119_gonzaga_minuscoloapp;
import java.util.Scanner;

public class Minuscolo {

   public int TANTI = 30; 
   
   public String stringa;
   
   public void InputUtenteOggetto () {
       
       Scanner Input = new Scanner(System.in);
       System.out.println("Inserisci una frase: ");
       
       char[] minuscolo = new char[TANTI];
       
       stringa = Input.nextLine();
   }
   
   public void LettereMinuscole () {
       
      for (int x = 0; x < stringa.length(); x++){
          
          minuscolo[x] = stringa.charAt(x);
          
      }
       
   }
    
}
