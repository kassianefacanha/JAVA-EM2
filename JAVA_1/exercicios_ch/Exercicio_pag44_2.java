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
public class Exercicio_pag44_2 {
     public static void main(String[] args){
     double p_fab, perc_d,perc_i, vlr_d ,vlr_i,p_final;
      p_fab  = Integer.parseInt(JOptionPane.showInputDialog("Digite pf: "));
      perc_d = Integer.parseInt(JOptionPane.showInputDialog("Digite perc d: "));
      perc_i = Integer.parseInt(JOptionPane.showInputDialog("Digite  perci: "));
      vlr_d = p_fab *perc_d /100;
      vlr_i = p_fab *perc_i /100;
      p_final = p_fab + vlr_d + vlr_i;
       JOptionPane.showMessageDialog(null,+vlr_i );
        JOptionPane.showMessageDialog(null,vlr_d );
       JOptionPane.showMessageDialog(null,+p_final );
     }
}
