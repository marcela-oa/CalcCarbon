package br.com.calcCarbon.projeto;

import java.util.Scanner;

public class CalcCarbon {

	public static void main(String[] args) {
		//classe main, onde vai rodar o programa
		
	Scanner leia = new Scanner(System.in);
	
	Carne c = new Carne();
	 int i = 0;
	while(i == 0) {
		c.pergunta1();
		c.setDecisao(leia.nextInt());
	}
		
	c.pergunta2();
	c.setQntCarne(leia.nextDouble());
	
	
	
	
	
	leia.close();
		
	}

	
}
