package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		/*Il software deve chiedere per 5 volte all’utente di inserire un numero.
			Il programma stampa la somma di tutti i numeri inseriti.
			Esegui questo programma in due versioni, con il for e con il while.*/ 
		
		
	Scanner sc = new Scanner(System.in);
		System.out.println("inserisci 5 numeri: ");
		
		
		int numero;
	    int somma = 0;
		
		for(int i = 0; i < 5; i++) {
			numero = sc.nextInt();
		    somma = somma + numero;
		
			
		}
		System.out.println("la somma dei 5 numeri è: " + somma);
		
		
		

	}

}
