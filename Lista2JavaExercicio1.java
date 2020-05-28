/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg1;

/**
 *
 * @author Aline
 */

import java.util.Scanner;
public class Lista2JavaExercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n;
        int maior = 0;
        int menor = 0;
        int cont;
        int x;
        
        x=0;
        System.out.println("Digite 15 números");
        
        for(cont=1; cont<=15; cont++){
            n = ler.nextInt();
            if(x<=0){
                maior = n;
                menor = n;
                x=1;
            }
            if (maior<n){
                maior = n;
            }
            if (menor>n){
                menor = n;
            }   
        }
        System.out.println("O maior número é " +maior);
        System.out.println("O menor número é " +menor);       
}
}
