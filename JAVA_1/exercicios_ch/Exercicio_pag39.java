/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios_ch;

/**
 *
 * @author Iraneide
 */
import java.util.*;
public class Exercicio_pag39 {
    public static void main(String[] args) {
   Scanner entrada;
entrada = new Scanner(System.in) ;
  
  float sal , nosal,aumento;
  System.out.println("Digite o valor do sal�rio");
  sal = entrada.nextFloat();
  System.out.println("Digite o valor do almento em porcentagem");
  aumento = entrada.nextFloat();
  nosal=sal+aumento;
  System.out.println("O valor do novo sal�rio �  "+ nosal);
  
 
    
}
}
