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
		private int decisao1;
		private int decisao2;
		private double totalTr;
		private double indiceCarro = 1.6;
		private double indiceTransporte = 0.011;
		
		public double getTotalTr() {
			return totalTr;
		}

		public void setTotalTr(double totalTr) {
			this.totalTr = totalTr;
		}

		public Transporte (String nome) {
			System.out.println("\n///////////////////////////////////////////////////////////////////////////////////");
			System.out.println(nome + ", agora vamos precisar de algumas informações sobre seus meios de transporte\n");
		}
	
		public void pergunta1() {
			System.out.println("Você tem um automovel?\n 1 - SIM \n 2 - NÃO" );
		}
	
		public void pergunta2() {
		if(this.decisao1 == 1) {
			System.out.println("\nQuanto em Litros você utiliza de combustivel por semana?\n"
					+ "(Insira um valor com pelo menos um decimal. Exemplo: 2,0)");
			}
		}
		
		public void pergunta3 () {
			System.out.println("Você utiliza ônibus?\n 1 - SIM \n 2 - NÃO");
		}
		public void pergunta4 () {
			if(this.decisao2 == 1) {
				System.out.println("Quantos Km em média você anda de onibus por semana?");	
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


		public int getDecisao1() {
			return decisao1;
		}

		public void setDecisao1(int decisao1) {
			this.decisao1 = decisao1;
		}

		public int getDecisao2() {
			return decisao2;
		}

		public void setDecisao2(int decisao2) {
			this.decisao2 = decisao2;
		}
		
		@Override
		public double calculo() {
			return this.totalTr = (this.gasolina * this.indiceCarro) + (this.km * this.indiceTransporte);
			
			
		} 	
	
}
