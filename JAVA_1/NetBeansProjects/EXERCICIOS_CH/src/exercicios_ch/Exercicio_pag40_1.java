/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios_ch;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class Exercicio_pag40_1 {
 
   public static void main(String[] args){
   int sal , salreceber , grat, imp;
   sal = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario: "));
    grat = sal * 5/100;
     imp = sal * 7/100;
     salreceber = (sal + grat) - imp;
   JOptionPane.showMessageDialog(null,+salreceber );
  
  }  
}
