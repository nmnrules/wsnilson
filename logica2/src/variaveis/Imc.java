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
			System.out.println("Classificação do IMC: "+ imc);

			// Decisões sobre a validação do IMC - UTILIZE ENTRADA DE ALTURA COM PONTO EX: 1.80

			if (imc<18.5) {
				System.out.println("Ops Peso Baixo! Muito cuidado, você esta abaixo do peso Normal! Procure um médico, nutrologo ou nutricionista urgente!");

			} else if (imc>=18.5 && imc<=24.9) {
				System.out.println("Parabéns Peso Normal! Continue assim cuindando de sua saúde!");

			} else if (imc>=25.0 && imc<=29.9) {
				System.out.println("Ops Sobrepeso! Muito cuidado, você esta sobrepeso acima do normal! Procure um médico, nutrólogo ou nutricionista para um acompnhamento!");

			} else if (imc>=30.0 && imc<=34.9) {
				System.out.println("Ops Obsidade (GRAUS I)! Muito cuidado, você esta começando a ficar obeso! Procure um médico, nutrlogo ou nutricionista para um acompnhamento!");

			} else if (imc>=35.0 && imc<=39.9) {
				System.out.println("Ops Obesidade Servera (GRAUS II)! Muito cuidado, você esta Obesidade Severa, muito Cudado! Procure um médico, nutrólogo ou nutricionista para um acompnhamento com urgência!");

			} else if (imc>=40.0) {
				System.out.println("Ops Obesidade Mórbida (GRAUS III)! Ferrou, você esta Obesidade Mórbida! Já trocou a cama? Procure ajuda especializada com urgência de um médico, nutrólogo ou nutricionista para melhorar sua condição de vida!");

			} 
		}while(JOptionPane.showConfirmDialog (null, "Continuar?", "Calculo IMC", JOptionPane.YES_NO_OPTION)==0);



		}	

	}	
