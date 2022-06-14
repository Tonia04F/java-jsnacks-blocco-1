package jsnacks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {
		/*Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
			lista di cognomi, genera una falsa lista di 3 invitati.*/ 
		
		String[] nomi = {"tonia", "noemi","davide","gino","lello"};
		String[] cognomi = {"fioretto", "de cicco", "visconti","esposito","di natale"};
		String[] lista = new String[3];
		

		Random ran = new Random();
		
		/*String invitatoUno = nomi[ran.nextInt(nomi.length)]+" " + cognomi[ran.nextInt(cognomi.length)];
		System.out.println(invitatoUno);
		String invitatoDue = nomi[ran.nextInt(nomi.length)]+" " + cognomi[ran.nextInt(cognomi.length)];
		System.out.println(invitatoDue);
		String invitatoTre = nomi[ran.nextInt(nomi.length)]+" " + cognomi[ran.nextInt(cognomi.length)];
		System.out.println(invitatoTre);*/
		
		
		//soluzione con ciclo for piu pratica e veloce
		for (int i = 0 ; i < lista.length; i++) {
			//ad ogni interazione creo nome fake
			//creo indice casuale tra 0 e la lunghezza dell array nomi 
			int index = ran.nextInt(nomi.length); //nomi.length per ciclare lista nomi e sceglierne uno
			//prendo nome da array
			String nomeCasuale = nomi[index];
			//faccio stessa cosa per cognome
			index = ran.nextInt(cognomi.length);
			String cognomeCasuale = cognomi[index];
			
			//metto nome creato random alla posizione corrente
		 lista[i] = nomeCasuale + " " + cognomeCasuale;
		 System.out.println(lista[i]);
		}
			
		}
		
		
		
		
		

	}


