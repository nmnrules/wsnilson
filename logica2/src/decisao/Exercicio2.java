package decisao;

import javax.swing.JOptionPane;

/*
 * * Exercicio 1:
		 * Solicite dois valores e um operador matem�tico 
		 * (+, -, / ou *)
		 * Dependendendo do operador que foi digitado realize o calculo
		 * e exiba o resultado
		 * Dica.: Se utilizar String a compara��o de String deve ser:
		 * if (variavel.equals("valorasercomparado")){
		 * 
 */
public class Exercicio2 {

	public static void main(String[] args) {
		
		
		float numero1=Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro N�mero: "));
		float numero2=Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo N�mero: "));
		char operador=JOptionPane.showInputDialog("Digite o Operador Matematico: ").charAt(0);
		
		if (operador=='*') {
				System.out.println("Resultado: " + (numero1*numero2));
		} else if (operador=='+') {
				System.out.println("Resultado: " + (numero1+numero2));
		} else if (operador=='-') {
				System.out.println("Resultado: " + (numero1-numero2));
		} else if (operador=='/') {
			if (numero2!=0) {
				System.out.println("Resultado: " + (numero1/numero2));
			} else {
				System.out.println("Divis�o n�o pode ser realizada");
			}			
		} else {
			System.out.println("Operador inv�lido");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
