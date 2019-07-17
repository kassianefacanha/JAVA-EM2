/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package escolar;

import javax.swing.JOptionPane;

/**
 *
 * @author Liliane e Dayana
 */
public class Frequencia {
   
 int n_faltas ; 
    void freq(){
        if(n_faltas >= 15){
            JOptionPane.showMessageDialog(null, "Reprovado por falta");
        }
        else if (n_faltas >12 ){
            JOptionPane.showMessageDialog(null, "Faltas no Limite");
        }
       else{
       JOptionPane.showMessageDialog(null, "Faltas normais");
       }

    }
}
