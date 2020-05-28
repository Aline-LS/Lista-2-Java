/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg9;

/**
 *
 * @author Aline
 */
import java.util.Scanner;
public class Lista2JavaExercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int produtosdonumero = 0;
        int cont;
        int numero;
        
        System.out.println("Digite um valor:");
        numero = ler.nextInt();
        
        for (cont=1; cont<=numero; cont++){
            if (numero%cont==0){
                produtosdonumero = produtosdonumero+1;
            }
        }
            if (produtosdonumero == 2){
                System.out.println("Esse é um número primo");
            }else{
                System.out.println("Esse não é um número primo");
            }
        
    }
    
}
