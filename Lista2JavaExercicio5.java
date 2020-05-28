/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg5;

/**
 *
 * @author Aline
 */
import java.util.Scanner;
public class Lista2JavaExercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int valor;
        int numero;
        int somapares = 0;
        int somaimpares = 0;
        
        System.out.println("Digite um número");
        numero = ler.nextInt();
        
        for (valor=0; valor<=numero; valor++){
            System.out.println("valor ="+valor);
            if (numero>1000){
                System.out.println("Esse número não é aceito");
            }
            else{
                if (valor%2==0){
                    somapares = somapares+valor;
                    }
                else {
                    somaimpares = somaimpares+valor;
                }
                }
        }
        System.out.println("A soma dos valores pares é = "+somapares);
        System.out.println("A soma dos valores impares é = "+somaimpares);
    }
    
}
