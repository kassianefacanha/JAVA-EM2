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
public class Exercicio_pag38 {
   public static void main(String[] args){
   int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota: "));
   int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota: "));
   int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua terceira nota: "));
   int peso1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso 1: "));
   int peso2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso 2: "));
   int peso3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso 3: "));
   int resultado = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3))/(peso1 + peso2 +peso3);
   JOptionPane.showMessageDialog(null,+resultado );
  
  }  
}
