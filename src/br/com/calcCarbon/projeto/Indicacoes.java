package br.com.calcCarbon.projeto;

public class Indicacoes {
	
	public Indicacoes (String nome) {
		System.out.println("\n///////////////////////////////////////////////////////////////////////////////////");
		System.out.println(nome + ", muito obrigade pelas suas respostas! Aqui estão seus resultados: \n");
	}
	
	public void resultados (double semana, double ano, double vida) {
		System.out.println("A sua média de emissões (em t de CO2)");
		System.out.printf("Por semana: %5.2f%n", semana);
		System.out.printf("Por ano: %5.2f%n", ano);
		System.out.printf("Da vida até agora é: %5.2f%n", vida);
		System.out.println();
	}
	
	public void indicações (double valorAnual) {
		if (valorAnual <= 7.0) {
			System.out.println("Parabéns! Você está abaixo da média de emissões anual dos brasileiros!!\n"
					+ "Continue assim, com cada um fazendo sua parte poderemos amenizar as mudanças climáticas!");
		} else if (valorAnual > 7.0 && valorAnual <= 9.0) {
			System.out.println("Você está dentro da média de emissões anual dos brasileiros. O que acha de ajudar um pouco mais?\n"
					+ "Você sabia que a cada 7 árvores, é possível reter 1 tonelada de carbono nos seus primeiros 20 anos de idade? \n"
					+ "Uma dica: você pode ajudar plantando algumas árvores ou ajudando instituições que fazem esse trabalho ;)");
		} else if (valorAnual > 9.0) {
			System.out.println("Infelizmente suas emissões estão acima da média de emissões anual dos brasileiros :( \n"
					+ "O que acha de começar a mudar alguns hábitos? Aqui vão algumas dicas: \n"
					+ "Aderir ao movimento Segunda sem carne: 1 dia sem carne economiza 14Kg de CO2 emitidos\n"
					+ "Usar meios de transporte mais limpos: 1L de gasolina equivale a 1,6kg de CO2 emitidos\n"
					+ "Você pode ajudar instituições que contribuem para amenizar as consequências das mudanças climáticas");
		}
	}
}
