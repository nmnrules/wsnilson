package repeticao;

import javax.swing.JOptionPane;
/*
 * 1 o jogador um digita um numero inteiro
 * a partir dai o jgador 2 deve adivinhar o numero, somente quando ele acertar dever? aparecer a mensagem " Parabens voc? acertou"
 * 2 acrescente dicas para o jogador , informandose o n?mero que ele tem que adivinhar ? maior ou menor que o n?mero digitado
 */
public class DesafioDo {

	public static void main(String[] args) {
		int num=Integer.parseInt(JOptionPane.showInputDialog("N?mero do Jogador1: "));
		int num2=0;
		int cont=0;
		do {
			num2=Integer.parseInt(JOptionPane.showInputDialog("Numero do Jogador 2: "));
			cont=cont+1;
			if (num2<num) {
				JOptionPane.showMessageDialog(null,"Seu n?mero ? menor que o n?mero certo");
			}else if (num2>num) {
				JOptionPane.showMessageDialog(null,"Seu n?mero ? maior que o n?mero certo");
			}
		} while (num!=num2);
		JOptionPane.showMessageDialog(null,"Voc? acertou em "+ cont +" tentativas!");
	}
}
