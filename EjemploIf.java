/* programa que pide un número por teclado y calcula si es par o impar */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama EjemploIf
public class EjemploIf {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara una variable (num) de tipo int
		int num;
		//muestra en pantalla la frase
		System.out.println("Introduzca numero: ");
		//guarda el numero introducido en la variable num
		num = sc.nextInt();
		//introduce una condicion, divide el numero guardado en la variable num y si el resto es igual a 0 ejecuta las siguientes instrucciones
		if ((num%2)==0)
			//muestra en pantalla la frase
			System.out.println("PAR");
		//si la condicion de arriba no se cumple ejecuta las siguientes instrucciones
		else
			//muestra en pantalla la frase
			System.out.println("IMPAR");
	}
}
