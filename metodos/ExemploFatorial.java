package metodos;

import javax.swing.JOptionPane;

public class ExemploFatorial {
	
	public static void main(String args []){
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Qual � o n�mero?"));
		if (calcularFatorial(numero)>30){
			JOptionPane.showMessageDialog(null, "O fatorial � maior que 30");
		}else{
			JOptionPane.showMessageDialog(null, "O fatorial � menor que 30");
		}
	}
	static int calcularFatorial (int n){
		int f = 1;
		for (int i = 1; i <= n; i++){
			f = f * i;
		}
		return f;
	}
	

}
