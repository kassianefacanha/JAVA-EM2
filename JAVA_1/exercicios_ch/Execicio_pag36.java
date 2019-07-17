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
public class Execicio_pag36 {
  public static void main(String[] args){
   int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota: "));
   int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota: "));
   int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua terceira nota: "));
   int resultado = (n1 + n2 + n3)/3;
   JOptionPane.showMessageDialog(null,+resultado );
  
  }
}
