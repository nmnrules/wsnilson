package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		String nome =" ";
		float peso=0;
		float altura=0;
		float imc=0;
		do {
			nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
			peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
			imc = peso / (altura*altura);
			System.out.printf("%s seu IMC é: %.2f", nome, imc);
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Vai ou Racha", JOptionPane.YES_NO_OPTION)==0);
























	}


































}
