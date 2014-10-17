/* programa que muestra una tabla de equivalencias entre grados Fahrenheit y grados celsius */

//crea la clase y lo llama Ejemplo3While
public class Ejemplo3While {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (VALOR_INICIAL) de tipo int, le da un valor inicial de 10
		final int VALOR_INICIAL = 10;
		//declara una variable (VALOR_FINAL) de tipo int, le da un valor inicial de 100
		final int VALOR_FINAL = 100;
		//declara una variable (PASO) de tipo int, le da un valor inicial de 10
		final int PASO = 10;
		//declara una variable (fahrenheit) de tipo int
		int fahrenheit;
		//declara una variable (celsius) de tipo double
		double celsius;
		//guarda en la variable fahrenheit el valor que tiene la variable VALOR_INICIAL
		fahrenheit = VALOR_INICIAL;
		//muestra en pantalla la frase
		System.out.printf("Fahrenheit \t Celsius \n");
		//introduce estructura interativa o repetitiva (while), si el valor guardado en la variable fahrenheit es igual o menor que el valor guardado en la variable VALOR_FINAL ejecuta las siguientes instrucciones
		while (fahrenheit <= VALOR_FINAL ){
			//guarda en la variable celsius el valor del resultado del valor guardado en la variable fahrenheit menos 32 por 5 entre 9.0
			celsius = 5*(fahrenheit - 32)/9.0;
			//muestra en pantalla la frase y los valores que tienen laa variablea fahrenheit y celsius
			System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
			//le suma al valor de la variable fahrenheit el valor que tiene la variable PASO
			fahrenheit += PASO;
		}
	}
}
