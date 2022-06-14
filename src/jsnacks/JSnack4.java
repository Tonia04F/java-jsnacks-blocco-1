package jsnacks;

import java.util.Arrays;
import java.util.Random;

public class JSnack4 {

	public static void main(String[] args) {
		/*Crea un array di numeri interi
		e fai la somma di tutti gli elementi che sono in posizione dispari*/ 
		
	//creo array vuoto di 50 elementi
		int[] numeri = new int[50];
		//importo il random per riempire casualmente array
		Random ran = new Random();
		//creo numeri casuale da 1 a 100 da inserire all interno
		for(int i = 0; i < numeri.length; i++) {
			//assegno valori ai singoli indici dandogli il limite di fino a 100
			numeri[i] = ran.nextInt(101);
		}
		//per stampare indici di array devo usare arrays.tostring altrimenti stampa solo lo spazio in memoria
		System.out.println(Arrays.toString(numeri));
		
		int somma = 0;
		//faccio nuovo for per sommare i dispari
		for( int i = 0; i < numeri.length; i++) {
			// sommo solo i numeri dispari
			if(i % 2 != 0) {
				somma += numeri[i];
				
			}
		}
		System.out.println("la somma dei numeri dispari è: " + somma);

	}

}
