package lista02;

import java.util.Scanner;

public class Lista2_n20 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		final int tam = 3; 
		String [] nome = new String [tam];
		int [] quantidade = new int [tam];
		double [] preco = new double [tam];
		char opcao;
		do{
			System.out.println("1. Cadastrar dados do produto\n"
					+ "2. Mostrar faturamento de um produto\n"
					+ "3. Mostrar faturamento de total\n"
					+ "4. Sair");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarDados(nome, quantidade, preco);
				break;
			case '2':
				mostrarFaturamentoProduto(nome, quantidade, preco);
				break;
			case '3':
				System.out.println("o total de faturamento é "+mostrarFaturamentoTotal(quantidade, preco));
				break;
			case '4':
				System.out.println("fim do programa.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}while (opcao != '4');
	}
	static void cadastrarDados(String [] n, int [] q, double [] p){
		for(int i=0;i< n.length; i++){
			System.out.println("digite o nome do produto:");
			n[i] = scan.next();
			System.out.println("digite a quantidade:");
			q[i] = scan.nextInt();
			System.out.println("digite o preço do produto:");
			p[i] = scan.nextDouble();
		}
	}
	static void mostrarFaturamentoProduto(String [] n, int [] q, double [] p){
		String procura;
		int i=0;
		System.out.println("digite o nome do produto a ser procurado:");
		procura = scan.next();
		while( i< n.length && !n[i].equals(procura)){
			i++;
		}
		if (i == n.length){
			System.out.println("o nome do produto não foi encontrado.");
		}else{
			System.out.println("o faturamento do produto é "+ (q[i]*p[i]));
		}
	}
	static double mostrarFaturamentoTotal(int [] q, double [] p){
		double total=0;
		for (int i=0; i< q.length;i++){
			total += q[i]*p[i];
		}
		return total;	
	}

}
