/* Programa que dibuja un rectángulo sólido de asteriscos. El número de filas y columnas se pide por teclado */

//importa todo lo que haya en la libreria java.util
import java.util.*;
//crea la clase y lo llama Ejemplo1BuclesAnidados
public class Ejemplo1BuclesAnidados {
	//declara el contenido de la clase principal
	public static void main(String[] args) {
		//crea un objeto (sc) de tipo Scanner
		Scanner sc = new Scanner(System.in);
		//declara dos variables (filas y columnas) de tipo int
		int filas, columnas;
		//introduce estructura interativa o repetitiva (do - while)
		do{
			//muestra en pantalla la frase
			System.out.print("Introduce número de filas: ");
			//guarda el valor introducido en la variable filas
			filas = sc.nextInt();
		//si el valor guardado en la variable filas es menor que 1 volvera a repetir la instruccion do
		}while(filas<1);
		//introduce estructura interativa o repetitiva (do - while)
		do{
			//muestra en pantalla la frase
			System.out.print("Introduce número de columnas: ");
			//guarda el valor introducido en la variable columnas
			columnas = sc.nextInt();
		//si el valor guardado en la variable columnas es menor que 1 volvera a repetir la instruccion do
		}while(columnas<1);
		//introduce estructura interativa o repetitiva (for), a la variable i le da un valor de 1, la condicion es que la variabe i tiene que ser menor o igual que la variable filas, cada vez que se ejecute la instruccion for le sumaun uno a la variable i
		for(int i = 1; i<=filas; i++){
			//introduce estructura interativa o repetitiva (for), a la variable j le da un valor de 1, la condicion es que la variabe j tiene que ser menor o igual que la variable columnas, cada vez que se ejecute la instruccion for le sumaun uno a la variable i
			for(int j = 1; j<=columnas; j++){
				//muestra en pantalla la frase
				System.out.print(" * ");
			}
			//muestra en pantalla la frase
			System.out.println();
		}
       
	}
}
