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
public class notas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Digite seu nome:");
        String n = teclado.nextLine();

        System.out.println("Digite sua nota em matematica:");
        double n1 = teclado.nextDouble();

        System.out.println("Digite sua nota em fisica:");
        double n2 = teclado.nextDouble();
        
        double m1 = (n1 + n2) / 2;

         if (m1 >= 7) {
            System.out.println("Voce foi aprovado");
        
        } else if (m1 >= 5 && m1 < 7)  {
       
            System.out.println("Recuperacao");
                         
        } else { 
        System.out.println("Voce rodou");
        
        
      }

    }
}
