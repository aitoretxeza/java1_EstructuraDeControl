/* Programa que pide dos números y un operador y muestra el resultado */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//importa todo lo que haya en la libreria java.io
import java.io.*;
//crea la clase y lo llama Ejemplo1Switch
public class Ejemplo1Switch {
	//declara el contenido de la clase principal
	public static void main(String[] args) throws IOException{
		//declara tres variables (A, B y Resultado) de tipo int, a la variable Resultado le da un valor inicial de 0
		int A,B, Resultado = 0 ;
		//declara una variable (operador) de tipo char
		char operador;
		//declara una variable (calculado) de tipo boolean, le da un valor inicial de true
		boolean calculado = true;
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//muestra en pantalla la frase
		System.out.print("Introduzca un numero entero:");
		//guarda el numero introducido en la variable A
		A = sc.nextInt();
		//muestra en pantalla la frase
		System.out.print("Introduzca otro numero entero:");
		//guarda el numero introducido en la variable B
		B = sc.nextInt();
		//muestra en pantalla la frase
		System.out.print("Introduzca un operador (+,-,*,/):");
		//lee el valor introducido y lo transforma al tipo char,despues lo guarda en la variable operador
		operador = (char)System.in.read();
		//introduce una estructura de control (switch) con la variable operador
		switch (operador) {
			//en el caso de que lo guardado en la variable operador sea igual al signo -, resta la variable A menos la variable B y lo guarda en la variable Resultado
			case '-' : Resultado = A - B;
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable operador sea igual al signo +, suma la variable A mas la variable B y lo guarda en la variable Resultado
			case '+' : Resultado = A + B;
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable operador sea igual al signo *, multiplica la variable A por la variable B y lo guarda en la variable Resultado
			case '*' : Resultado = A * B;
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable operador sea igual al signo /, introduce una condicion, si lo que esta guardado en la variable B es diferente a 0 ejecuta las siguientes instrucciones
			case '/' : if(B!=0)
					//divide la variable A con la variable B y lo guarda en la variable Resultado
					Resultado = A / B;
				//si la condicion de arriba no se cumple ejecuta las siguientes instrucciones
				else{
					//muestra en pantalla la frase
					System.out.println("\nNo se puede dividir por cero");
					//cambia el valor de la variable calculado a false
					calculado = false;
				}
				//fin de la estructura de control (switch)
				break;
			//en los demas casos, en los que la variable operador no tenga un valor igual que los de arriba, muestra en pantalla la frase
			default : System.out.println("\nOperador no valido");
				//cambia el valor de la variable calculado a false
				calculado = false;
                         
		}
		//introduce una condicion, si lo que esta guardado en la variable calculado es true ejecuta las siguientes instrucciones
		if(calculado){
			//muestra en pantalla la frase
			System.out.println("\nEl resultado es: " + Resultado);
		}
	}
}
