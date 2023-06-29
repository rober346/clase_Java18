package Ejercicio_Dia18;

import java.util.Scanner;

public class PidiendoNumerosWhile {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		int numero;
		do {
			System.out.println("INGRESA UN NUMERO (EXCEPTO ENTRE -5 Y 0): ");
			numero = ent.nextInt();
		} while (numero <= -5 || numero >= 0);
		System.out.println("** Ingresaste numero entre -5 y 0 **");
		System.out.println("******* PROGRAMA FINALIZADO ********");
		ent.close();
	}
}
