package lista02;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Lista2_n16 {
	static Scanner scan = new Scanner(System.in);
	
	static int contador = 0; // vari�vel global
	
	public static void main(String[] args) {
		int [] vetor = new int [1000];
		preencherVetor(vetor);
		System.out.println(procurarMaior(vetor));
		System.out.println("o menor valor do vetor � "+procurarMenor(vetor));
		System.out.println("foram inseridos "+contador+ " valores.");
		System.out.println("a media dos valores � "+calcularMedia(vetor));
	}
	static void preencherVetor(int [] v){
		char resp;
		do{
			System.out.println("digite um n�mero inteiro:");
			v[contador]= scan.nextInt();
			contador++;
			System.out.println("deseja continuar cadastrando n�meros:(s=sim ou n=n�o)");
			resp = scan.next().charAt(0);
		}while (resp=='s' && contador < 1000);	
	}
	static String procurarMaior(int [] v){
		int maior = 0;   //o zero significa a posi��o no vetor e � o meu maior n�mero
		for (int i = 1; i < contador; i++){
			if (v[i] > v[maior]){
				maior = i ;
			}
		}
		return "o maior valor � "+v[maior]+ " e est� na posi��o "+ maior;
	}
	static int procurarMenor(int [] v){
		int menor = 0;   //o zero significa a posi��o no vetor e � o meu menor n�mero
		for (int i = 1; i < contador; i++){
			if (v[i] < v[menor]){
				menor = i ;    //atualizar a posi��o do menor valor
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
