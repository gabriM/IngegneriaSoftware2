import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe che definisce un <i>Valore</i>.
 *
 * Un valore contiene le seguenti caratteristiche:
 * tipo;
 * testo del valore;
 * numero;
 * data;
 * verifica inserimento;
 *
 * @author Gabriele Manenti
 *
 * @version 2.0 1 Febbraio 2019
 *
 */
public class Valore {
	
	/*Attributi*/
	private int tipo;
	private String testo;
	private int numero;
	private Date giorno;
	private Boolean inserito=false;
	
	
	/*Costruttori*/
	/**
	 * Costruttore di default.
	 * Un valore e' costituito da tipo, testo, numero.
	 *
	 * @author Gabriele Manenti
	 */
	public Valore(int _tipo){
		tipo=_tipo;
	}
	
	/*Getters*/
	/**
	 * Ritorna il tipo dell'oggetto
	 * @return il tipo dell'oggetto
	 *
	 * @author Gabriele Manenti
	 */
	public int getTipo() {
		return tipo;
	}
	/**
	 * Ritorna la verifica di inserimento di un valore
	 * @return la verifica di inserimento di un valore
	 *
	 * @author Gabriele Manenti
	 */
	public Boolean getInserito() {
		return inserito;
	}
	/**
	 * Metodo che imposta il tipo di un oggetto
	 * @param tipo il tipo di un oggetto
	 *
	 * @author Gabriele Manenti
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;

	}
	/**
	 * Metodo che imposta la verifica di inserimento di un valore
	 * @param inserito la verifica di inserimento di un valore
	 *
	 * @author Gabriele Manenti
	 */
	public void setInserito(Boolean inserito) {
		this.inserito = inserito;
	}
	
	/*Metodi*/
	/**
	 * Controlla che tipo di valore è l'oggetto esaminato:
	 *
	 * @return 0 in caso di stringa
	 * @return 1 in caso di valore numerico(INT)
	 * @return 2 in caso di data
	 *
	 * @author Matteo Gusmini
	 */
	public Object getValore() {
		switch(tipo){
		case 0:
			return testo;
		case 1:
			return numero;
			
		case 2:
			return giorno;
			
		}
		return tipo;

	}
	/**
	 * Metodo preimpostato che imposta valore di default
	 *
	 * @param testo il tipo da impostare
	 *
	 *
	 * @author Gabriele Manenti
	 */
	public void setValore(String testo) {
		this.testo = testo;
		inserito=true;
	}
	/**
	 * Metodo preimpostato che imposta valore di default
	 *
	 * @param numero il tipo da impostare
	 *
	 *
	 * @author Gabriele Manenti
	 */
	public void setValore(int numero) {
		this.numero = numero;
		inserito=true;
	}
	/**
	 * Metodo preimpostato che imposta valore di default
	 *
	 * @param giorno il tipo da impostare
	 *
	 *
	 * @author Gabriele Manenti
	 */
	public void setValore(Date giorno) {
		this.giorno = giorno;
		inserito=true;
	}	

}