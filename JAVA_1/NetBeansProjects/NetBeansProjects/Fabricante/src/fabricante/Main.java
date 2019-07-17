
package fabricante;

import javax.swing.JOptionPane;


public class Main {


    public static void main(String[] args) {
     Carros Dados_do_Carro;

  Dados_do_Carro = new Carros();
  Dados_do_Carro.dono=JOptionPane.showInputDialog("Quem é o dono do Carro ??");
  Dados_do_Carro.marca=JOptionPane.showInputDialog("Qual a marca do Carro ??");
  Dados_do_Carro.modelo=JOptionPane.showInputDialog("Qual éo modelo  do Carro ??");
  Dados_do_Carro.cor=JOptionPane.showInputDialog("Qual é a cor do Carro ??");
  Dados_do_Carro.valor_carro = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do carro!"));
  Dados_do_Carro.n_de_rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o num de rodas!"));
  Dados_do_Carro.valor_do_seguro = Integer.parseInt(JOptionPane.showInputDialog("Digite valor do seguro!"));
  Dados_do_Carro.tipo_do_motor  = Double.parseDouble(JOptionPane.showInputDialog("Digite tipo de motor!"));
  Dados_do_Carro.n_do_chassin = Integer.parseInt(JOptionPane.showInputDialog("Digite chasin!"));
  Dados_do_Carro.n_do_renavan = Integer.parseInt(JOptionPane.showInputDialog("Digite renavan!"));


  JOptionPane.showMessageDialog(null, "O dono é: " +Dados_do_Carro.dono+"\n"
          +Dados_do_Carro.marca+"\n"
          +Dados_do_Carro.modelo+"\n"
          +Dados_do_Carro.cor+"\n"
          +Dados_do_Carro.valor_carro+"\n"
          +Dados_do_Carro.n_de_rodas+"\n"
          +Dados_do_Carro.valor_do_seguro+"\n"
          +Dados_do_Carro.tipo_do_motor+"\n"
          +Dados_do_Carro.n_do_chassin+"\n"
          +Dados_do_Carro.n_do_renavan);

     Pessoa Dados_pessoa;

  Dados_pessoa = new Pessoa();
  Dados_pessoa.nome=JOptionPane.showInputDialog("Nome");
  Dados_pessoa.sobnome=JOptionPane.showInputDialog("Sobrenome");
  Dados_pessoa.sexo = JOptionPane.showInputDialog("Sexo");
  Dados_pessoa.email=JOptionPane.showInputDialog("Email");
  Dados_pessoa.rua=JOptionPane.showInputDialog("Rua");
  Dados_pessoa.bairro = JOptionPane.showInputDialog("Bairro");
  Dados_pessoa.cidade = JOptionPane.showInputDialog("Cidade");
  Dados_pessoa.formacao =JOptionPane.showInputDialog("Formacao");
  Dados_pessoa.rg  = Integer.parseInt(JOptionPane.showInputDialog("RG"));
  Dados_pessoa.cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF"));
  Dados_pessoa.cep = Integer.parseInt(JOptionPane.showInputDialog("CEP"));
  Dados_pessoa.n_titulo = Integer.parseInt(JOptionPane.showInputDialog("N_TITULO"));


  JOptionPane.showMessageDialog(null, "O Seus dados são: " +Dados_pessoa.nome+"\n"
          +Dados_pessoa.sobnome+"\n"
          +Dados_pessoa.sexo+"\n"
          +Dados_pessoa.email+"\n"
          +Dados_pessoa.rua+"\n"
          +Dados_pessoa.bairro+"\n"
          +Dados_pessoa.cidade+"\n"
          +Dados_pessoa.formacao+"\n"
          +Dados_pessoa.rg+"\n"
          +Dados_pessoa.cpf+"\n"
          +Dados_pessoa.cep);

 
    }

}
