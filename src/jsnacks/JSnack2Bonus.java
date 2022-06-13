package jsnacks;

import java.util.Scanner;

public class JSnack2Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int numero = sc.nextInt();
		
		int counter = 0;
		boolean continua = true;
		
		while(counter < 10) {
			if(numero % 2 == 0) {
				System.out.println(numero);
				break;
			}
			else {
				System.out.println(numero + 1);
				break;
			}
		}

	}

}
