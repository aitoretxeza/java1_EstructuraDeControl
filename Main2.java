/* Programa que lee dos números de tipo double por teclado y muestra su suma, resta y multiplicación. */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Main2
public class Main2 {
	//declara el contenido de la clase principal
	public static void main(String[] args){
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara dos variables (numero1 y numero2) de tipo double
		double numero1, numero2;
		//muestra en pantalla la frase
		System.out.println("Introduce el primer número:");
		//guarda el numero introducido en la variable numero1
		numero1 = sc.nextDouble();
		//muestra en pantalla la frase
		System.out.println("Introduce el segundo número:");
		//guarda el numero introducido en la variable numero2
		numero2 = sc.nextDouble();
		//muestra en pantalla la frase y lo que esta guardado en las variables numero1 y numero2
		System.out.println("Números introducido: " + numero1 + "  " + numero2);
		//hace la suma de las dos variables y el resultado lo muestra en pantalla
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2));
		//hace la resta de las dos variables y el resultado lo muestra en pantalla
		System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2));
		//hace la multiplicacion de las dos variables y el resultado lo muestra en pantalla
		System.out.println(numero1 + " * " + numero2 + " = " + numero1*numero2);
	}
}
