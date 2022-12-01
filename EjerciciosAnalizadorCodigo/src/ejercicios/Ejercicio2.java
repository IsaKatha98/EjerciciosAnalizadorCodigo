package ejercicios;

import java.util.Scanner;

/**Comentario*/
public class Ejercicio2 {
	
	/**Comentario*/
	public final static Scanner lectura=new Scanner(System.in);

	/**Javadoc*/
	public static void main(final String[] args) {
		
	    
	    int numeroDeDigitos = 1, num, numeroIntroducido;

	    System.out.print("Introduzca un n�mero entero y le dir� cu�ntos d�gitos tiene: ");
	    numeroIntroducido = lectura.nextInt();
	    
	    num = numeroIntroducido;
	    
	    while (num > 10) {
	      num /= 10;
	      numeroDeDigitos++;
	    }
	    
	    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " d�gito/s.");
	    lectura.close();

	}
}
