/*Escribe un método con parámetros y con retorno que reciba un arreglo de enteros y 
 * devuelva el valor máximo del arreglo.*/

import java.util.Arrays;

import javax.swing.JOptionPane;

public class NumeroMayorArreglo {

	public static void main(String[] args) {
		int[] arreglo = {2,4,8,10,6,0};
		int numeroMayor = numeroMayor(arreglo);
		JOptionPane.showMessageDialog(null, "Arreglo: "+Arrays.toString(arreglo)+"\nNumero mayor: "+numeroMayor ,"INFO" ,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int numeroMayor(int[] arreglo) {
		int mayor= arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i]>mayor) {
				mayor= arreglo[i];
			}
		}
		return mayor;
	}

}
