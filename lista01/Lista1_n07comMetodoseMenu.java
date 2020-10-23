package lista01;

import java.util.*;

public class Lista1_n07comMetodoseMenu {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] numeros = new int[5];
		char opcao;
		do{
			System.out.println("\n\n1. Cadastrar n�meros\n"
					+ "2. Ordenar n�meros no vetor\n"
					+ "3. Pesquisar determinado n�mero no vetor\n"
					+ "4. Mostrar conte�do do vetor\n"
					+ "5. Sair");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1': 
				preencherVetor(numeros);
				System.out.println("\nVetor foi preenchidoo");
				break;
			case '2':
				ordenarVetor(numeros);
				System.out.println("\nVetor foi ordenado");
				break;
			case '3':
				System.out.println(pesquisarDado(numeros));
				break;
			case '4':
				System.out.println(mostrarVetor(numeros));
				break;
			case '5':
				System.out.println("\nfim de programa");
				break;
			default:
				System.out.println("\nop��o inv�lidade");
			}
		}while (opcao!='5');
	}
	static void preencherVetor(int [] n){
		for (int i=0; i< n.length; i++){
			System.out.println("\ndigite um n�mero inteiro:");
			n[i] = scan.nextInt();
		}
	}
	static void ordenarVetor (int [] n){
		int aux;
		for (int i=0; i < 5-1;i++){
			for (int j=0; j < 5-1-i;j++){
				if (n[j]>n[j+1]){
					aux = n[j];
					n[j]=n[j+1];
					n[j+1]= aux;
				}
			}		
		}
	}
	static String pesquisarDado(int [] n){ 
		int  aux, procura;	
		System.out.println("\ndigite o n�mero que deseja pesquisar:");
		procura = scan.nextInt();
		aux = 0;
		while (aux < 5  && n[aux]!=procura){
			aux++;
		}
		if (aux==5){
			return "\nn�mero n�o encontrado no vetor";
		}else{
			return "\no n�mero procurado est� na posi��o "+aux;
		}
	}
	static String mostrarVetor(int [] n){
		String resposta = "\n";
		System.out.println("Conte�do do Vetor");
		for (int i=0; i< n.length; i++){
			resposta += n[i] + "   ";
		}
		return resposta;
	}
}
