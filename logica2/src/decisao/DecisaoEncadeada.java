package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase ();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas: "));
		if (faltas>20) {
			System.out.println("Reprovado por faltas!");
		} 
		else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
			float media = (nota1+nota2)/2;



			if (media>=6) {
				System.out.println("Parabéns, você passou de ano!");
			}

			else if(media<4) {
				System.out.println("SUA ANTA! Você foi REPROVADO!");
			}

			else {  // && = e || = ou
				System.out.println("Você ainda tem uma chance no Exame, SUA BESTA!");
			}

			System.out.println("Sua média na disciplina: " + disciplina + " foi: " + media);


		}











	}
}
