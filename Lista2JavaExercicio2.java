/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg2;

/**
 *
 * @author Aline
 */

import java.util.Scanner;
public class Lista2JavaExercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numero;
        int cont;
        
        System.out.println("Escreva um número na qual deseja saber a taboada de 0 à 9");
        numero = ler.nextInt();
        
        for(cont=0; cont<=9;cont++){
            System.out.println(numero+"x"+cont+"="+numero*cont);
        }
    }
    
}
