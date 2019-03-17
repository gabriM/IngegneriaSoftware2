import java.io.Serializable;
import java.util.ArrayList;

public class Utente implements Serializable{

	/*Attributi*/
	private String nomeUtente;
	private ArrayList<Evento> eventiUtente = new ArrayList<>();
	private ArrayList<Messaggio> messaggiUtente = new ArrayList<>();
		
	/*Costruttori*/
	/**
	 * Un utente e' costituito da nome, elenco eventi e elenco messaggi:
	 *
	 * @param _nomeUtente il nome dell'utente
	 *
	 * @author Matteo Gusmini
	 */
	public Utente(String _nomeUtente)
	{
		nomeUtente=_nomeUtente;
	}
	
	/*Getters*/
	/**
	 * Ritorna il nome dell'utente
	 * @return il nome dell'utente
	 *
	 * @author Matteo Gusmini
	 */
	public String getNomeUtente() {
		return nomeUtente;
	}
	/**
	 * Ritorna un ArrayList degli eventi correlati all'utente
	 * @return ArrayList degli eventi correlati all'utente
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Evento> getEventiUtente() {
		return eventiUtente;
	}
	/**
	 * Ritorna un ArrayList dei messaggi correlati all'utente
	 * @return ArrayList dei messaggi correlati all'utente
	 *
	 * @author Matteo Gusmini
	 */
	public ArrayList<Messaggio> getMessaggiUtente() {
		return messaggiUtente;
	}
	
	/*Setters*/
	/**
	 * Metodo che imposta il nome dell'utente
	 * @param nomeUtente il nome dell'utente
	 *
	 * @author Matteo Gusmini
	 */
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	/**
	 * Permette di cambiare l'elenco degli eventi associati all'utente
	 * @param eventiUtente il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setEventiUtente(ArrayList<Evento> eventiUtente) {
		this.eventiUtente = eventiUtente;
	}
	/**
	 * Permette di cambiare l'elenco dei messaggi associati all'utente
	 * @param messaggiUtente il nuovo elenco
	 *
	 * @author Matteo Gusmini
	 */
	public void setMessaggiUtente(ArrayList<Messaggio> messaggiUtente) {
		this.messaggiUtente = messaggiUtente;
	}

}
