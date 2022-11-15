package org.booleancaeer.java;

import java.util.Scanner;

public class bigliettoTreno {
//	TODO:
//
//		Ciao!
//		Esercitazione di oggi: Biglietto del treno
//		Nome repo: java-biglietto-treno
//		Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
//		il prezzo del biglietto è definito in base ai km (0.21 € al km)
//		va applicato uno sconto del 20% per i minorenni
//		va applicato uno sconto del 40% per gli over 65
//		Come sempre create un progetto java con lo stesso nome del repo (java-biglietto-treno), aggiungete un package org.generation.italy e una classe CalcolaBiglietto. Il programma va implementato nel metodo main della classe CalcolaBiglietto.
//		Per acquisire l'input dell'utente usate la classe Scanner, come visto stamattina a lezione.
//		Buon lavoro!
//
//		-------------------------------------
//
//		BONUS1: i minori di 12 anni viaggiano gratis
//		BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)
	
	public static void main(String[] args) {
		//CREO LO SCANNER PER L'INPUT
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Buongirno mi dica il suo cognome ?");
		String lastName = sc.nextLine();
		
		System.out.print("Buongiorno sing. " + lastName + ", quanti Km dovrà percorrere ?");
		int km = sc.nextInt();
		
		System.out.println("Gentilmente mi può dire la sua età?");
		int age = sc.nextInt();
		
		//CHIUDO LO SCANNER
		sc.close();
		
		
		//BONUS : 2 CALCOLO UN NUOVO PREZZO
		double PriceBonus = km * 0.01;
		
		// CALCOLO IL COSTO DEL BIGLIETTO SENZA SCONTI E LO STAMPO IN CONSOLE
		double totalPrice = km * 0.21 + PriceBonus;
		
		// CREO LA CONDIZIONE PER VERIFICARE LO SCONTO
		
		if(age < 18) {
			totalPrice = totalPrice * 0.2 + PriceBonus;
			
			// BONUS 1
			if (age < 12) {
				totalPrice = 0;
			}
			
		}else if(age > 65) {
			totalPrice = totalPrice * 0.4 + PriceBonus;
		}
		
		System.out.println("il costo del tuo biglietto è di euro :");
		// STAMPO IL RISULTATO
		System.out.printf("%.2f",totalPrice);
		
	}

}
