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
public class Exercicio_pag47_2 {
      public static void main(String[] args){
    double x , y,z;
     z = Integer.parseInt(JOptionPane.showInputDialog("Digite z: "));
     x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
     y= (z*z) - (x*x);
     y = Math.sqrt(y);
      JOptionPane.showMessageDialog(null,+y );

     }
     }

