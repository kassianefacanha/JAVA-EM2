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
public class Exercicio_pag46_2 {

      public static void main(String[] args){
    double a_degraus,a_usuario , gtd_degraus;
      a_degraus = Integer.parseInt(JOptionPane.showInputDialog("Digite degraus: "));
      a_usuario = Integer.parseInt(JOptionPane.showInputDialog("Digite usuario: "));

gtd_degraus = a_usuario /a_usuario;

      JOptionPane.showMessageDialog(null,+gtd_degraus );

     }
}
