package br.com.calcCarbon.projeto;

public class Carbono {

	private double totalSemanal;
	private double totalAnual;
	private double totalVitalicio;
	private double tonelada = 0.001;
	
	public double totalSemanal (double carne, double energia, double transporte) {
		return this.totalSemanal = ((carne + energia + transporte) * tonelada);
	}
	
	public double TotalAnual() {
		return this.totalAnual = totalSemanal * 52.0;
	}

	public double TotalVitalicio(int idade) {
		return this.totalVitalicio = (idade - 3) * totalAnual;
	}
		
	public double getTotalSemanal() {
		return totalSemanal;
	}
	
	public double getTotalAnual() {
		return totalAnual;
	}
	
	public double getTotalVitalicio() {
		return totalVitalicio;
	}
		
}
