package lista02;

import java.util.Scanner;

public class Lista2_n11_outro {


	static Scanner scan = new Scanner(System.in);  //variável global

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("digite o primeiro numero:");
		num1 = scan.nextInt();
		System.out.println("digite o segundo numero:");
		num2 = scan.nextInt();
		System.out.println(procurarMenor(num1,num2));
	}
	static String procurarMenor(int v1,int v2){  
		if(v1>v2){
			return "o menor é "+v2; 
		}else{
			if (v1<v2){
				return "o menor é "+v1;
			}else{
				return "os números são iguais";
			}
		}
	}
}
