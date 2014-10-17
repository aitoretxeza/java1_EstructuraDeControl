/* programa que lee un número n y muestra n asteriscos */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo2While
public class Ejemplo2While {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara dos variables (n y contador) de tipo int, a la variable contador le da un valor inicial de 0
		int n, contador = 0;
		//muestra en pantalla la frase
		System.out.print("Introduce un número: ");
		//guarda el valor introducido en la variable n
		n = sc.nextInt();
		//introduce estructura interativa o repetitiva (while), si el valor guardado en la variable contador es menor que el valor guardado en la variable n ejecuta las siguientes instrucciones
		while (contador < n){
			//muestra en pantalla *
			System.out.println(" * ");
			//al valor guardado en la variable contador le suma un uno
			contador++;
		}
	}
}
