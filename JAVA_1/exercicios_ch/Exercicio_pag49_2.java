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
public class Exercicio_pag49_2 {
  public static void main(String[] args){
    double hora,h,m,conversao;
     hora = Integer.parseInt(JOptionPane.showInputDialog("Digite hora:"));
    h =  Math.ceil(hora);
    m = hora - h;
    conversao = (h *60)+ (m*100);

      JOptionPane.showMessageDialog(null,+conversao );

     }
     }

