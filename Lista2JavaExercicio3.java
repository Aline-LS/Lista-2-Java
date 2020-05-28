/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg2.java.exercicio.pkg3;

/**
 *
 * @author Aline
 */
public class Lista2JavaExercicio3 {
    public static void main(String[] args) {
        
        int num;
        int den;
        int somanum = 0;
        int somaden = 0;
        double divisao;
        double divisaodasoma;
        
        
        for(num=1; num<=99;  num+=2){
            somanum = somanum+num;    
        }
        for(den=1; den<=50; den+=1){
            somaden = somaden+den;
        }
            divisao = num/den;
            divisaodasoma = somanum/somaden;
        
            System.out.println(num+ "/" +den+ "=" +divisao);
            System.out.println(somanum+ "/" +somaden+ "=" +divisaodasoma);

    

    }
    
}
