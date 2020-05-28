/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg6;

/**
 *
 * @author Aline
 */

import java.util.Scanner;
public class Lista2JavaExercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int v[] = new int [3];
        int n;
        double soma;
        double produto;
        double media;
           
        System.out.println("Algoritmo de conjunto de 3 numeros para soma, produto e media.");
        
        do{
            soma = 0;
            produto = 1;
            media = 0;
            
            for(n=0; n<=2; n++){
                System.out.println("Digite um valor");
                v[n] = ler.nextInt();
                soma = soma+v[n];
                produto = produto*v[n];
            
        }
        media = soma/3;            
        System.out.println("A soma dos valores é = "+soma);
        System.out.println("O produto dos valores é ="+produto);
        System.out.println("A media dos valores é ="+media);    
        
        }while (v[0]<v[1] || v[1]<v[2] || v[0]<v[2]);
              
    }    
}
