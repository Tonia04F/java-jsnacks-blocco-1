package jsnacks;

import java.util.Scanner;

public class JSnack2 {

	public static void main(String[] args) {
		/*Chiedi all'utente di inserire un numero, se è pari stampa il numero,
			se è dispari stampa il numero successivo*/ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(numero % 2 == 0) {
				System.out.println(numero);
				break;
			}
			else {
				System.out.println(numero + 1);
				break;
				
			}
			
		}
		sc.close();
	}

}
