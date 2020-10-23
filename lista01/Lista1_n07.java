package lista01;

import java.util.Scanner;

public class Lista1_n07 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] numeros = new int[5];
		int aux, procura;
		for (int i=0; i< 5; i++){
			System.out.println("digite um número inteiro:");
			numeros[i] = scan.nextInt();
		}
		for (int i=0; i < 5-1;i++){
			for (int j=0; j < 5-1-i;j++){
				if (numeros[j]>numeros[j+1]){
					aux = numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]= aux;
				}
			}		
		}
		System.out.println("digite o número que deseja pesquisar:");
		procura = scan.nextInt();
		aux = 0;
		while (aux < 5  && numeros[aux]!=procura){
			aux++;
		}
		if (aux==5){
			System.out.println("número não encontrado no vetor");
		}else{
			System.out.println("o número procurado está na posição "+aux);
		}
	}
}
