/* Programa que lee un número entre 1 y 10 ambos incluidos */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo2DoWhile
public class Ejemplo2DoWhile {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (n) de tipo int
		int n;
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner( System.in );
		//introduce estructura interativa o repetitiva (do - while)
		do {
			//muestra en pantalla la frase
			System.out.print("Escribe un número entre 1 y 10: ");
			//guarda el valor introducido en la variable n
			n = sc.nextInt();
		//si el valor guardado en la variable n es menor que 1 o es mayor que 10 volvera a repetir la instruccion do
		}while (n<1 || n >10);
		//muestra en pantalla la frase y el valor que tiene la variable n
		System.out.println("Ha introducido: " + n);
	}
}
