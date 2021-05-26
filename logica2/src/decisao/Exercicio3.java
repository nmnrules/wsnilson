package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	/*
	 * Exercicio 3:
	 * Receba o valor do salário bruto, o nome de um colaborador e 
	 * a qtde de faltas.
	 * Se não houver faltas o salario bruto receberá um aumento de 2%.
	 * Calcule o valor do INSS sobre o salário bruto.
	 * Exiba no final o salário bruto, e o salário liquido (retirando
	 * o INSS e 8% do FGTS)
	 */
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o Nome: ").toUpperCase ();
		float salariobruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Salário Bruto: "));
		int faltas =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas: "));
		if (faltas==0) {
			salariobruto = salariobruto * (float) 1.02;
		}
		float inss=0;
		if (salariobruto<=1100) {
			inss = salariobruto * (float)0.07;
		} else if (salariobruto>1100 && salariobruto <=2203.48) {
			inss = salariobruto * (float)0.09;
		} else if (salariobruto>2203.48 && salariobruto <=3305.22) {
			inss = salariobruto * (float)0.12;
		} else {
			inss = salariobruto * (float) 0.14;
		}
		System.out.println("Nome do Colaborador: " + nome);
		System.out.println("Salario Bruto: " + salariobruto);
		System.out.println("Salario Liquido: " + (salariobruto - inss - salariobruto*0.08));

	}
}