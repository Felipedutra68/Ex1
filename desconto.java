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
public class desconto {
    
    public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in); 
    
     System.out.println("Digite o preco do produto");
     double v1 = teclado.nextDouble();
     
    double d1 = v1*0.05;
    double ds1 = v1 - d1; 
            
    System.out.printf("O valor do produto eh:R$ %.2f",ds1 );

    
    }  
}
