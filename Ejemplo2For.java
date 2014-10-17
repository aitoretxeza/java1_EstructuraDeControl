/* programa que muestra los números del 10 al 1 */

//crea la clase y lo llama Ejemplo0For
public class Ejemplo2For {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (valor) de tipo int
		int i;
		//introduce estructura interativa o repetitiva (for), a la variable i le da un valor de 10, la condicion es que el valor de la variable i tiene que ser mayor que 0, cada vez que se ejecute la instruccion for al valor de la variable i se le resta un uno
		for(i=10; i>0;i--)
			//muestra en pantalla la frase y el valor de la variable i
			System.out.println(i + " ");
	}
}
