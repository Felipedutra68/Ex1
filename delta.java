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
public class delta {
    
     public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 
    
       System.out.println("Digite o valor de a: ");
       double a = teclado.nextDouble();
       
       System.out.println("Digite o valor de b: ");
       double b = teclado.nextDouble();
       
       System.out.println("Digite o valor de c: ");
       double c = teclado.nextDouble();
       
       double d1 = Math.pow(b, 2) - 4 * a * c;
       
        System.out.println("O valor de delta eh:"+ d1);  
        

     }  
}
