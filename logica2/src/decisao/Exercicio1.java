package decisao;

import javax.swing.JOptionPane;

/*
 * *     * Exercicio 2:
 * Considere receber a quantidade de di�rias de um hotel e o valor
 * da di�ria. Sobre a di�ria haver� uma taxa que depende da quantidade
 * de di�rias.
 * Se a quantidade de di�rias for maior que 10 a taxa ser� de 5%
 * Se a quantidade estiver entre 5 e 10 a taxa ser� de 8%
 * Se a quantidade de diarias for menor que 5 a taxa ser� de 10%
 * Exiba o valor final.
 * 
 */
public class Exercicio1 {

	public static void main(String[] args) {


		int diarias =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de di�rias: "));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da di�ria: "));
		float taxa=0;
				
		if (diarias>10) {
			taxa = valor * (float) 0.05;
		} else if (diarias<5){
			taxa = valor * (float) 0.10;			
		} else {
			taxa = valor * (float) 0.08;
		}
		System.out.println("O Valor de suas di�rias �:R$ "+ ((valor+taxa)*diarias));
		}
	}




