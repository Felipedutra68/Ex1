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
public class velocidade {
    
     public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 
     
     System.out.println("Digite a velocidade: ");
       double v1 = teclado.nextDouble();
     
       if (v1 >80) {
           
       double m1 = ((v1 - 80)*5);    
           
        System.out.println("Voce estava acima da velocidade sua multa eh de:R$"+m1);    
          
       } else {
      System.out.println("Voce nao tem nenhume multa"); 
        
        
                
       }
     
     } 
     
}
