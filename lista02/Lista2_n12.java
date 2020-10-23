package lista02;
import java.util.Scanner;

public class Lista2_n12 {
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		int [] vetor = new int [10];
		preencherVetor(vetor);
		System.out.println("a soma dos valores do vetor é "+calcularSoma(vetor));
	}
	static void preencherVetor(int [] v){
		for (int i=0;i<v.length;i++){
			System.out.println("Digite o "+(i+1)+"º número:");
			v[i]=scan.nextInt();
		}
	}
	static int calcularSoma(int [] v){
		int soma=0;
		for (int i=0;i<v.length;i++){
			soma += v[i];
		}		
		return soma;
	}
}
