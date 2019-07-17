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
public class Exercicio_pag45_2 {
     public static void main(String[] args){
    double salario,cheque1, cheque2,cpmf1,cpmf2, saldo;
      salario = Integer.parseInt(JOptionPane.showInputDialog("Digite salario: "));
      cheque1 = Integer.parseInt(JOptionPane.showInputDialog("Digite cheque1: "));
      cheque2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cheque2: "));

      cpmf1 = cheque1 * 0.38 /100;
      cpmf2 = cheque2 * 0.38 /100;
      saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
      JOptionPane.showMessageDialog(null,+saldo );

     }
}
