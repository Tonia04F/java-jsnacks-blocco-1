package jsnacks;

import java.util.Scanner;

public class JSnack5 {

	public static void main(String[] args) {
		/*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
			di posizioni nelle quali i caratteri corrispondenti sono diversi.
			Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.*/ 

		
	Scanner sc = new Scanner(System.in);
	System.out.println("dimmi due parole di uguale lunghezza: ");
	String parola1 = sc.nextLine();
	String parola2 = sc.nextLine();	
	
	//verifico che abbiamo la stessa lunghezza
	if(parola1.length()==parola2.length()) {
		//se sn uguali entro nell if e ontrollo carattere per carattere
		int distanzaHamming = 0; //aumenta solo se trovo caratteri diversi tra le stringhe
		//creo due array di caratteri dove scomporre le mie stringhe per confrontarle
		char[] parola1Array = parola1.toCharArray();
		char[] parola2Array = parola2.toCharArray();
		//creo ciclo for per ciclarli e confrontarli
		for(int i = 0; i < parola1Array.length; i++) {
			//confronto i caratteri con l altra stringa
			if(parola1Array[i] != parola2Array[i]){ // mi chiedo se sono uguali
				//priseguo carattere dopo carattere per vedere dove ho la distanza di hamming
				distanzaHamming++;
			}
		}
		System.out.println("la distanza tra le due parole è: " + distanzaHamming);
		
	}else {
		System.out.println("le parole hanno lunghezza diverse quindi non posso calcolare distanza di hamming!");
	}
	
	//devo confrontare le stringhe carattere per carattere 

	
	sc.close();
	}

}
