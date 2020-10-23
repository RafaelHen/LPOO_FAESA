package lista02;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Lista2_n16 {
	static Scanner scan = new Scanner(System.in);
	
	static int contador = 0; // variável global
	
	public static void main(String[] args) {
		int [] vetor = new int [1000];
		preencherVetor(vetor);
		System.out.println(procurarMaior(vetor));
		System.out.println("o menor valor do vetor é "+procurarMenor(vetor));
		System.out.println("foram inseridos "+contador+ " valores.");
		System.out.println("a media dos valores é "+calcularMedia(vetor));
	}
	static void preencherVetor(int [] v){
		char resp;
		do{
			System.out.println("digite um número inteiro:");
			v[contador]= scan.nextInt();
			contador++;
			System.out.println("deseja continuar cadastrando números:(s=sim ou n=não)");
			resp = scan.next().charAt(0);
		}while (resp=='s' && contador < 1000);	
	}
	static String procurarMaior(int [] v){
		int maior = 0;   //o zero significa a posição no vetor e é o meu maior número
		for (int i = 1; i < contador; i++){
			if (v[i] > v[maior]){
				maior = i ;
			}
		}
		return "o maior valor é "+v[maior]+ " e está na posição "+ maior;
	}
	static int procurarMenor(int [] v){
		int menor = 0;   //o zero significa a posição no vetor e é o meu menor número
		for (int i = 1; i < contador; i++){
			if (v[i] < v[menor]){
				menor = i ;    //atualizar a posição do menor valor
			}
		}
		return v[menor];
	}
	static double calcularMedia(int [] v){
		double soma = 0;
		for (int i = 0; i < contador; i++){
			soma += v[i];    // =>  soma = soma + v[i];
		}
		return soma/contador;
	}

}
