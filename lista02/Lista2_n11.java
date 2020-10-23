package lista02;

import java.util.Scanner;

public class Lista2_n11 {

	static Scanner scan = new Scanner(System.in);  //variável global
	
	public static void main(String[] args) {
		int num1, num2;
		System.out.println("digite o primeiro numero:");
		num1 = scan.nextInt();
		System.out.println("digite o segundo numero:");
		num2 = scan.nextInt();
		System.out.println("o menor numero é "+ procurarMenor(num1,num2));
	}
	static int procurarMenor(int v1,int v2){  //não considerando numeros iguais
		if(v1>v2){
			return v2; 
		}else{
			return v1;
		}
	}

}
