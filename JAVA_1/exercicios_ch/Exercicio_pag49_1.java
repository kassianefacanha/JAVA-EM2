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
public class Exercicio_pag49_1 {
       public static void main(String[] args){
    double num , i, f ,a;
     num = Integer.parseInt(JOptionPane.showInputDialog("Digite num: "));
     i =  Math.ceil(num);
     f = num - i;
     a =  Math.ceil(num);
      JOptionPane.showMessageDialog(null,+i );
      JOptionPane.showMessageDialog(null,+f );
      JOptionPane.showMessageDialog(null,+a );

     }
     }

