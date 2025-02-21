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
public class medidas {
    
    
     public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 

   System.out.println("Digite um valor em metros ");
       double n1 = teclado.nextDouble();
       
       
       System.out.println("O valor digitade em cm eh:" + (100*n1));
       System.out.println("O valor digitado em km eh:" + (n1 / 1000));

       
  } 

    
}
