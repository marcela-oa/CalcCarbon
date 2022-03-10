package br.com.calcCarbon.projeto;

public class Carne implements Calculo {
/*Você come carne? 
sim ou não 
se sim:
aproximadamente quantos kg de carne por semana (1 bife = 90g)
1 kg de carne = 152 kg de CO2e
*/
	private double qntCarne = 0.0;
	private double total;
	private double indice = 152.0;
	private int decisao;
	
	public void pergunta1() {
			System.out.println("Você come carne?\n 1 - SIM \n 2 - NÃO" );
		}
	
	public void pergunta2() {
		if(decisao == 1) {
			System.out.println("\nQuanto você consome em kgs por semana? \n(Insira um valor com pelo menos um decimal. Exemplo: 2,0)"
					+ "\n(Um bife é aproximadamente 90g)");
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
		return this.total = this.qntCarne * this.indice;	
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setDecisao(int decisao) {
		this.decisao = decisao;
	}
	
	public int getDecisao() {
		return decisao;
	}
	
	public void secaoCarne() {
		System.out.println("\n///////////////////////////////////////////////////////////");
		System.out.println("Vamos precisar de uma informação sobre sua alimentação, ok?\n");
	}	
}
