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
public class Exercicio_pag50 {
   public static void main (String[]arg){
       Scanner entrada ;
        entrada = new Scanner(System.in);
        float custo,convite,qtd;
        System.out.println("Digite o valor do custo ");
        custo=entrada.nextFloat();
        System.out.println("Digite o número de convites ");
        convite=entrada.nextFloat();
        qtd=custo/convite;
        System.out.println("A quantidade de convites que devem ser vendidos é "+qtd);
    }

}
