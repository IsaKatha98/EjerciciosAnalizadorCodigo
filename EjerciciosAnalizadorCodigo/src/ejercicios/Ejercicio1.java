package ejercicios;

import java.util.Scanner;

/**Comentario*/
public class Ejercicio1 {
	
	/**Comentario*/
	public static final int CLAVE=1234;
	
	/**Comentario Javadoc*/
	public static void main(final String[] args) {

		final Scanner lectura = new Scanner(System.in);

		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;
		

		do {
			System.out.print("Introduzca la clave de la caja fuerte: ");
			numeroIntroducido = lectura.nextInt();

			if (numeroIntroducido == CLAVE) { // NOPMD by ikloerzer on 24/11/22, 12:09
				acertado = true;
			} else {
				System.out.println("Clave incorrecta");
			}

			intentos--;

		} while ((intentos > 0) && (!acertado));

		if (acertado) {
			System.out.println("Ha abierto la caja fuerte.");
		} else {
			System.out.println("Lo siento, ha agotado las 4 oportunidades.");
		}
		lectura.close();
	}
}

/*Tipos de errores:
 * 
 * - AvoidLiteralIsInlfCondition= no poner números en un if, poner variables constantes. 
 * Las constantes se escriben fuera de los métodos/funciones. Se escibre en el public class.
 * - CloseResource= cerrar el escáner. 
 * - CommetRequired= hace falta un comentario de Javadoc.
 * - DataFlowAnomalyAnalysis: se obvia porque está desactualizada.
 * - LocalVariableCouldBefinal: se refiere al escáner.
 * - ShortVariable: la variable es muy corta. BotonDerecho>Refactor>Rename
 * - SystemPrintln: los mensajes no se suelen imprimir en la consola sino en un log. Disable rule.
 * - UsselesParenthesis: paréntesis que no hacen falta.
 * - DefaultPackage: salta si falta algún public.
 * - CommentDefaultAccesMoodifier: se solucione poniendo public.
 * - UseUttilityClass: la deshabilitamos.
 * - MethodArgumentCouldBeFinal: se arregla poniendo final antes de los argumentos.
 * - ImplicitSwitchFallThrough: le falta un break a un case del switch.
 * 
 * 
 * Para modificar las normas hay que hacer BotonDrecho en el proyecto>Properties>PMD*/
