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
public class salario {
    
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in); 
    
    
       System.out.println("Digite seu nome");
       String nome = teclado.nextLine();
       
       System.out.println("Digite o valor de seu salario: ");
       double s1 = teclado.nextDouble(); 
       
     System.out.println("Ola " + nome);
     System.out.println("Seu salario eh de:" + s1);
     
    }
     
}