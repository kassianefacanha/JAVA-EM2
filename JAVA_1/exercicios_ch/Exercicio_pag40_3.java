
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
public class Exercicio_pag40_3 {
     public static void main(String[] args){    
   int dep, taxa, rend, total;
   
   dep = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do deposito: "));
   taxa = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da taxa de juros: "));   
   rend = dep * taxa/100;
   total = dep + rend;
    JOptionPane.showMessageDialog(null,+rend );
    JOptionPane.showMessageDialog(null,+total );
   }

}
