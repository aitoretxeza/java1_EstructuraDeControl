/* programa que lee una nota y escribe la calificación correspondiente */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo3If
public class Ejemplo3If {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara una variable (nota) de tipo double
		double nota;
		//muestra en pantalla la frase
		System.out.println("Introduzca una nota entre 0 y 10: ");
		//guarda el numero introducido en la variable nota
		nota = sc.nextDouble();
		//muestra en pantalla la frase
		System.out.println("La calificación del alumno es ");
		//introduce una condicion, si lo que esta guardado en la variable nota es menor que 0 o es mayor que 10 ejecuta las siguientes instrucciones
		if(nota < 0 || nota > 10)
			//muestra en pantalla la frase
			System.out.println("Nota no válida");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable nota es igual a 10 ejecuta las siguientes instrucciones
		else if(nota==10)
			//muestra en pantalla la frase
			System.out.println("Matrícula de Honor");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable nota es igual o mayor que 9 ejecuta las siguientes instrucciones
		else if (nota >= 9)
			//muestra en pantalla la frase
			System.out.println("Sobresaliente");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable nota es igual o mayor que 7 ejecuta las siguientes instrucciones
		else if (nota >= 7)
			//muestra en pantalla la frase
			System.out.println("Notable");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable nota es igual o mayor que 6 ejecuta las siguientes instrucciones
		else if (nota >= 6)
			//muestra en pantalla la frase
			System.out.println("Bien");
		//si la condicion de arriba no se cumple, introduce otra condicion, si lo que esta guardado en la variable nota es igual o mayor que 5 ejecuta las siguientes instrucciones
		else if (nota >= 5)
			//muestra en pantalla la frase
			System.out.println("Suficiente");
		//si la condicion de arriba no se cumple ejecuta las siguientes instrucciones
		else
			//muestra en pantalla la frase
			System.out.println("Suspenso");
	}
}
