package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	/*
	 * * Exercicio 2
	 * Solicite o nome do cliente e o email, pergunte a ele se deseja adicionar
	 * itens para sua compra, e enquanto ele responder que sim, pe�a:
	 * nome do produto, valor e qtde. 
	 * Exiba para cada produto o total de cada um.
	 * Quando terminar de adicionar produtos exiba no final o total da conta.
	 */

	public static void main(String[] args) {


		String cliente = JOptionPane.showInputDialog("Nome do Cliente: ").toUpperCase ();
		String email = JOptionPane.showInputDialog("Email do Cliente: ").toUpperCase ();
		float vparcial=0;
		String produto =" ";
		int qtd =0;
		float valor=0;
		float vfinal=0;
		do {

			produto = JOptionPane.showInputDialog("Nome do Produto: ").toUpperCase ();
			valor=Float.parseFloat(JOptionPane.showInputDialog("valor do produto"));
			qtd=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto: "));
			System.out.println("Produto: "+produto + " Quantidade: "+qtd);
			vparcial=valor*(float)qtd;
			vfinal=vfinal+vparcial;
		}			
		while (JOptionPane.showConfirmDialog(null, "Quer adicionar mais itens a sua compra?", "Vai ou Racha", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Sr: "+cliente + " E-mail: "+email +"O Valor Total de sua compra �: "+vfinal);
		

		
	}

}







