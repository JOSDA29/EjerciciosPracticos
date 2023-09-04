/*Escribe un método sin parámetros y con retorno que genere un número aleatorio entre 1 y 100 y 
 * lo devuelva como resultado.*/

import java.util.Random;
import javax.swing.JOptionPane;

public class NumeroAleatorio {

	public static void main(String[] args) {
		int numeroAleatorio = generadorNumeroAleatorio();
		JOptionPane.showMessageDialog(null, "Numero Aleatorio: "+numeroAleatorio , "INFO" ,JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int generadorNumeroAleatorio() {
		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(100);
		return numero;
	}

}
