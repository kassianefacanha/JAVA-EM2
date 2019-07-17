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
public class Exercicio_pag43 {
    public static void main(String[] args){    
  int pes,polegadas,jardas,milhas;
  pes = Integer.parseInt(JOptionPane.showInputDialog("Digite a distancia em pes: "));
 polegadas = pes *12;
 jardas = pes /3;
 milhas = jardas /1760;

    JOptionPane.showMessageDialog(null,"Em polegadas:"+polegadas );
    JOptionPane.showMessageDialog(null,"Em jardas:"+jardas );
    JOptionPane.showMessageDialog(null,"Em milhas:"+milhas );
   }
}
