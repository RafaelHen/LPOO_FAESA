package lista01;

import java.util.Scanner;

public class Lista1_n08 {

	public static void main(String[] args) {
		char opcao;
		Scanner scan = new Scanner(System.in);
		final int TAMANHO=5;  //constante 
		int [] vet = new int[TAMANHO];
		int aux;
		boolean preenchido=false;
		
		do{
			System.out.println("\nEscolha uma opção\n"+
					"1. preencher dados no vetor\n"+
					"2. ordenar os dados do vetor\n"+
					"3. pesquisar um dado no vetor\n"+
					"4. sair do programa\n");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				for (int i = 0; i< vet.length; i++){
					System.out.println("digite o "+(i+1)+"º número:");
					vet[i] = scan.nextInt();
				}
				preenchido=true;
				break;
			case '2':
				if (preenchido){
					for (int i=0; i<vet.length-1; i++){
						for (int j=0; j< vet.length-1-i; j++){
							if (vet[j]>vet[j+1]){
								aux = vet[j];
								vet[j] = vet[j+1];
								vet[j+1] = aux;
							}
						}
					}
					System.out.println("\n\ndados ordenados\n");
					for (int i=0; i<vet.length; i++){
						System.out.println(vet[i]);
					}
				}else{
					System.out.println("dados não cadastrados.\n");
				}
				break;
			case '3':

				break;
			case '4':
				System.out.println("fim do programa.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}while (opcao!='4');
		System.exit(0);
	}

}
