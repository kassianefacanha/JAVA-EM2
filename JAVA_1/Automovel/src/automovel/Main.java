/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automovel;

import javax.swing.JOptionPane;

/**
 *
 * @author Kassiane
 */
public class Main {

    public static void main(String[] args) {
      Carro a = new Carro ();
 int num = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastro de pessoa:\n   2-Cadastro de Carro:"));
 switch
         case


    a.setNome(JOptionPane.showInputDialog("Nome do veiculo:"));
    a.setNome_dono(JOptionPane.showInputDialog("Nome dio dono:"));
    a.setModelo(JOptionPane.showInputDialog("Modelo do veiculo:"));
    a.setCor(JOptionPane.showInputDialog("Cor do veiculo:"));
    a.setN_portas(Integer.parseInt(JOptionPane.showInputDialog("Numero de portas:")));
    a.setN_rodas(Integer.parseInt(JOptionPane.showInputDialog("Numero de rodas:")));
    a.setCapacidade(Integer.parseInt(JOptionPane.showInputDialog("Capacidade de pessoas:")));
    a.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do veiculo:")));


    JOptionPane.showMessageDialog(null, "Nome: "                + a.getNome()+
                                        "\n Nome do dono: "     + a.getNome_dono()+
                                        "\n Modelo: "           + a.getModelo()+
                                        "\n Cor: "              + a.getCor()+
                                        "\n Numero de portas: " + a.getN_portas()+
                                        "\n Numero de rodas: "  + a.getN_rodas()+
                                        "\n Capacidade: "       + a.getCapacidade()+
                                        "\n Ano do Carro: "     + a.getAno());

    }

}
