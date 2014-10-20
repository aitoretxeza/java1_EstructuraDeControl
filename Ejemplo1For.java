/* programa que muestra una tabla de equivalencias entre grados Fahrenheit y grados celsius */

//crea la clase y lo llama Ejemplo1For
public class Ejemplo1For {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (VALOR_INICIAL) de tipo int, le da un valor inicial de 10
		final int VALOR_INICIAL = 10; 
		//declara una variable (VALOR_FINAL) de tipo int, le da un valor inicial de 100
		final int VALOR_FINAL = 100; 
		//declara una variable (PASO) de tipo int, le da un valor inicial de 10
		final int PASO = 10 ;
		//declara una variable (fahrenheit) de tipo int
		int fahrenheit;
		//declara una variable (celsius) de tipo double
		double celsius;
		//guarda el valor de la variable VALOR_INICIAL en la variable fahrenheit
		fahrenheit = VALOR_INICIAL;
		//muestra en pantalla la frase
		System.out.printf("Fahrenheit \t Celsius \n");
		//introduce estructura interativa o repetitiva (for), a la variable fahrenheit le da el valor de la variable VALOR_INICIAL, la condicion es la variabe fahrenheit tiene que ser menor o igual que la variable VALOR_FINAL, cada vez que se ejecute la instruccion for le suma el valor de la variable PASO a la variable fahrenheit
		for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;fahrenheit+= PASO) {
			//guarda el resultado de la operacion en la variable celsius
			celsius = 5*(fahrenheit - 32)/9.0;
			//muestra en pantalla la frase y los valores de las variables fahrenheit y celsius
			System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		}
	}
}
