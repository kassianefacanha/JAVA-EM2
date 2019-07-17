
package escolar;

import javax.swing.JOptionPane;

/**
 *
 * @author Kassiane Lopes Façanha e Érika Pereira do Nascimento
 */
public class Main {

    public static void main(String[] args) {
      Dados_Alunos a = new Dados_Alunos();
      Situacao b = new Situacao();
      Frequencia c = new Frequencia();
      a.aluno = JOptionPane.showInputDialog(null,"Nome do aluno:");
      a.nome_pai = JOptionPane.showInputDialog(null,"Nome do pai do aluno:");
      a.nome_mae = JOptionPane.showInputDialog(null,"Nome da mae do aluno:");
      a.n_matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero da matricula:"));

      c.n_faltas = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de faltas:"));

      a.n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1:"));
      a.n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 2:"));
      a.n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 3:"));

      b.soma(a.n1+a.n2+a.n3);



      JOptionPane.showMessageDialog(null,"Nome do aluno:\n"+ a.aluno+
                                         "\n Nome do pai:\n"+a.nome_pai+
                                         "\n Nome da mae:\n"+a.nome_mae+
                                         "\n Numero da matricula:\n"+a.n_matricula+
                                         "\n Numero de faltas:\n"+c.n_faltas+
                                         "\n Nota 1:\n"+a.n1+
                                         "\n Nota 2:\n"+a.n2+
                                         "\n Nota 3:\n"+a.n3+
                                         "\n Média:\n"+b.media);
     
      
     b.situacao();
     c.freq();
    }

}
