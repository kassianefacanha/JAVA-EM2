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
public class Exercicio_pag44_1 {
     public static void main(String[] args){
     int ano_atual ,ano_nasc,idade_atual,idade_2050;
      ano_atual= Integer.parseInt(JOptionPane.showInputDialog("Digite ano atual: "));
      ano_nasc= Integer.parseInt(JOptionPane.showInputDialog("Digite ano do seu nascimento: "));
      idade_atual = ano_atual - ano_nasc;
      idade_2050 = 2050 - ano_nasc;
       JOptionPane.showMessageDialog(null,"idade atual:"+idade_atual );
        JOptionPane.showMessageDialog(null,"idade em 2050:"+idade_2050 );
     
     }
}
