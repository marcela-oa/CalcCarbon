package br.com.calcCarbon.projeto;

public class Carne implements Calculo {
/*Você come carne? 
sim ou não 
se sim:
aproximadamente quantos kg de carne por semana (1 bife = 90g)
1 kg de carne = 152 kg de CO2e
*/
	double qntCarne;
	double total;
	double indice = 152;
	int decisao;

	public int pergunta1() {
			System.out.println("Você come carne?\n 1 - SIM \n 2 - NÃO" );
			return this.decisao;
		}
	
	public void pergunta2() {
				if(decisao == 1) {
					System.out.println("Quanto você consome em Kgs por semana? \n (Um bife é aproximadamente 90g)");
				 this.qntCarne = getQntCarne();
			}	else if(decisao == 2) {
				 this.qntCarne = 0.0;
			} 	
	} 	
	
		
	public double getQntCarne() {
		return qntCarne;
	}

	public void setQntCarne(double carne) {
		this.qntCarne = carne;
	}
		
	@Override
	public double calculo() {
		return this.total = this.qntCarne * indice;
		
	}
	
	public void setDecisao(int decisao) {
		this.decisao = decisao;
	}
	
	public int getDecisao() {
		return decisao;
	}
	
}
