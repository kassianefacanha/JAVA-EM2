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
public class Exercicio_pag48_1 {
     public static  void main(String[]arg){
        Scanner entrada ;
        entrada = new Scanner(System.in);
        double vlr_sal, qtd_kw, vlr_kw,vlr_real,desc,vlr_desc;
        System.out.println("Digite o valor  do salário");
        vlr_sal=entrada.nextFloat();
        vlr_kw= vlr_sal/5;
        System.out.println("Digite a quantidade de quilowatt");
        qtd_kw=entrada.nextFloat();
        vlr_real=vlr_kw*qtd_kw;
        desc=(vlr_real* 15)/100;
        vlr_desc=vlr_real-desc;
        System.out.println("O valor de quilowatt é "+vlr_kw+" \n O valor em reais é "+vlr_real+"\n O valor do desconto é "+vlr_desc);
    }
}
