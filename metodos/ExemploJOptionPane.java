package metodos;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

	public static void main(String[] args) {
		String nome;
		int numero;
		double numReal;
		
		nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
		JOptionPane.showMessageDialog(null, "o nome � "+nome);

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		JOptionPane.showMessageDialog(null, "o numero � "+numero);
		
		
		JOptionPane.showMessageDialog(null, "o nome � "+nome+ " e o numero � "+numero );

		numReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real:"));
		JOptionPane.showMessageDialog(null, "o numero real � "+numReal);
		
		
		
		
	}

}
