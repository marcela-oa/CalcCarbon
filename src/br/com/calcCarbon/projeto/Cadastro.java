package br.com.calcCarbon.projeto;

public class Cadastro {
	
	private String nome;
	private String cidade; 
	private String estado;
	private int qtdeMoradores = 1;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getQtdeMoradores() {
		return qtdeMoradores;
	}
	public void setQtdeMoradores(int qtdeMoradores) {
		this.qtdeMoradores = qtdeMoradores;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	} 
	
	
	public void pergunta1() {
		System.out.println("Insira seu nome: ");
	}
	
	public void pergunta2(String nome) {
		System.out.println(nome + ", insira sua idade:  ");
	}
	
	public void pergunta3() {
		System.out.println("Quantas pessoas moram na mesma casa que você? (Digite 1 se você morar sozinho)");
	}
	
	public void pergunta4() {
		System.out.println("Digte a sigla de seu estado:  ");
	}
	public void pergunta5() {
		System.out.println("Digte o nome de sua cidade: ");
	}
	
public void bemVindo() {
		
		
		System.out.println("///////////////////////////////////");
		System.out.println("/     BEM-VINDE A CALC.CARBON     /");
		System.out.println("/    Sua calculadora de carbono   /");
		System.out.println("///////////////////////////////////");
		System.out.println("\n");
		System.out.println("/   POR FAVOR INFORME SEUS DADOS  /" + "\n");

	}
	
}
