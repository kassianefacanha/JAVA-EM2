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
public class Exercicio_pag47_1 {
      public static void main(String[] args){
    double ang , alt ,escada, radiano;
     ang = Integer.parseInt(JOptionPane.showInputDialog("Digite angulo: "));
     alt = Integer.parseInt(JOptionPane.showInputDialog("Digite altura: "));
     radiano = ang * 3.14 /180;
     escada = alt / Math.sin(radiano);
      JOptionPane.showMessageDialog(null,+escada );

     }
}
