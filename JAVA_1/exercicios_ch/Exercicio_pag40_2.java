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
public class Exercicio_pag40_2 {

   public static void main(String[] args){    
   int sal , salreceber , imp;    
   sal = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario: "));   
    imp = sal * 10/100;
    salreceber = sal +50 -imp;
    JOptionPane.showMessageDialog(null,+salreceber );
   }
}