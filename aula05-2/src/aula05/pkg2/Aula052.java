/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05.pkg2;

import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Aula052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Valor de A: ");
        double a = scan.nextDouble();
        
        System.out.println("Valor de B: ");
        double b = scan.nextDouble();

        scan.close();
        
        double soma = a + b;
        
        System.out.println(soma);
    }
    
}
