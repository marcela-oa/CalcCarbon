package br.com.calcCarbon.projeto;

import java.util.Scanner;

public class CalcCarbon {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		
		// -------- SEÇÃO CADASTRO ------------
		Cadastro usuario = new Cadastro();
		
		usuario.bemVindo();
		
		usuario.pergunta1();
		usuario.setNome(leia.next());
		
		usuario.pergunta2(usuario.getNome());
		usuario.setIdade(leia.nextInt());

		usuario.pergunta3();
		usuario.setQtdeMoradores(leia.nextInt());
		
		usuario.pergunta4();
		usuario.setEstado(leia.next());
		
		usuario.pergunta5();
		usuario.setCidade(leia.next());
		
		
		// -------- SEÇÃO ALIMENTAÇÃO ----------
		Carne c = new Carne(usuario.getNome());
		
		int i = 0;
		while (i == 0) {
			
			c.pergunta1();
			c.setDecisao(leia.nextInt());
			
			if (c.getDecisao() != 1 && c.getDecisao() != 2) {
				System.out.println("Opção inválida, tente novamente! \n");
				i = 0;
			} else {
				i++;
			}	
		}
		
		c.pergunta2();
		if (c.getDecisao() == 1) {
			c.setQntCarne(leia.nextDouble());
		}
		c.calculo();
		
		System.out.println(c.getTotal());
		System.out.println();
				
		//--------------- SECAO ENERGIA --------------
		
		
		// -------------------------------------------
		// ------------- SECAO TRANSPORTE ------------
		
		// -------------------------------------------
		// ------------- SECAO FINAL -----------------
		
		
		leia.close();
	}
}
