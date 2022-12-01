package ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
	
	/**Javadoc*/
	public static void main(String[] args) {

		final Scanner s = new Scanner(System.in);

		System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
		System.out.print("Por favor, introduzca n: ");
		int n = s.nextInt();

		switch (n) {
		case 1:
			System.out.print("0");
			break;
		case 2:
			System.out.print("0 1");
			break;
		default:
			System.out.print("0 1");
			int f1 = 0;
			int f2 = 1;
			int aux;
			while (n > 2) {
				aux = f1;
				f1 = f2;
				f2 = aux + f2;
				System.out.print(" " + f2);
				n--;
			}
			break;
		}
		System.out.println();
		s.close();
	}
}
