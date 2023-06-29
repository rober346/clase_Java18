package Ejercicio_Dia18;

import java.util.Scanner;

public class FactorialNumero {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		System.out.println("INGRESA UN NUMERO PARA CONOCER EL FACTORIAL: ");
		int numero = ent.nextInt();
		
		int i = 1;
		long factorial = 1;
		do {
			factorial = factorial * i;
			i++;
		} while (i <= numero);
		
		System.out.println("EL FACTORIAL ES: " + factorial);
		ent.close();
	}
}
