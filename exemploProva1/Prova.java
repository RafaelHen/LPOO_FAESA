package exemploProva1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Prova {

	static Scanner scan = new Scanner(System.in);  //variável global
	
	public static void main(String[] args) {
		final int tam=3;
		String [] nome = new String[tam]; 
		double [] nota = new double[tam];
		int [] sala = new int[tam];
		
		char opcao;
		do{
			System.out.println("1. Cadastrar alunos\n"+
					"2. Alterar sala de um aluno\n"+
					"3. Mostrar aprovados\n"	+
					"4. Sair");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarDados(nome,nota,sala);
				break;
			case '2':
				alterarDados(nome,sala);
				break;
			case '3':
				System.out.println(mostrarAprovados(nome,nota, sala));
				break;
			case '4':
				System.out.println("fim do programa");
				break;
			default:
				System.out.println("opção inválida.");
			}
		}while (opcao !='4');
	}
	static void cadastrarDados(String [] n, double [] n1, int [] sa){
		for (int i=0; i< n.length;i++){
			System.out.println("Digite o nome do aluno:");
			n[i] = scan.next();
			System.out.println("informe a nota:");
			n1[i] = scan.nextDouble();
			System.out.println("informe a sala (1 a 30):");
			sa[i] = scan.nextInt();
		}
	}

	static void alterarDados(String []n, int [] sa){
		String procura;
		int i=0;
		System.out.println("Digite o nome do aluno a ser procurado:");
		procura = scan.next();
		
		while (i<n.length && !procura.equals(n[i])){
			i++;
		}
		if (i==n.length){
			System.out.println("aluno não encontrado");
		}else{
			System.out.println("digite o novo número de sala:");
			sa[i]= scan.nextInt();
			System.out.println("sala alterada com sucesso");
		}
	}
	static String mostrarAprovados(String [] n, double [] n1,int [] sa){
		String  resposta="";
		for (int i=0; i< n.length;i++){
			if (n1[i]>=7){
				resposta += n[i]+" "+sa[i]+"\n";
			}
		}
		return resposta;
	}
}
