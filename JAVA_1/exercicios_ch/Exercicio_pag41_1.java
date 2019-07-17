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
public class Exercicio_pag41_1 {
     public static void main(String[] args){    
   int base ,altura ,area;    
  base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
  altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
   area = (base *altura) / 2;
    JOptionPane.showMessageDialog(null,+area );
   }
}

