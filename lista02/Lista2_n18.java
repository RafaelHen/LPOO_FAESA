package lista02;

import java.util.Scanner;

public class Lista2_n18 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		final int tam=5;
		double [] enlatado = new double[tam];
		double [] ensacolado = new double[tam];
		char opcao;
		boolean cadastrou=false;
		do{
			System.out.println("1- Cadastrar preços dos produtos\n"+
					"2- menor preço do produto enlatado e do ensacolado\n"+
					"3- Quantidade de produtos com preços maiores que R$1.000,00\n"+
					"4- Sair");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				System.out.println("cadastrar produtos enlatados:\n");
				preencherDados(enlatado);
				System.out.println("cadastrar produtos ensacolados:\n");
				preencherDados(ensacolado);
				System.out.println("cadastros realizados com sucesso\n");
				cadastrou=true;
				break;
			case '2':
				if (cadastrou){
					System.out.println("o menor preço dos produtos enlatados é "+
							procurarMenor(enlatado)+"\n");
					System.out.println("o menor preço dos produtos ensacolados é "+
							procurarMenor(ensacolado)+"\n");
				}else{
					System.out.println("\nprodutos não foram cadastrados.\n");
				}
				break;
			case '3':
				System.out.println("\nProdutos enlatados:\n");
				System.out.println(mostrarPrecoMaior1000(enlatado)+"\n");
				System.out.println("\nProdutos ensacolados:\n");
				System.out.println(mostrarPrecoMaior1000(ensacolado)+"\n");
				break;
			case '4':
				System.out.println("fim do programa.");
				break;
			default:
				System.out.println("opção inválida. Tente novamente.");
			}
		}while (opcao!='4');
	}//fim main
	static void preencherDados(double [] v){
		for (int i=0; i<v.length;i++){
			System.out.println("digite o preço do "+(i+1)+"º produto:");
			v[i] = scan.nextDouble();
		}
	}
	static double procurarMenor(double [] v){
		int menor=0;
		for(int i=1; i<v.length;i++){
			if (v[i]<v[menor]){
				menor = i;
			}
		}
		return v[menor];
	}
	static String mostrarPrecoMaior1000(double [] v){
		int cont=0;
		for(int i=0; i<v.length;i++){
			if (v[i]>1000){
				cont++;
			}
		}
		if (cont==0){
			return "não tem produtos com preços maiores que 1000";
		}else{
			return "a quantidade de preços maiores que 1000 é:\n"+cont;
		}
	}
}
