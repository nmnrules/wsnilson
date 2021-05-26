package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {

		String email=JOptionPane.showInputDialog("Digite seu email: ").toLowerCase();

		while (email.contains("@")==false || email.indexOf("@")<2) {
			email = JOptionPane.showInputDialog("Digite o e-mail novamente: ").toLowerCase();

		}
		System.out.println("Usuário: " + email.substring(0, email.indexOf('@')));

		String nome=JOptionPane.showInputDialog("Digite seu nome: ").toLowerCase();
		
		while (nome.length()<3 || nome.length()>20)
			nome = JOptionPane.showInputDialog("Digite o nome Novamente: ").toUpperCase();
	}
	
		System.out.println("Nome Válido: " + nome);
		/*
		 * o nome não pode tr menos que 3 caracteres e mais de 20
		 */
		
		
	}
}
