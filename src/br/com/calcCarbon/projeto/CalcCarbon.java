package br.com.calcCarbon.projeto;

import java.util.Scanner;

public class CalcCarbon {
	//classe main, onde vai rodar o programa

//<<<<<<< HEAD
	
//=======
	public static void main(String[] args) {
		
			
		Cadastro usuario = new Cadastro();
	
		Cadastro.bemVindo();
		Cadastro.scanner();
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
//>>>>>>> 4a0659909f7421972e5e3bb676d231a247430588

}
