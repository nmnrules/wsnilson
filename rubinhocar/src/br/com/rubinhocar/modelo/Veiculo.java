package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;
	// <modificador> <tipo do retorno> <nome do método> (<Tipo do parametro> <nome do Parametro,...);{
	
	public String retornarTudo() {
			return
					"Modelo.....: " + modelo +"\n" +
					"Valor......: " + valor +"\n" +
					"Valocidade.: " + velocidadeAtual +"\n" +
					"Ligado?....: " + status;
	}
	public void desacelerar() {
		velocidadeAtual=0;
	}
	
	public String desligar() {
		status=false;
		return "Desligado";
		}
	public String ligar() {
		status=true;
		return "Ligado";
	}
	public double retornarValor() {
		return valor;
	}
	public void desacelerar(int param) {
		if (status==true) {
			velocidadeAtual-=param;
				}
	}
	public void acelerar(int param) {
		if (status==true) {
			velocidadeAtual+=param;
		}
	}
	public void preencherValor (double param) {
		if (param>0) {
		valor = param;
	}
	}
		public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo(String param) {
		if (param.length()<10 ) {
			modelo = param.toUpperCase();	
		}
	
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
