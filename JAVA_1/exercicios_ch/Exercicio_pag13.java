/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios_ch;

import java.util.Scanner;

/**
 *
 * @author PC19
 */
public class Exercicio_pag13 {
    /*

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float altura ,largura ,area,perimetro ;

        Scanner entrada;
entrada = new Scanner(System.in);
        System.out.println("Digite o valor da altura do retangulo");
        altura=entrada.nextFloat();
        System.out.println("Digite o valor da largura do retangulo");
        largura=entrada.nextFloat();
       
        area=(altura*largura)/2;
        System.out.println(" O valor da area do retangulo é "+area);
        perimetro= altura + largura;
        System.out.println(" O valor perimetro do  retangulo é "+perimetro);
        
    }
    
}


