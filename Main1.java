/* Programa que lea dos números por teclado y los muestre por pantalla.*/

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Main1
public class Main1 {
	//declara el contenido de la clase principal
	public static void main(String[] args){
		//declara dos variables (n1 y n2) de tipo int
		int n1, n2;
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//muestra en pantalla la frase
		System.out.println("Introduce un número entero: ");
		//guarda el numero introducido en la variable n1
		n1 = sc.nextInt();
		//muestra en pantalla la frase
		System.out.println("Introduce otro número entero: ");
		//guarda el numero introducido en la variable n2
		n2 = sc.nextInt();
		//muestra en pantalla la frase y lo que esta guardado en las variables n1 y n2
		System.out.println("Ha introducido los números: " + n1 + " y " + n2);
	}
}
