package br.com.calcCarbon.projeto;
import java.util.Scanner;


public class Cadastro {
	
	static String nome, cidade, estado;
	static int qtdeMoradores = 1, idade; 
	
	
	
	public static void scanner() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		nome=leia.next();
		
		System.out.println("Insira sua Idade: ");
		idade=leia.nextInt();
		
		System.out.println("Quantas pessoas moram na mesma casa que você? (Digite um se você morar sozinho)");
		qtdeMoradores=leia.nextInt();
		
		System.out.println("Digte o nome de seu estado: ");
		estado=leia.next();
		
		System.out.println("Digte o nome de sua cidade: ");
		cidade=leia.next();
		
		leia.close();
	}
	public static void bemVindo() {
		
		
		System.out.println("///////////////////////////////");
		System.out.println("     BEM VINDO A CALCARBON     ");
		System.out.println("   Sua calculadora de carbono  ");
		System.out.println("///////////////////////////////");
		System.out.println("\n");
	}
	
}
