package br.com.calcCarbon.projeto;

public class Transporte implements Calculo {
/*Você tem automovel? 
se sim, quanto em Litros você utiliza de combustivel por semana 
1 L de gasolina = 1,6 kg de CO2e

se não, voce utiliza onibus?
se sim, quantos km em média você anda de onibus por semana?
(0,01l x km) -> 1 L de gasolina = 1,6 kg de CO2e
*/		
		
		private double km;
		private double gasolina;
		private int decisao;
	
		public void pergunta1() {
			System.out.println("Você tem um automovel?\n 1 - SIM \n 2 - NÃO" );
		}
	
		public void pergunta2() {
		if(decisao == 1) {
			System.out.println("\nQuanto em Litros você utiliza de combustivel por semana?\n"
					+ "(Insira um valor com pelo menos um decimal. Exemplo: 2,0)");
			} 
		else if (decisao == 2) {
			System.out.println("Você utiliza ônibus?\n 1 - SIM \n 2 - NÃO");
			}
		}

		public double getKm() {
			return km;
		}

		public void setKm(double km) {
			this.km = km;
		}

		public double getGasolina() {
			return gasolina;
		}

		public void setGasolina(double gasolina) {
			this.gasolina = gasolina;
		}

		public int getDecisao() {
			return decisao;
		}

		public void setDecisao(int decisao) {
			this.decisao = decisao;
		}

		@Override
		public double calculo() {
			//retornar o valor em semana
			return 0;
		} 	
	
}
