/* Programa que muestra un saludo distinto según la hora introducida */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo2If
public class Ejemplo2If {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara una variable (hora) de tipo int
		int hora;
		//muestra en pantalla la frase
		System.out.println("Introduzca una hora (un valor entero): ");
		//guarda el numero introducido en la variable hora
		hora = sc.nextInt();
		//introduce una condicion, si lo que esta guardado en la variable hora es igual o mayor que 0 y es menor que 12 ejecuta las siguientes instrucciones
		if (hora >= 0 && hora < 12)
			//muestra en pantalla la frase
			System.out.println("Buenos días");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable hora es igual o mayor que 12 y es menor que 21 ejecuta las siguientes instrucciones
		else if (hora >= 12 && hora < 21)
			//muestra en pantalla la frase
			System.out.println("Buenas tardes");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable hora es igual o mayor que 21 y es menor que 24 ejecuta las siguientes instrucciones
		else if (hora >= 21 && hora < 24)
			//muestra en pantalla la frase
			System.out.println("Buenas noches");
		//si la condicion de arriba no se cumple ejecuta las siguientes instrucciones
		else
			//muestra en pantalla la frase
			System.out.println("Hora no válida");
	}
}
