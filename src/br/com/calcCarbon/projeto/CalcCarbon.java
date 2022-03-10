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
				i = 1;
			}	
		}
		
		c.pergunta2();
		if (c.getDecisao() == 1) {
			c.setQntCarne(leia.nextDouble());
		}
		c.calculo();
		System.out.println();
		
		// -------------------------------------------
		// ------------- SECAO TRANSPORTE ------------
		Transporte t = new Transporte(usuario.getNome());

			while (i == 1) {
			
				t.pergunta1();
				t.setDecisao1(leia.nextInt());
				
				if (t.getDecisao1() != 1 && t.getDecisao1() != 2) {
					System.out.println("Opção inválida, tente novamente! \n" );
					i = 1;
				}
				else {
					i = 2;
				}
				
			}
			
			
			t.pergunta2();
			if (t.getDecisao1() == 1) {
				t.setGasolina(leia.nextDouble());
			}
			
				while (i == 2) {
					
					t.pergunta3();
					t.setDecisao2(leia.nextInt());
					
					if (t.getDecisao2() != 1 && t.getDecisao2() != 2) {
						System.out.println("Opção inválida, tente novamente! \n" );
						i = 2;
					}
					else {
						i = 3;
					}
					
				}
			
			t.pergunta4();
			if (t.getDecisao2() == 1) {
				
				t.setKm(leia.nextDouble());
			}
			
			t.calculo();
			System.out.println(t.getTotalTr());
				
		//--------------- SECAO ENERGIA --------------
		Energia e = new Energia(usuario.getNome());
		e.pergunta1();
		e.setmEnergia(leia.nextDouble());
		e.pergunta2();
		e.setgAnos(leia.nextDouble());
		e.calculo(usuario.getQtdeMoradores());
		
		// -------------------------------------------
		// ------------- SECAO FINAL -----------------
		
		Carbono total = new Carbono();
		
	//	total.calculo1(c.getTotal(), i); - i = total energia;
		total.totalSemanal(t.getTotalTr());
		total.TotalAnual();
		total.TotalVitalicio(usuario.getIdade());
		
		Indicacoes ind = new Indicacoes(usuario.getNome());
		ind.resultados();
		ind.indicações(usuario.getNome());
		
		System.out.println("\nMuito obrigade pela participação!!");
		
		leia.close();
	}
}
