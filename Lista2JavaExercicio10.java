/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg10;

/**
 *
 * @author Aline
 */
import java.util.Scanner;
public class Lista2JavaExercicio10 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
     int produtosdonumero;
     int numero;
     int cont;
     int cont1;
     
     System.out.println("Digite um número para saber os numeros primos que nele tem:");
     numero = ler.nextInt();
     
    for(cont=1; cont<=numero; cont++){
        produtosdonumero = 0;
        for(cont1=1; cont1<=cont; cont1++){
            if(cont%cont1==0){
                produtosdonumero = produtosdonumero+1;
            }
        }
        if (produtosdonumero==2){
            System.out.println("primo:" +cont);
        }
    }
     
    }
    
}
