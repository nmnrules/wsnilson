package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	/*
	 * 	 * Exercicio 3
	 * Solicite ao usuário (enquanto ele quiser), o cargo e o salario do cargo.
	 * No final exiba:
	 * - total de todos os salarios
	 * - média
	 * - o maior valor entre todos os salários que foram digitados, com o cargo.
	 * 
	 */
	public static void main(String[] args) {

		int media=0;
		float vparcial=0;
		float vfinal=0;
		float vmaior=0;
		String cargo= "";
		String maiorcargo="";
		float salario=0;
		do {

			cargo = JOptionPane.showInputDialog("Digite o Cargo: ").toUpperCase ();
			salario=Float.parseFloat(JOptionPane.showInputDialog("Digite o Salario do Cargo: "));
			vparcial=salario;
			vfinal=vfinal+vparcial;
			media=media+1;
			if (salario>vmaior) {
				vmaior=salario;
				maiorcargo=cargo;
			}
		}
		while (JOptionPane.showConfirmDialog(null, "Quer continuar?", "Vai ou Racha", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Total dos salarios: "+vfinal + " A Média Salarial é: "+ (vfinal/media));
		System.out.println("O maior salario é: " + vmaior + " Com o Cargo: " + maiorcargo);


	}
}
