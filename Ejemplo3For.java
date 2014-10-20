/* programa que muestra el valor de a, b y su suma mientras que la suma de ambas es menor de 10. En cada iteración el valor de a se incrementa en 1 unidad y el de b en 2 */

//crea la clase y lo llama Ejemplo3For
public class Ejemplo3For {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara dos variables (a y b) de tipo int
		int a, b;
		//introduce estructura interativa o repetitiva (for), a las variables a y b les da un valor de 1, la condicion es que la suma de la variabe a mas la variable b tienen que ser menor que 10, cada vez que se ejecute la instruccion for a suma un uno a la variable a y le suma dos a la variable b
		for(a = 1, b = 1; a + b < 10; a++, b+=2){
			//muestra en pantalla la frase y los valores de las variables a, b y la suma de estos dos
			System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
		}
	}
}
