package jsnacks;

import java.util.Scanner;

public class JSnack1Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int somma = 0;
		int numero;
		boolean continua = true;
		System.out.println("inserisci 5 numeri");
		
		while(counter < 5) {
			numero = sc.nextInt();
			continua = false;
			somma = somma + numero;
			counter ++;
			
		}
		System.out.println("la somma dei numeri è: " + somma);
		

			sc.close();
	}

}
