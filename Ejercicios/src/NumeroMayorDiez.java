/*Escribe un método con parámetros y sin retorno que reciba un número entero y lo imprima en pantalla 
 * si es mayor que 10.*/

import javax.swing.JOptionPane;

public class NumeroMayorDiez {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite cualquier numero entero"));
		numeroMayor(numero);
	}

	public static void numeroMayor (int numero) {
		if (numero>10) {
			JOptionPane.showMessageDialog(null, "El numero: "+numero+" Es mayor a 10 " , "INFO" ,JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
