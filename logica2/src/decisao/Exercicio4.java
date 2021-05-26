package decisao;

import javax.swing.JOptionPane;

/*
 *  * Exercicio 4:
 * Receba três números inteiros e coloque-os em ordem numérica
 * crescente. Garanta que os três números sejam diferentes.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

		if (valor1!=valor2 && valor2!=valor3 && valor3!=valor1) {
			if (valor1<valor2 && valor1<valor3) {
				System.out.println(valor1);
				// 2 ou 3
				if (valor2<valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);					
				}
			}else if (valor2<valor1 && valor2<valor3) {
				System.out.println(valor2);
				// 1 ou 3
				if (valor1<valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);					
				}
			}else {
				System.out.println(valor3);
				// 1 ou 2
				if (valor1<valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor1);
				}
			}
		}else {
			System.out.println("Existem valores iguais");
		}
	






}

}
