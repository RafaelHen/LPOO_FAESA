package lista03;

import java.util.Scanner;

public class PautaMain {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		//cria��o do objeto pauta
		Pauta aluno = new Pauta();
		char opcao;
		do {
			System.out.println("\n\nEscolha uma op��o:\n"+	
					"1.	Cadastrar um aluno\n"+
					"2.	Mostrar todos os dados do aluno\n"+
					"3.	Verificar se o aluno est� reprovado por falta\n"+
					"4.	Mostrar a m�dia do aluno\n"+
					"5.	Mostrar situa��o de aprova��o ou reprova��o\n"+
					"6.	Finalizar opera��es\n");
			opcao = scan.next().charAt(0);
			switch (opcao){
			case '1':
				cadastrarAluno(aluno);
				break;
			case '2':
				System.out.println("Dados do aluno: "+aluno.toSring());
				break;
			case '3':
				verificarReprovacaoFalta(aluno);
				break;
			case '4':
				System.out.println("O aluno "+aluno.getNomeAluno()+
						" tem m�dia = "+aluno.calcularMedia());
				break;
			case '5':
				System.out.println("O aluno "+aluno.getNomeAluno()+
						" est� "+aluno.verificarSituacao());
				break;
			case '6':
				System.out.println("fim do programa.");
				break;
			default:
				System.out.println("op��o inv�lida.");
			}
		}while (opcao!= '6');
	}//fim do main
	static void cadastrarAluno(Pauta a){
		System.out.println("Digite a matricula do aluno:");
		a.setMatricula(scan.nextInt());
		System.out.println("Digite o nome do aluno:");
		a.setNomeAluno(scan.next());
		System.out.println("Digite o n�mero de faltas do aluno:");
		a.setNumFalta(scan.nextInt());
		System.out.println("Digite a nota1:");
		a.setNota1(scan.nextDouble());
		System.out.println("Digite a nota2:");
		a.setNota2(scan.nextDouble());
	}
	static void verificarReprovacaoFalta(Pauta a){
		if (a.verificarFaltas()){
			System.out.println("O aluno est� reprovado por faltas.");
		}else{
			System.out.println("O aluno n�o est� reprovado por faltas.");
		}
	}


}//fim do programa
