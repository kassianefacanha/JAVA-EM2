/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package escolar;

import javax.swing.JOptionPane;

/**
 *
 * @author Dayana e Liliane
 */
public class Situacao {
    Double media;
   void soma (Double soma_das_notas){
     Double nova_media = soma_das_notas/3;
        this.media = nova_media;
   }
    void situacao(){
        if(media >=6){
            JOptionPane.showMessageDialog(null,"APROVADO");
        }
        else if ((media >= 4) && (media<6)) {
            JOptionPane.showMessageDialog(null, "RECUPERAÇAO");
        }
        else{
             JOptionPane.showMessageDialog(null, "REPROVADO");
        }
    }
}
