package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o seu Nome: ").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));

		System.out.println("Sr(a): " + nome +". De acordo com as leis eleitorais:");

		if (idade>=18 && idade<=70) {
			System.out.println("Seu Voto � Obrigat�rio!");
		}
		
		if (idade==17 || idade==16 || idade>70) {
			System.out.println("Seu voto � facultativo");
		}

		if (idade<16) {
			System.out.println("Voc� n�o pode votar!");
		}






	}
}

