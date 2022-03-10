package br.com.calcCarbon.projeto;

public class Energia {
	
	/*
  qual o gasto médio de energia em kwh da sua casa por mês? (daí dividir por 4 semanas do mês e pela quantidade de pessoas da casa)
= 0,11kgCO2e/kWh
Quantos botijões de gás utilizam na sua casa durante o ano? (daí divide 52 semanas e pelas pessoas da casa/ 1 botijão de gás = 5,4 m²)
1 botijão de gás = 38 kg de CO2e */
	
	private double mEnergia = 0.0;
	private double gAnos = 0.0;
	private int decisao;
	private double eTotal;

	public Energia(String nome) {
			System.out.println("\n/////////////////////////////////////////////////////////////");
			System.out.println(nome + ", precisaremos também das suas informações de consumo.\n");
		}
		
		public void pergunta1() {
				System.out.println("Qual o gasto médio de energia em kWh da sua residência por mês?" );
			}	
		public void pergunta2() {
			System.out.println("Quantos botijões de gás você utiliza na sua residência ao decorrer do ano?\n(1 botijão de gás = 5,4 m³)" );
		}	
		
	public double getmEnergia() {
		return mEnergia;
	}
	public void setmEnergia(double mEnergia) {
		this.mEnergia = mEnergia;
	}
	public double getgAnos() {
		return gAnos;
	}
	public void setgAnos(double gAnos) {
		this.gAnos = gAnos;
	}
	public int getDecisao() {
		return decisao;
	}
	public void setDecisao(int decisao) {
		this.decisao = decisao;
		}
	public double calculo(int pessoas) {
		return this.eTotal =((this.mEnergia / pessoas) / 4) + (this.gAnos / 52);
	}	
	public double geteTotal() {
		return eTotal;
	}
}