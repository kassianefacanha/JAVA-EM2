package Pacote;

import javax.swing.JOptionPane;

public class EXE4 {

public static void main(String args[]){

 

	int mes;
	mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mes"));
	if (mes == 12){
	JOptionPane.showInputDialog(null, "Esse � o seu m�s de f�rias");
	}else{
		JOptionPane.showMessageDialog(null, "Vo�� n�o estar de ferias");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}