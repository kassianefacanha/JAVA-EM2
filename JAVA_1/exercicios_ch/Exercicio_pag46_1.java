/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios_ch;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Exercicio_pag46_1 {
     public static void main(String[]arg){
    Scanner entrada;
        entrada =  new Scanner (System.in);


        float  peso_saco,racao_gato1, racao_gato2,total_final;
        System.out.println("Digite o peso da ração do gato 1");
        racao_gato1=entrada.nextFloat();
        racao_gato1=racao_gato1 /100;
        System.out.println("Digite o peso da ração do gato 2");
        racao_gato2=entrada.nextFloat();
        racao_gato2=racao_gato2/1000;

        total_final= 5*(racao_gato1 + racao_gato2);
        System.out.println("O total final é "+ total_final);


    
}
}
