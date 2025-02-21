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
public class alugel {


    public static void main(String[] args) {

     Scanner teclado = new Scanner(System.in);  
     
    System.out.println("Digite a kilometragem do carro");
       double k1 = teclado.nextDouble();
       
       System.out.println("Quantos dias voce alugou o carro");
       double d1 = teclado.nextDouble(); 
     
       double vk = k1 * 0.20;
       double vd = d1 * 90;
       double t1 = vk + vd;
       
     System.out.println("O valor do alugel do carro eh:R$"+t1);
     
        
     
  }


}
