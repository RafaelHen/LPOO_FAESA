package lista03;

import java.util.Scanner;

import lista03.Pauta;

public class PautaMainVet {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		PautaVet turma = new PautaVet(5);
		char opcao;
		do{
			System.out.println("1.	Cadastrar aluno (um por vez)\n"+
					"2.	Mostrar todos os dados dos alunos\n"+
					"3.	Verificar se o aluno est� reprovado por falta\n"+
					"4.	Mostrar a m�dia do aluno\n"+
					"5.	Mostrar situa��o de aprova��o ou reprova��o\n"+
					"6.	Finalizar opera��es");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarDados(turma);
				break;
			case '2':
				mostrarDados(turma);
				break;
			case '3':
				verificarFaltas(turma);
				break;
			case '4':
				mostrarMedia(turma);
				break;
			case '5':
				mostrarAprovacao(turma);
				break;
			case '6':
				System.out.println("fim do programa.");
				break;
			default:
				System.out.println("op��o inv�lida.");
			}
		}while (opcao!='6');
	}
	static void cadastrarDados(PautaVet v){
		Pauta aluno = new Pauta();
		System.out.println("digite a matricula:");
		aluno.setMatricula(scan.nextInt());
		System.out.println("digite o nome:");
		aluno.setNomeAluno(scan.next());
		System.out.println("digite o n�mero de faltas:");
		aluno.setNumFalta(scan.nextInt());
		System.out.println("digite a nota 1:");
		aluno.setNota1(scan.nextDouble());
		System.out.println("digite a nota 2:");
		aluno.setNota2(scan.nextDouble());
		if (v.inserirDados(aluno)){
			System.out.println("opera��o realizada com sucesso.");
		}else{
			System.out.println("opera��o n�o realizada.");
		}
	}
	static void mostrarDados(PautaVet v){
		System.out.println(v.toString());
	}
	static void verificarFaltas(PautaVet v){
		for (int i=0;i< v.getQuantVet();i++){
			if (v.getVetor(i).verificarFaltas()){
				System.out.println("o aluno "+v.getVetor(i).getNomeAluno()+
						" est� reprovado por faltas.");
			}else{
				System.out.println("o aluno "+v.getVetor(i).getNomeAluno()+
						" n�o est� reprovado por faltas.");
			}
		}
	}	
	static void mostrarMedia(PautaVet v){
		for (int i=0;i< v.getQuantVet();i++){
			System.out.println("a media do aluno "+v.getVetor(i).getNomeAluno()+
					" � " + v.getVetor(i).calcularMedia());
		}
	}
	static void mostrarAprovacao(PautaVet v){
		for (int i=0;i< v.getQuantVet();i++){
			if (!v.getVetor(i).verificarFaltas() && v.getVetor(i).calcularMedia()>7){
				System.out.println(v.getVetor(i).getNomeAluno()+" est� aprovado.");
			}else{
				System.out.println(v.getVetor(i).getNomeAluno()+ " est� reprovado.");
			}
		}
	}
}
