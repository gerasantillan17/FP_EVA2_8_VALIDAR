/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication43;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("Numero correspondiente del dia:");
        dia = captu.nextInt();
          }while(dia < 1 || dia > 7);
          
    }
}
