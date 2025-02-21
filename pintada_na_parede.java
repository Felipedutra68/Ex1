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
public class pintada_na_parede {
    
    public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 
    
    System.out.println("Digite a autura da parede:");
       double a1 = teclado.nextDouble();
       
       System.out.println("Digite a largura de parede:");
       double l1 = teclado.nextDouble();
       
       double ar1 = a1*l1 ;
      
      System.out.println("Voce ira presisar comprar:"+ar1/2+ "litros de tinta"); 
       
    
       
  }  
    
}
