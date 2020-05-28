/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg7;

/**
 *
 * @author Aline
 */

import java.util.Scanner;
public class Lista2JavaExercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Scanner ler1 = new Scanner (System.in);
        
        double mediafinal;
        double menormedia = 10;
        double maiormedia = 0;
        double mediaturma = 0;
        double soma = 0;
        int numeroalunos;
        int cont;
        
        System.out.println("Quantos alunos há na turma?");
        numeroalunos = ler.nextInt();
        
        for (cont=1; cont<=numeroalunos; cont++){
            System.out.printf("A media do aluno " +cont+ " é =");
            mediafinal = ler1.nextDouble();
            
            if (mediafinal<0){
                System.out.println("Essa nota não é valida");
            }
            else{
                soma = soma+mediafinal;
                        if(maiormedia<mediafinal){
                            maiormedia = mediafinal;
                        }
                        
                        if(menormedia>mediafinal){
                            menormedia = mediafinal;
                        }
                        
            }
        }
        mediaturma = soma/numeroalunos;
        
        System.out.println("A maior média é: "+maiormedia);
        System.out.println("A menor média é: "+menormedia);
        System.out.println("A média da turma é: "+mediaturma);
        
    }
    
}
