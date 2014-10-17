/* Programa que pide una nota por teclado y muestra un mensaje si la nota es mayor o igual que 5 */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo02If
public class Ejemplo02If {
	//declara el contenido de la clase principal
	public static void main( String[] args ){
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner( System.in );
		//muestra en pantalla la frase
		System.out.print("Nota: ");
		//declara una variable (nota) de tipo int y guarda en ella el numero introducido
		int nota = sc.nextInt();
		//introduce una condicion, si lo que esta guardado en la variable nota es igual o mayor que cinco ejecuta las instrucciones que estan entre llaves
		if (nota >= 5 ){
			//muestra en pantalla la frase
			System.out.println("Enorabuena!!");
			//muestra en pantalla la frase
			System.out.println("Has aprobado");
		}
		//si no se cumple la condicion de arriba ejecuta la siguiente instruccion
		else
			//muestra en pantalla la frase
			System.out.println("Lo Siento, has suspendido");
	}
}
