package br.com.calcCarbon.projeto;

public class Carbono {

	private double totalSemanal;
	private double totalAnual;
	private double totalVitalicio;
	
	public double calculo1 (double carne, double energia) {
		return this.totalSemanal = carne + energia;
	}
	
	public double totalSemanal(double transporte) {
		return this.totalSemanal += transporte;
	}

	public double TotalAnual(double totalAnual) {
		return this.totalAnual = totalSemanal * 52.0;
	}

	public double TotalVitalicio(int idade) {
		return this.totalVitalicio = (idade - 3) * totalAnual;
	}
	
	public double getTotalVitalicio() {
		return totalVitalicio;
	}

}
