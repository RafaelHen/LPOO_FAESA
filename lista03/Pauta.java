package lista03;

public class Pauta {
	//atributos
	private int matricula;
	private String nomeAluno;
	private int numFalta;
	private double nota1;
	private double nota2;
	
	//construtores
	public Pauta(){
		this.matricula = 0;
		this.nomeAluno = "";
		this.numFalta = 0;
		this.nota1 = 0.0;
		this.nota2 = 0.0;
	}
	public Pauta(int m, String nome, int numF, double n1, double n2){
		this.matricula = m;
		this.nomeAluno = nome;
		this.numFalta = numF;
		this.nota1 = n1;
		this.nota2 = n2;
	}
			
	//gets  (todo get é do tipo função)(serve para ler o valor do atributo)
	public int getMatricula(){
		return this.matricula;
	}
	public String getNomeAluno(){
		return this.nomeAluno;
	}
	public int getNumFalta(){
		return this.numFalta;
	}
	public double getNota1(){
		return this.nota1;
	}
	public double getNota2(){
		return this.nota2;
	}
	
	//sets   (todo set é do tipo procedimento)(serve para alterar o valor do atributo)
	public void setMatricula(int novoValor){
		this.matricula = novoValor;
	}
	public void setNomeAluno(String novoValor){
		this.nomeAluno = novoValor;
	}
	public void setNumFalta(int novoValor){
		this.numFalta = novoValor;
	}
	public void setNota1(double novoValor){
		this.nota1 = novoValor;
	}
	public void setNota2(double novoValor){
		this.nota2 = novoValor;
	}
		
	//toString  (sempre será uma função)(mostrar todos os valores dos atributos)
	public String toSring(){
		return " matricula: "+this.matricula+
				" nome: "+this.nomeAluno+
				" número de faltas: "+this.numFalta+
				" nota1: "+this.nota1+
				" nota2: "+this.nota2;
	}
	
	//verificar reprovação por faltas
	public boolean verificarFaltas(){
		if (this.numFalta>25){
			return true;
		}else{
			return false;
		}
	}
	//calcular média
	public double calcularMedia(){
		return (this.nota1+this.nota2)/2;
	}
	//verificar situação do aluno: aprovado ou reprovado
	public String verificarSituacao(){
		if (this.calcularMedia()>=7 && !this.verificarFaltas()){
			return "aprovado";
		}else{
			return "reprovado";
		}
	}
	
	
	
	
	

}
