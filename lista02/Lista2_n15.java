package lista02;
import java.util.Scanner;
public class Lista2_n15 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		final int tam = 10;
		int [] vetor = new int [tam];
		preencherVetor(vetor);
		if (verificarOrdemCrescente(vetor)){
			System.out.println("o vetor está em ordem crescente");
		}else{
			System.out.println("o vetor não está em ordem crescente");

		}
	}
	static void preencherVetor(int [] v){
		for (int i=0; i<v.length;i++){
			System.out.println("digite um valor:");
			v[i] = scan.nextInt();
		}
	}
	static boolean verificarOrdemCrescente(int [] v){
		for (int i=0; i<v.length-1;i++){
			if (v[i]>v[i+1]){
				return false;
			}
		}
		return true;
	}
}
