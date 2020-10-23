package lista03;

import lista03.Pauta;

public class PautaVet {
	//atributos
	private Pauta [] vetor;
	private int quantVet;
	
	//construtor
	public PautaVet(int tamanho){
		this.vetor = new Pauta[tamanho];
		this.quantVet = 0;
	}
	public Pauta getVetor(int indice){
		return this.vetor[indice];
	}
	public int getQuantVet(){
		return this.quantVet;
	}
	public void setVetor(int indice, Pauta novoAluno){
		this.vetor[indice]= novoAluno;
	}
	public void setQuantVet(int novoValor){
		this.quantVet = novoValor;
	}
	//será usado quando for remover, pesquisar ou alterar os dados do vetor
	public boolean eVazia(){
		return this.quantVet==0;
	}
	//será usado quando for inserir dados no vetor para evitar overflow
	public boolean eCheia(){
		return this.quantVet==this.vetor.length;
	}
	//inserir dados no vetor
	public boolean inserirDados(Pauta novoDado){
		if (this.eCheia()){
			return false;
		}else{
			this.vetor[this.quantVet]=novoDado;
			this.quantVet++;
			return true;
		}
	}
	//faz pesquisa de um dado e retorna a posição onde foi achado
	public int pesquisarDado(int mat){
		if (this.eVazia()){
			return -1; //ou return this.vetor.length    --> significa que não pode pesquisa
		}else{
			int i=0;
			while (i<this.quantVet && this.vetor[i].getMatricula()!= mat){
				i++;   //anda no vetor
			}
			if (i==this.quantVet){
				return -1;    // não achou o dado no vetor
			}else{
				return i;
			}
		}
	}
	//faz pesquisa e retorna todos os atributos do objeto
	public Pauta pesquisarDadoCompleto(int mat){
		if (this.eVazia()){
			return null; //não tem nada para retornar
		}else{
			int i=0;
			while (i<this.quantVet && this.vetor[i].getMatricula()!= mat){
				i++;
			}
			if (i==this.quantVet){
				return null;  //não tem nada para retornar
			}else{
				return this.vetor[i];
			}
		}
	}
	public boolean removerDados (int mat){
		if (this.eVazia()){
			return false;
		}else{
			int posicao = this.pesquisarDado(mat);
			if (posicao==-1){   //não achou a matricula
				return false;
			}else{
				this.vetor[posicao]= this.vetor[this.quantVet-1];
				this.quantVet--;
				return true;
			}
		}
	}
	public boolean alterarDados(int mat, Pauta novoDado){
		if (this.eVazia()){
			return false;
		}else{
			int posicao = this.pesquisarDado(mat);
			if (posicao==-1){
				return false;
			}else{
				this.vetor[posicao] = novoDado;
				return true;
			}
		}
	}
	//mostra todos os dados/objetos armazenados no vetor
	public String toString(){
		String resp="";
		for (int i=0; i< this.quantVet; i++){
			resp += this.vetor[i].toString()+ "\n";
		}
		return resp;
	}		

}
