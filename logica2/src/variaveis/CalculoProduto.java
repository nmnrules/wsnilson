package variaveis;
/* Tipo primitivos (todos aqueles que come?am com minuscula)
 * boolean => Logico (true/false)
 * char => um caracter entre apostrofos ex: 'a';
 * 
 * byte => armazena um numero inteiro entre -127 a +128
 * short => armazena um numero inteiro entre -32 mil at? +32 mil
 * int => armazena um numero inteiro entre - 2 trilhoes at? + 2 trilhoes
 * long => armazena um numero inteiro entre - xxxx quintilhoes at? +xxxxxxxxxxx quintilhoes
 * 
 * float => at? 5 casas decimais
 * double => acima de 5 casas decimais
 * 
 */

// cast => casting (ajuste de tamanho da variavel)

import javax.swing.JOptionPane;

public class CalculoProduto {

	public static void main(String[] args) {
		
		String nomeproduto = JOptionPane.showInputDialog("Digite o nome do Produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Produto"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor unitario do Produto")); 
		float valortotal = quantidade * valor;
		// poderia ser criado a variavel => double imposto = valortotal * 0.17;	
		
		System.out.println("Imposto : "+ ((valor *quantidade)*0.17));
		System.out.println("Nome do Produto :" + nomeproduto);
		System.out.println("Valor Total: " + valortotal);
		
		
		
		
	}
}
