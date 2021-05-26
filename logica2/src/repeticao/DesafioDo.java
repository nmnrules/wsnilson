package repeticao;

import javax.swing.JOptionPane;
/*
 * 1 o jogador um digita um numero inteiro
 * a partir dai o jgador 2 deve adivinhar o numero, somente quando ele acertar deverá aparecer a mensagem " Parabens você acertou"
 * 2 acrescente dicas para o jogador , informandose o número que ele tem que adivinhar é maior ou menor que o número digitado
 */
public class DesafioDo {

	public static void main(String[] args) {
		int num=Integer.parseInt(JOptionPane.showInputDialog("Número do Jogador1: "));
		int num2=0;
		int cont=0;
		do {
			num2=Integer.parseInt(JOptionPane.showInputDialog("Numero do Jogador 2: "));
			cont=cont+1;
			if (num2<num) {
				JOptionPane.showMessageDialog(null,"Seu número é menor que o número certo");
			}else if (num2>num) {
				JOptionPane.showMessageDialog(null,"Seu número é maior que o número certo");
			}
		} while (num!=num2);
		JOptionPane.showMessageDialog(null,"Você acertou em "+ cont +" tentativas!");
	}
}
