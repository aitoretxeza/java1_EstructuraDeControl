/* Programa que muestra una tabla con las potencias de x (x x2 x3 x4) para valores de x desde 1 hasta XMAX */

//crea la clase y lo llama JavaApplication22
public class JavaApplication22 {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//declara una variable (XMAX) de tipo int, le da un valor inicial de 10
		final int XMAX = 10;		
		//declara dos variables (x y n) de tipo int
		int x, n;
		//muestra en pantalla la frase
		System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
		//introduce estructura interativa o repetitiva (for), a la variable x le da un valor de 1, la condicion es que la variabe x tiene que ser menor o igual que la variable XMAX, cada vez que se ejecute la instruccion for le suma un uno a la variable x
		for (x = 1; x <= XMAX; x++){
			//introduce estructura interativa o repetitiva (for), a la variable n le da un valor de 1, la condicion es que la variabe n tiene que ser menor o igual que 4, cada vez que se ejecute la instruccion for le suma un uno a la variable n
			for (n = 1; n <= 4; n++){
				//muestra en pantalla la frase
				System.out.printf("%10.0f", Math.pow(x,n));
			}
		//muestra en pantalla la frase
		System.out.println();
		}
	}
}
