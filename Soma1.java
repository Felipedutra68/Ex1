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
public class Soma1 {
    
    
 public static void main(String[] args) {
     
  Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite o primeiro numero: ");
       int n1 = teclado.nextInt();
       
       System.out.println("Digite o segundo numero: ");
       int n2 = teclado.nextInt();
                                                    
       //int s1 = n1 +n2;
       
          int m1 = (n1 +n2) / 2;  
        
       System.out.println("A soma dos numeros eh:" +m1); 
       
  
     
 }    
    
    
}
