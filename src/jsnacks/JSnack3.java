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
		
		String invitatoUno = nomi[ran.nextInt(nomi.length)]+" " + cognomi[ran.nextInt(cognomi.length)];
		System.out.println(invitatoUno);
		String invitatoDue = nomi[ran.nextInt(nomi.length)]+" " + cognomi[ran.nextInt(cognomi.length)];
		System.out.println(invitatoDue);
		String invitatoTre = nomi[ran.nextInt(nomi.length)]+" " + cognomi[ran.nextInt(cognomi.length)];
		System.out.println(invitatoTre);
			
		}
		
		
		
		
		

	}


