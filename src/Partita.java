import java.util.ArrayList;
import java.util.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import MyLib.*;


/**
 * La classe Partita estende la classe Categoria per poter creare oggetti Partita.
 *
 * In particolare definisce:
 *
 * genere, indica se i partecipanti sono maschi o femmine;
 * fasciaEta, indica l'età massima e minima per partecipare all'evento;
 *
 *
 * @author Matteo Gusmini
 *
 * @version 2.0 1 Febbraio 2019
 */
public class Partita extends Categoria {

	/*Attributi*/
	private Campo genere=new Campo("Genere","Indica se i partecipanti sono maschi o femmine",true,STRING);
	private Campo fasciaEta=new Campo("Fascia di età","Indica l'età massima e minima per partecipare all'evento",true,STRING);
	private ArrayList<Campo> elencoCampi = new ArrayList<>();
	
	/**
	 * Costruttore di default.
	 * Una partita e' costituita da nome e descizione.
	 *
	 * @author Matteo Gusmini
	 */
	public Partita(){
		super("Partita di Calcio","Evento sportivo che prevede un match di 90 minuti");
		elencoCampi.add(genere);
		elencoCampi.add(fasciaEta);
	}

	/*Getters*/
	/**
	 * Ritorna il genere dei partecipanti dell'evento
	 * @return il genere dei partecipanti dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public Campo getGenere() {
		return genere;
	}
	/**
	 * Ritorna la fascia di età dei partecipanti
	 * @return la fascia di età dei partecipanti
	 *
	 * @author Matteo Gusmini
	 */
	public Campo getFasciaEta() {
		return fasciaEta;
	}

	/*Setters*/
	/**
	 * Permette di cambiare il genere dei partecipanti dell'evento
	 * @param genere il genere dei partecipanti dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public void setGenere(Campo genere) {
		this.genere = genere;
	}
	/**
	 * Permette di cambiare la fascia di età dei partecipanti
	 * @param fasciaEta la fascia di età dei partecipanti
	 *
	 * @author Matteo Gusmini
	 */
	public void setFasciaEta(Campo fasciaEta) {
		this.fasciaEta = fasciaEta;
	}
	
	/*Metodi*/
	/**
	 * Ritorna una stringa che descrive tutti i campi della categoria Partita
	 *
	 * @return tutti i campi della categoria partita
	 *
	 * @author Matteo Gusmini
	 */
	public void visualizzaCampi(){
		super.visualizzaCampi();
		for (int i=0; i< elencoCampi.size(); i++){
			
			System.out.println(elencoCampi.get(i).visualizzaCampo());
		}
	}
	/**
	 * Assegna i valori ai campi di partita
	 *
	 * @author Matteo Gusmini
	 */
    public void inserisciCampi()throws Exception{
    	super.inserisciCampi();
    	for (int i=0; i< elencoCampi.size(); i++){
			elencoCampi.get(i).inserisciValore();
			
		}
	}

	
	
	
}
