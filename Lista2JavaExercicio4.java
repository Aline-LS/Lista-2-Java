/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg4;

/**
 *
 * @author Aline
 */
//import java.util.Scanner;
public class Lista2JavaExercicio4 {
    public static void main(String[] args) {
        
        int cont;
        
        for(cont=1001; cont<=1999; cont++){
            if(cont%11==5){
                System.out.println(cont+"%11="+cont%11);
            }
        }
    }
    
}
