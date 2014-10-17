/* Programa que obliga al usuario a introducir un número menor que 100 */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo1DoWhile
public class Ejemplo1DoWhile {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (valor) de tipo int
		int valor;
		//crea un objeto (sc) de tipo Scanner
		Scanner in = new Scanner( System.in );
		//introduce estructura interativa o repetitiva (do - while)
		do {
			//muestra en pantalla la frase
			System.out.print("Escribe un entero < 100: ");
			//guarda el valor introducido en la variable valor
			valor = in.nextInt();
		//si el valor guardado en la variable valor es igual o mayor que 100 volvera a repetir la instruccion do
		}while (valor >= 100);
		//muestra en pantalla la frase y el valor que tiene la variable valor
		System.out.println("Ha introducido: " + valor);
	}
}
