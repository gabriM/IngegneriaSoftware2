import java.util.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import MyLib.Utility;
/**
 * Classe che definisce un <i>Campo</i>.
 *
 * Un campo possiede le seguenti caratterisitiche:
 * nome;
 * descrizione;
 * obbligatoriet� del campo;
 * valore del campo.
 *
 * @author Matteo Gusmini
 *
 * @version 2.0 1 Febbraio 2019
 *
 */
public class Campo {
	
	/*Attributi*/
	private String nome;
	private String descrizione;
	private Boolean obbligatorio;
	private Valore valore;
	
	/*Costruttori*/
	/**
	 * Un campo e' costituito da nome, descrizione, obbligatoriet� e valore riguardante una caratteristica di un evento:
	 *
	 * @param _nome nome del campo
	 * @param _descrizione descrizione del campo
	 * @param _obbligatorio obbligatoriet� del campo
	 * @param _valore tipologia del campo
	 *
	 * @author Matteo Gusmini
	 */
	public Campo(String _nome, String _descrizione, Boolean _obbligatorio,int _valore){
		nome=_nome;
		descrizione= _descrizione;
		obbligatorio = _obbligatorio;
		valore= new Valore(_valore);
	}

	/*Getters*/
	/**
	 * Ritorna il nome del Campo
	 * @return nome del campo
	 *
	 * @author Matteo Gusmini
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Ritorna la descrizione del Campo
	 * @return descrizione del campo
	 *
	 * @author Matteo Gusmini
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * Ritorna l'obbligatoriet� del Campo
	 * @return se un campo � obbligatorio o meno
	 *
	 * @author Matteo Gusmini
	 */
	public Boolean getObbligatorio() {
		return obbligatorio;
	}
	/**
	 * Ritorna il valore del Campo
	 * @return valore del campo
	 *
	 * @author Gabriele Manenti
	 */
	public Valore getValore() {
		return valore;
	}
	
	/*Setters*/
	/**
	 * Metodo che imposta il nome del Campo.
	 *
	 * @param nome il nome del campo
	 *
	 * @author Matteo Gusmini
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Metodo che imposta la descrizione del Campo.
	 *
	 * @param descrizione la descrizione del campo
	 *
	 * @author Matteo Gusmini
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * Metodo che imposta l'obbligatoriet� di un Campo.
	 *
	 * @param obbligatorio l'obbligatoriet� del campo
	 *
	 * @author Matteo Gusmini
	 */
	public void setObbligatorio(Boolean obbligatorio) {
		this.obbligatorio = obbligatorio;
	}
	/**
	 * Metodo che imposta il valore di un Campo.
	 *
	 * @param valore il valore del campo
	 *
	 * @author Gabriele Manenti
	 */
	public void setValore(Valore valore) {
		this.valore = valore;
	}

	/*Metodi*/
	/**
	 * Ritorna una stringa che descrive il campo
	 *
	 * @return info le informazioni relative ad un campo
	 *
	 * @author Matteo Gusmini
	 */
	public String visualizzaCampo(){
		String info= new String("Nome: "+ nome +"\n" +"Descrizione: " + descrizione+ "\n"+ "Obbligatoria: " + obbligatorio +"\n");
		return info;
	}
	/**
	 * Assegna un valore al campo inserito
	 *
	 * @author Gabriele Manenti
	 */
	public void inserisciValore()throws Exception{
		
		if (!valore.getInserito()){
		
			if(!valore.getInserito()){
				int inserimento= Utility.leggiIntero(0,1, "Vuoi inserire "+ nome+ "? Digita 1 per SI e 0 pre NO");
				if(inserimento==0){
			
				}
				else{
					switch(valore.getTipo()){
					case 0:
						valore.setValore(Utility.leggiLinea("inserisci "+ nome));
						break;
					case 1:
						valore.setValore(Utility.leggiIntero(0, 9999999, "inserisci "+ nome));
						break;
					case 2: 
						String data=Utility.leggiData("inserisci "+ nome+ "(gg/mm/aaaa)");
						Date date=new SimpleDateFormat("dd/MM/yyyy").parse(data);
						valore.setValore(date);
						break;
					case 3:
						String ora= Utility.leggiOra("Inserisci " + nome + " (hh:mm)");
						valore.setValore(ora);
						break;
					}
				}
			}
		}
	}
}
