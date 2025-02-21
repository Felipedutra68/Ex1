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
public class baskara {
    
    
    
     public static void main(String[] args) {
    
     Scanner teclado = new Scanner(System.in); 
    
       System.out.println("Digite o valor de a: ");
       double a = teclado.nextDouble();
       
       System.out.println("Digite o valor de b: ");
       double b = teclado.nextDouble();
       
       System.out.println("Digite o valor de c: ");
       double c = teclado.nextDouble();
       
       double d1 = Math.pow(b, 2) - 4 * a * c;
         
       if (d1 < 0) {
         System.out.println("Nao existe raix real");
       } else {
           
       double x1 = (-b + Math.sqrt(d1)) / (2 * a);   
       double x2 = (-b - Math.sqrt(d1)) / (2 * a);  
                
       System.out.println("Digite o valor de x1 eh:" + x1);
       System.out.println("Digite o valor de x2 eh:" + x2);
           
           
       }
       
       
     }
}
