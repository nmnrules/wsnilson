package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "nMnrUles@hotmaIl.cOm";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " +email.toLowerCase()); //exibe tudo minusculo
		System.out.println("Maiusculo: " +email.toUpperCase()); //exibe tudo maisculo
		System.out.println("Tem Arroba?" +email.contains("@"));  //confirma se tem ou não um caracter
		System.out.println("Posição do Arroba:" +email.indexOf("@")); //exibe em qual posição está determinado caracter
		System.out.println("Quantos Caracteres:" +email.length()); //exibe a quantidade de caracteres
		System.out.println("Caracteres do 2° até o 5° caracteres:" +email.substring(1,8)); //exibe os caracteres dentro de um intervalo
		System.out.println("Primeira Metade: " +email.substring(0,email.length()/2)); //exibe uma parte dos caracteres
		System.out.println("Olá Usuário: " +email.substring(0,email.indexOf("@")));
		System.out.println("Servidor do email: " +email.substring(email.indexOf("@")+1)); //exibir os valores após a posição de um determinado caracter, no caso tudo após o @
		System.out.println("Primeiro Caracter:" +email.toUpperCase().charAt(0));
		
		/*
		 * Identificadores (nomes dos elementos que criamos, variaveis, classes, Pacotes ETC)
		 * - Regras:
		 * 1° Não começar com número
		 * 2° Não utilizar palavras reservadas (ex: public, int, void, if, class, void etc)
		 * 3° Não utilizar caracteres especiais (ex: n@ome, tr#s etc)
		 * 
		 * Padrões:
		 * 1° CamelCase: da segunda Palavra em diante (em uma composição), deve começar com letra maiscula. 
		 * ex: certo => dataNascimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * Errado => data_Nascimento
		 * 
		 * 2° UML: é responsável por orientar elementos da orientação a objetos
		 * - Toda classe deve começar com letra maiscula
		 * - Toda variavel/pacote deve começar com letra minuscula
		 * - Todo método deve começar com letra minuscula e deve ser seguido de parenteses.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
