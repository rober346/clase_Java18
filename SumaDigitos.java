package Ejercicio_Dia18;

import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		System.out.println("INGRESA UN NUMERO PARA SUMAR SUS DIGITOS: ");
		
		long numero = ent.nextLong();
		long ultimoNumero;
		long sumaDigitos = 0;
		
		while (numero > 0) {
			ultimoNumero = numero % 10;
			sumaDigitos = sumaDigitos + ultimoNumero;
			numero = numero / 10;
		}		
		System.out.println("LA SUMA ES: " + sumaDigitos);
		ent.close();
	}
}
