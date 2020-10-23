package lista02;

import java.util.Scanner;

public class Lista2_n13 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		final int tam = 5;
		int [] vetor = new int [tam];
		preencherVetor(vetor);
		System.out.println(procurarMaior(vetor));
	}
	static void preencherVetor(int [] v){
		for (int i=0; i<v.length;i++){
			System.out.println("digite o "+(i+1)+"º valor:");
			v[i] = scan.nextInt();
		}
	}
	static String procurarMaior(int [] v){
		int maior = 0;    //considera que o elemento da ocorrencia 0 é o maior valor 
		for (int i=1; i< v.length;i++){
			if (v[i] > v[maior]){
				maior = i;
			}
		}
		return "o maior elemento do vetor é "+v[maior]+" e sua posição é "+maior;
	}
}



