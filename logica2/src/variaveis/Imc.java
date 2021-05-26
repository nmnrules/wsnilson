package variaveis;

import javax.swing.JOptionPane;

public class Imc {


	public static void main(String[] args) {
		// Sintaxe: <tipo de dado> <nome da variavel> = <dado>;

		do {

			String nome =JOptionPane.showInputDialog("Digite o seu nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura"));
			float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso"));
			float imc = peso / (altura * altura);


			System.out.println("Nome................: "+ nome);
			System.out.println("Idade...............: "+ idade);
			System.out.println("Altura..............: "+ altura);
			System.out.println("Classifica��o do IMC: "+ imc);

			// Decis�es sobre a valida��o do IMC - UTILIZE ENTRADA DE ALTURA COM PONTO EX: 1.80

			if (imc<18.5) {
				System.out.println("Ops Peso Baixo! Muito cuidado, voc� esta abaixo do peso Normal! Procure um m�dico, nutrologo ou nutricionista urgente!");

			} else if (imc>=18.5 && imc<=24.9) {
				System.out.println("Parab�ns Peso Normal! Continue assim cuindando de sua sa�de!");

			} else if (imc>=25.0 && imc<=29.9) {
				System.out.println("Ops Sobrepeso! Muito cuidado, voc� esta sobrepeso acima do normal! Procure um m�dico, nutr�logo ou nutricionista para um acompnhamento!");

			} else if (imc>=30.0 && imc<=34.9) {
				System.out.println("Ops Obsidade (GRAUS I)! Muito cuidado, voc� esta come�ando a ficar obeso! Procure um m�dico, nutrlogo ou nutricionista para um acompnhamento!");

			} else if (imc>=35.0 && imc<=39.9) {
				System.out.println("Ops Obesidade Servera (GRAUS II)! Muito cuidado, voc� esta Obesidade Severa, muito Cudado! Procure um m�dico, nutr�logo ou nutricionista para um acompnhamento com urg�ncia!");

			} else if (imc>=40.0) {
				System.out.println("Ops Obesidade M�rbida (GRAUS III)! Ferrou, voc� esta Obesidade M�rbida! J� trocou a cama? Procure ajuda especializada com urg�ncia de um m�dico, nutr�logo ou nutricionista para melhorar sua condi��o de vida!");

			} 
		}while(JOptionPane.showConfirmDialog (null, "Continuar?", "Calculo IMC", JOptionPane.YES_NO_OPTION)==0);



		}	

	}	
