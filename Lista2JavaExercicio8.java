/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg8;

/**
 *
 * @author Aline
 */
import java.util.Scanner;
public class Lista2JavaExercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int IP[] = new int [1000];
        int cont1;
        int numero;
        
        System.out.println("Escolha um número");
        numero = ler.nextInt();
        

            for(cont1=0; cont1<=numero; cont1++){
                if(cont1%2==0){
                    IP[cont1] =cont1;
                    System.out.println("Par:" +IP[cont1]);
                }else{
                    IP[cont1] = cont1;
                    System.out.println("Impar:" +IP[cont1]);
                    
                }            
            }     
    }   
}
