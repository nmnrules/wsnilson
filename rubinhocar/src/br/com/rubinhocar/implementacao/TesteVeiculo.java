package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		//1°Instanciar o objeto
		Veiculo objeto = new Veiculo();

		//2° Preencher os atributos do objeto
		
		objeto.preencherModelo("camaro");;
		objeto.preencherValor(200000);
		
		
		//3° Exibir os Resultados
		System.out.println(objeto.retornarTudo());
		objeto.desligar();
		objeto.acelerar(20);
		objeto.desacelerar(15);
		System.out.println("Depois de ligar: /n" + objeto.retornarTudo());
		System.out.println("Depois de desligar: /n" + objeto.retornarTudo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
