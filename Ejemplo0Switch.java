/* Programa que pide un número de mes y muestra el nombre correspondiente */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo0Switch
public class Ejemplo0Switch {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (mes) de tipo int
		int mes;
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//muestra en pantalla la frase
		System.out.print("Introduzca un numero de mes: ");
		//guarda el numero introducido en la variable mes
		mes = sc.nextInt();
		//introduce una estructura de control (switch) con la variable mes
		switch (mes){
			//en el caso de que lo guardado en la variable mes sea igual a 1 muestra en pantalla enero
			case 1: System.out.println("ENERO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 2 muestra en pantalla febrero
			case 2: System.out.println("FEBRERO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 3 muestra en pantalla marzo
			case 3: System.out.println("MARZO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 4 muestra en pantalla abril
			case 4: System.out.println("ABRIL");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 5 muestra en pantalla mayo
			case 5: System.out.println("MAYO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 6 muestra en pantalla junio
			case 6: System.out.println("JUNIO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 7 muestra en pantalla julio
			case 7: System.out.println("JULIO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 8 muestra en pantalla agosto
			case 8: System.out.println("AGOSTO");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 9 muestra en pantalla septiembre
			case 9: System.out.println("SEPTIEMBRE");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 10 muestra en pantalla octubre
			case 10: System.out.println("OCTUBRE");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 11 muestra en pantalla noviembre
			case 11: System.out.println("NOVIEMBRE");
				//fin de la estructura de control (switch)
				break;
			//en el caso de que lo guardado en la variable mes sea igual a 12 muestra en pantalla diciembre
			case 12: System.out.println("DICIEMBRE");
				//fin de la estructura de control (switch)
				break;
			//en los demas casos, en los que la variable mes no tenga un valor igual que los de arriba, muestra en pantalla la frase
			default : System.out.println("Mes no válido");                       
		}
	}
}
