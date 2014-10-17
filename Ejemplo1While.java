/* Programa que lee números hasta que se lee un negativo y muestra la suma de los números leídos */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo1While
public class Ejemplo1While {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara dos variables (suma y num) de tipo int, a la variable suma le da un valor inicial de 0
		int suma = 0, num;
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//muestra en pantalla la frase
		System.out.print("Introduzca un número: ");
		//guarda el valor introducido en la variable num
		num = sc.nextInt();
		//introduce estructura interativa o repetitiva (while), si el valor guardado en la variable num es igual o mayor que 0 ejecuta las siguientes instrucciones
		while (num >= 0){
			//guarda el valor de la variable suma mas la variable num en la variable suma
			suma = suma + num;
			//muestra en pantalla la frase
			System.out.print("Introduzca un número: ");
			//guarda el valor introducido en la variable num
			num = sc.nextInt();
		}
		//muestra en pantalla la frase y el valor que tiene la variable suma
		System.out.println("La suma es: " + suma );
	}
}
