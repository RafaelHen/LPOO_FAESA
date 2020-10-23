package lista02;
import java.util.Scanner;
public class Lista2_n17 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		final int tam = 3;
		String [] nomes = new String [tam];
		double [] nota1 = new double [tam];
		double [] nota2 = new double [tam];
		char opcao;
		preencherDados(nomes, nota1, nota2);
		System.out.println("dados cadastrados\n");
		do{
			System.out.println("\n\n1. calcular a média de cada aluno\n"+
			"2. identificar qual a maior nota da turma e qual o nome do aluno\n"+
			"3. calcular a média geral da turma\n"+
					"4. sair");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				System.out.println("\nMédia de cada aluno:\n "+
			calcularMedia(nomes,nota1, nota2));
				break;
			case '2':
				System.out.println(procurarMaiorNota(nomes,nota1, nota2));
				break;
			case '3':
				System.out.println("\na media geral da turma é "+calcularMediaGeral(nota1, nota2));
				break;
			case '4':
				System.out.println("fim do programa");
				break;
			default:
				System.out.println("opção inválida");
			}
		}while(opcao!='4');
	}
	static void preencherDados(String [] s, double [] n1, double []n2){
		for (int i=0; i< s.length;i++){
			System.out.println("digite o nome do aluno:");
			s[i] = scan.next();
			System.out.println("digite a nota1 do aluno:");
			n1[i] = scan.nextDouble();
			System.out.println("digite a nota2 do aluno:");
			n2[i] = scan.nextDouble();
		}
	}
	static double calcularMediaPorAluno(double valor1, double valor2){
		return (valor1+valor2)/2;
	}
	static String calcularMedia(String [] s, double [] n1, double []n2){
		String resposta="";
		for (int i=0; i< s.length;i++){
			resposta += "\naluno: "+s[i]+ " tem média = "+calcularMediaPorAluno(n1[i],n2[i]);
		}
		return resposta;
	}
	static int procurarMaior(double [] v){
		int maior = 0; 
		for (int i=1; i< v.length;i++){
			if (v[i] > v[maior]){
				maior = i;
			}
		}
		return maior;
	}
	static String procurarMaiorNota(String [] s, double [] n1, double []n2){
		int maior1, maior2;
		maior1 = procurarMaior(n1);
		maior2 = procurarMaior(n2);
		if (n1[maior1] > n2[maior2]){
			return "\no aluno "+s[maior1]+ " tem a maior nota. A nota é "+n1[maior1];
		}else{
			return "\no aluno "+s[maior2]+ " tem a maior nota. A nota é "+n2[maior2];
		}
	}
	static double calcularMediaGeral(double [] n1, double []n2){
		double media=0;
		for (int i=0;i<n1.length;i++){
			media += calcularMediaPorAluno(n1[i],n2[i]);
		}
		return media/n1.length;
	}
}
