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
public class atesedepois {
    
    
     public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in); 
    
    
       System.out.println("Digite um numero: ");
       double n1 = teclado.nextDouble();
       
       
     System.out.println("O antecessor eh " + (n1 - 1));
     System.out.println("O sucessor eh:" + (n1 + 1));

    
     } 
    
}
