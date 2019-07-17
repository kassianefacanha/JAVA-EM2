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
public class Exercicio_pag41_2 {
    
 public static void main(String[] args){    
   double raio,area;    
  raio = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario: "));
 area = 3.1415 * raio;
    JOptionPane.showMessageDialog(null,+area );
   }
}
