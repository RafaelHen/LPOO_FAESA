package lista01;

import java.util.Scanner;

public class Lista1_n07comMetodos {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] numeros = new int[5];
		preencherVetor(numeros);
		ordenarVetor(numeros);
		System.out.println(pesquisarDado(numeros));
	}
	static void preencherVetor(int [] n){
		for (int i=0; i< n.length; i++){
			System.out.println("digite um número inteiro:");
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
		System.out.println("digite o número que deseja pesquisar:");
		procura = scan.nextInt();
		aux = 0;
		while (aux < 5  && n[aux]!=procura){
			aux++;
		}
		if (aux==5){
			return "número não encontrado no vetor";
		}else{
			return "o número procurado está na posição "+aux;
		}
	}
}
