
Main.java
package fabricante;


public class Main {

   
    public static void main(String[] args) {
     Carro Dados_do_Carro;
     
  Dados_do_Carro = new Carro();
  Dados_do_Carro.dono="Bianca";
  Dados_do_Carro.marca="Ferrari";
  Dados_do_Carro.modelo="Sport";
  Dados_do_Carro.cor="pink";
  Dados_do_Carro.valor_carro = 8555;
  Dados_do_Carro.n_de_rodas = 4;
   Dados_do_Carro.valor_do_seguro = 480;
   Dados_do_Carro.tipo_do_motor  = 1.6;
   Dados_do_Carro.n_do_chassin = 85;
   Dados_do_Carro.n_do_renavan = 87;
   
   
   System.out.println("Dono:  "+Dados_do_Carro.dono);
   System.out.println("marca: "+Dados_do_Carro.marca);
   System.out.println("modelo: "+Dados_do_Carro.modelo);
   System.out.println("cor: "+Dados_do_Carro.cor);
   System.out.println("valor_carro: "+Dados_do_Carro.valor_carro);
   System.out.println("n_de_rodas: "+Dados_do_Carro.n_de_rodas);
   System.out.println("valor_do_seguro :"+Dados_do_Carro.valor_do_seguro);
   System.out.println("tipo_do_motor: "+Dados_do_Carro.tipo_do_motor);
   System.out.println("n_do_chassin: "+Dados_do_Carro.n_do_chassin);
   System.out.println("n_do_renavan: "+Dados_do_Carro.n_do_renavan);

  
          

    }
    
}








Carro.java


package fabricante;


public class Carro {
     String dono, marca,modelo,cor;
     
     int valor_carro ,n_de_rodas,valor_do_seguro,n_do_chassin,n_do_renavan;
     double tipo_do_motor;
        
    
    
}







Resultado:
run:
Dono:  Bianca
marca: Ferrari
modelo: Sport
cor: pink
valor_carro: 8555
n_de_rodas: 4
valor_do_seguro :480
tipo_do_motor: 1.6
n_do_chassin: 85
n_do_renavan: 87
CONSTRUÍDO COM SUCESSO (tempo total: 0 segundos)

