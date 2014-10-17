/* programa que muestra los números del 1 al 10 */

//crea la clase y lo llama Ejemplo0For
public class Ejemplo0For {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (valor) de tipo int
		int i;
		//introduce estructura interativa o repetitiva (for), a la variable i le da un valor de 1, la condicion es que el valor de la variable i tiene que ser igual o menor que 10, cada vez que se ejecute la instruccion for al valor de la variable i se le suma un uno
		for(i=1; i<=10;i++)
			//muestra en pantalla la frase y el valor de la variable i
			System.out.println(i + " ");
	}
}
