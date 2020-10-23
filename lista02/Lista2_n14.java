package lista02;

import java.util.Scanner;

public class Lista2_n14 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idade;
		System.out.println("digite a idade do jogador:");
		idade = scan.nextInt();
		System.out.println("a categoria do jogador é "+ classificarJogador(idade));
	}
	
	static String classificarJogador(int i){
		if (i <= 7){
			return "pre-mirim";
		}else{
			if (i <=10){
				return "mirim";
			}else{
				if (i <=13){
					return "infantil";
				}else{
					if (i <=17){
						return "juvenil";
					}else{
						return "adulto";
					}
				}
			}
		}
	}
}