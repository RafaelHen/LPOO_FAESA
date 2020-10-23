package lista02;

import java.util.Scanner;

public class Lista2_n19 {
	static Scanner scan = new Scanner(System.in);  //variável global

	public static void main(String[] args) {
		final int tam=3;
		char [] sexo = new char[tam]; 
		byte [] idade = new byte[tam];
		double [] altura = new double[tam];
		char opcao;
		do{
			System.out.println("1. Cadastrar dados\n"+
					"2. Mostrar todos os dados\n"+
					"3. Mostrar a quantidade de indivíduos do sexo feminino cuja "+
					"idade esteja entre 20 a 45 anos e altura inferior a 1,70 m\n"	+
					"4. Sair");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarDados(sexo,idade,altura);
				break;
			case '2':
				mostrarDados(sexo, idade, altura);
				break;
			case '3':
				System.out.println(mostrarPesquisa(sexo, idade, altura));
				break;
			case '4':
				System.out.println("fim do programa");
				break;
			default:
				System.out.println("opção inválida.");
			}
		}while (opcao !='4');
	}
	static void cadastrarDados(char [] s, byte [] id, double [] a){
		for (int i=0; i< s.length;i++){
			System.out.println("Digite os dados do "+(i+1)+" habitante:");
			System.out.println("informe o sexo:");
			s[i] = scan.next().charAt(0);
			System.out.println("informe a idade:");
			id[i] = scan.nextByte();
			System.out.println("informe a altura:");
			a[i] = scan.nextDouble();
		}
	}
	static void mostrarDados(char [] s, byte [] id, double [] a){
		for (int i=0; i< s.length;i++){
			System.out.println("sexo: "+s[i]+ " idade: "+id[i]+" altura: "+a[i]);
		}
		System.out.println();
	}
	
	static String mostrarPesquisa(char [] s, byte [] id, double [] a){
		int cont = 0; 
		for (int i=0; i< s.length;i++){
			if ((s[i]=='f') && (id[i]>=20 && id[i]<=45)  && (a[i]<1.7)){
				cont++;
			}
		}
		return "\nTem "+cont + " habitantes com estas especificações.\n";
	}
	
	
	
	
	
	

}
