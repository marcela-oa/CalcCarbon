package br.com.calcCarbon.projeto;

public class Carne {
/*Você come carne? 
sim ou não 
se sim:
aproximadamente quantos kg de carne por semana (1 bife = 90g)
1 kg de carne = 152 kg de CO2e
*/
	double carne;
	double total;

	public double getCarne() {
		return carne;
	}

	public void setCarne(double carne) {
		this.carne = carne;
	}
	
	public double carbonoCarne() {
		return this.total = this.carne * 152;
	}
}
