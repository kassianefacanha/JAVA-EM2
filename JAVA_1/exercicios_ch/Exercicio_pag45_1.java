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
public class Exercicio_pag45_1 {
    public static void main(String[]arg){

        double horas_t ,vlr_sal_min, vlr_hora_t, sal_bruto, imp, vlr_sal_liq;
        Scanner entrada;
        entrada =  new Scanner (System.in);


        System.out.println("Digite o numero de horas trabalhadas");
        horas_t=entrada.nextDouble();

        System.out.println("Digite o valor do salário mínimo");
        vlr_sal_min=entrada.nextDouble();
        vlr_hora_t=   vlr_sal_min/2;

       sal_bruto= vlr_hora_t * horas_t ;

        System.out.println("Digite o valor do imposto");
        imp=entrada.nextDouble();
       imp=(sal_bruto * 3)/100;
       vlr_sal_liq=sal_bruto-imp;
        System.out.println("O valor do salário líquido é "+ vlr_sal_liq);
    }
}
