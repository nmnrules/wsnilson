package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {
/*
 * Pe�a para o usu�rio digitar o valor da tabuada que ele deseja visualizar.
 ** Exercicio 1
		 * Pe�a para o usu�rio digitar o valor da tabuada que ele deseja visualizar.
		 * Monte o la�o para que apresente o resultado da tabuada, da seguinte forma:
		 * 
		 * numero x 0 = resultado
		 * numero x 1 = resultado
		 * (...)  x 100 = resultado
		 * 
 */
	public static void main(String[] args) {
		
		int num= Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
		int mult=0;
	do {
		
		System.out.println("Resultado: "+num +"X" + mult + "="+ num*mult);
		mult++;
	}
	while (mult<=100);
	
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
