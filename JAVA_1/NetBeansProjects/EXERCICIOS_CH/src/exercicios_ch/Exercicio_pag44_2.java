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
     int p_fab, perc_d,perc_i, vlr_d ,vlr_i,p_final;
      p_fab  = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario: "));
      perc_d = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario: "));
      perc_i = Integer.parseInt(JOptionPane.showInputDialog("Digite seu salario: "));
      vlr_d = p_fab *perc_d /100;
      vlr_i = p_fab *perc_i /100;
      p_final = p_fab + vlr_d + vlr_i;
       JOptionPane.showMessageDialog(null,"idade atual:"+vlr_i );
        JOptionPane.showMessageDialog(null,"idade em 2050:"+vlr_d );
       JOptionPane.showMessageDialog(null,"idade em 2050:"+p_final );
     }
}
