package variaveis;

import javax.swing.JOptionPane;

// Java ? usado no beckend
public class TiposDados {
	// main() ? o start point de uma aplica??o Java
	public static void main(String[] args) {
		
		//Sintaxe: <Tipo de dado> <nome da variavel> = dado;
		
		String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade")); // converte valores alfa para n?meros inteiros
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua Altura")); // converte valores alfa para n?meros reais (com casas decimais)
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu Peso"));
		double imc = peso / (altura * peso);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + imc);
		// classe System.out.print => serve para exibir uma variavel na tela;
		
		
		
		/*tipo de dados:
		 * Alfan?merico: ? um texto, parte de um texto ou um n?mero que n?o ser? utilizado em opera??es matem?ticas.
		 * Em javan?s: String
		 *  
		 * Num?rico: representa um dado que pode ser utilizado em express?es matem?ticas
		 * dependendo do contexto (caso o n?mero sej? muito utilizado para pesquisas):
		 * ex: CPF para receita federal
		 * cep para os correios
		 * Funcional para funcion?rios do Ita?
		 * RM (para alunos de uma faculdade)
		 * Em Javan?s: - int => para representa??o de n?meros inteiros
		 * 			   - double => para n?meros reais (com casas decimais)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	}
	
	
	
	
	
// ctrl Shift S para salvar a classe

// para fazer comentarios usar //
// para fazer um comentario com varias linhas /* e ir usando * para cada linha e fechar com /*