/*Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las claves 
 * sean palabras en inglés y los valores sean las traducciones al español. Permite al usuario ingresar una 
 * palabra en inglés y muestra su traducción en español si está en el diccionario*/


import java.util.HashMap;
import javax.swing.JOptionPane;

public class DiccionarioIngles {
	static HashMap<String, String> palabras = new HashMap<>();
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void contenido() {
		palabras.put("Engineer", "Ingeniero/Ingeniera");
		palabras.put("Lawyer", "Abogado/Abogada");
		palabras.put("Tailor", "Costurero/Costurera");
		palabras.put("Chemist", "Quimico/Quimica");
		palabras.put("Firefighter", "Bombero/Bombera");
		palabras.put("Nurse", "Enfermero/Enfermera");
	}
	
	public static void menu() {
		contenido();
		String traduccion, menu = "DICCIONARIO EN INGLES\n";
		int cod;
		boolean validacion=false;
		menu += "Seleccione una de la siguientes palabras:\n\n";
		menu += "1. Engineer\n";
		menu += "2. Lawyer\n";
		menu += "3. Tailor\n";
		menu += "4. Chemist\n";
		menu += "5. Firefighter\n";
		menu += "6. Nurse\n";
		menu += "7. Salir";
		
	
		do {
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (cod) {
			case 1:
				traduccion = palabras.get("Engineer");
				JOptionPane.showMessageDialog(null, traduccion, "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				traduccion = palabras.get("Lawyer");
				JOptionPane.showMessageDialog(null, traduccion, "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				traduccion = palabras.get("Tailor");
				JOptionPane.showMessageDialog(null, traduccion, "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				traduccion = palabras.get("Chemist");
				JOptionPane.showMessageDialog(null, traduccion, "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				traduccion = palabras.get("Firefighter");
				JOptionPane.showMessageDialog(null, traduccion, "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6:
				traduccion = palabras.get("Nurse");
				JOptionPane.showMessageDialog(null, traduccion, "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 7:
				validacion = true;
				JOptionPane.showMessageDialog(null, "Gracias por usar el diccionario", "INFO", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Codigo no valido", "ERROR", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (validacion == false);
	}
}


