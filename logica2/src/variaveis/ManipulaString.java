package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "nMnrUles@hotmaIl.cOm";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " +email.toLowerCase()); //exibe tudo minusculo
		System.out.println("Maiusculo: " +email.toUpperCase()); //exibe tudo maisculo
		System.out.println("Tem Arroba?" +email.contains("@"));  //confirma se tem ou n�o um caracter
		System.out.println("Posi��o do Arroba:" +email.indexOf("@")); //exibe em qual posi��o est� determinado caracter
		System.out.println("Quantos Caracteres:" +email.length()); //exibe a quantidade de caracteres
		System.out.println("Caracteres do 2� at� o 5� caracteres:" +email.substring(1,8)); //exibe os caracteres dentro de um intervalo
		System.out.println("Primeira Metade: " +email.substring(0,email.length()/2)); //exibe uma parte dos caracteres
		System.out.println("Ol� Usu�rio: " +email.substring(0,email.indexOf("@")));
		System.out.println("Servidor do email: " +email.substring(email.indexOf("@")+1)); //exibir os valores ap�s a posi��o de um determinado caracter, no caso tudo ap�s o @
		System.out.println("Primeiro Caracter:" +email.toUpperCase().charAt(0));
		
		/*
		 * Identificadores (nomes dos elementos que criamos, variaveis, classes, Pacotes ETC)
		 * - Regras:
		 * 1� N�o come�ar com n�mero
		 * 2� N�o utilizar palavras reservadas (ex: public, int, void, if, class, void etc)
		 * 3� N�o utilizar caracteres especiais (ex: n@ome, tr#s etc)
		 * 
		 * Padr�es:
		 * 1� CamelCase: da segunda Palavra em diante (em uma composi��o), deve come�ar com letra maiscula. 
		 * ex: certo => dataNascimento
		 * errado => datanascimento
		 * certo => data_nascimento
		 * Errado => data_Nascimento
		 * 
		 * 2� UML: � respons�vel por orientar elementos da orienta��o a objetos
		 * - Toda classe deve come�ar com letra maiscula
		 * - Toda variavel/pacote deve come�ar com letra minuscula
		 * - Todo m�todo deve come�ar com letra minuscula e deve ser seguido de parenteses.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
