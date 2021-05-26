package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada: "));
		for (int contador=0;contador<50;contador+=1) {
			System.out.println("Tabuada: " + contador + " X " + tabuada +" = " + tabuada*contador);
		}
			
			
			
			
			
			
			
	}
}
