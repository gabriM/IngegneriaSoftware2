import java.util.ArrayList;
import java.util.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import MyLib.*;

/**
 * Classe che definisce un <i>Evento</i>.
 *
 * Un evento contiene le seguenti caratteristiche:
 * categoria;
 * validità;
 * creatore;
 * elenco utenti iscritti;
 * stato.
 *
 * @author Matteo Gusmini
 *
 * @version 2.0 1 Febbraio 2019
 *
 */
public class Evento {
	
	/*Attributi*/
	private Categoria categoria;
	private Boolean validita= false;
	private String creatore;
	
	
	/*Costruttori*/
	public Evento(Categoria _categoria, String _creatore){
		categoria= _categoria;
		creatore=_creatore;
	}
	
	/*Getters*/
	/**
	 * Ritorna la categoria dell'evento
	 * @return categoria dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * Ritorna la validità dell'evento
	 * @return validita dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public Boolean getvalidita() {
		return validita;
	}
	/**
	 * Ritorna il creatore dell'evento
	 * @return creatore dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public String getCreatore() {
		return creatore;
	}
	
	/*Setters*/
	/**
	 * Metodo che imposta la categoria dell'evento
	 * @param categoria dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * Metodo che imposta la validità dell'evento
	 * @param validita validità dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public void setvalidita(Boolean validita) {
		this.validita = validita;
	}
	/**
	 * Metodo che imposta il creatore dell'evento
	 * @param creatore il creatore dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public void setCreatore(String creatore) {
		this.creatore = creatore;
	}
	/*Metodi*/
	/**
	 * Verifica che tutti i campi obbligatori abbiano inserito un valore
	 *
	 * @author Matteo Gusmini
	 */
	public void isValido(){
		validita=true;
		
		for (int i=0; i<categoria.getElencoCampi().size(); i++){
			if(categoria.getElencoCampi().get(i).getObbligatorio()&& !categoria.getElencoCampi().get(i).getValore().getInserito()){
				validita=false;
			}
		}
		
	}
	/**
	 * Assegna i valori a campi dell'evento
	 *
	 * @author Matteo Gusmini
	 */
	public void inserisciDettagliEvento()throws Exception{
		categoria.inserisciCampi();
	}

}