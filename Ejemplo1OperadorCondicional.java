/* programa que pide un número por teclado y calcula si es par o impar */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo10Condicional
public class Ejemplo1OperadorCondicional {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara una variables (num) de tipo int
		int num;
		//muestra en pantalla la frase
		System.out.println("Introduzca numero: ");
		//guarda el numero introducido en la variable num
		num = sc.nextInt();
		//divide el numero guardado en la variable num entre dos y si el resto es igual a 0 muestra en pantalla PAR, si el resto de la division es diferente a 0 muestra en pantalla IMPAR
		System.out.println((num%2)==0 ? "PAR" : "IMPAR");
	}
}
