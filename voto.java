/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class voto {
    
   public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 
   
   
    System.out.println("Digite a sua idade: ");
       double i1 = teclado.nextDouble();
           
       if (i1 >= 16) {
           
        System.out.println("Voce tem idade para votar");
        
       } else {
           
       System.out.println("Sai daqui crianca");  
       
       
           
       } 
        
       
  }
}
