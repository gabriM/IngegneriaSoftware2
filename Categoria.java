import java.util.ArrayList;

import fp.unibs.it.Brano;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyTime;

import java.util.ArrayList;


public class Categoria {
	
	//Costanti
	private String nome;
	private String descrizione;
	private Campo titolo=new Campo("Titolo","Consiste in un nome di fantasia attribuito all’evento",false);
	private Campo nPartecipanti=new Campo("Numero di partecipanti"," Stabilisce il numero di persone da coinvolgere nell’evento",true);
	private Campo termineIscrizione=new Campo("Termine ultimo iscrizione","Indica l'ultimo giorno utile per iscriversi all’evento",true);
	private Campo luogo=new Campo("Luogo","Indica l'indirizzo in cui si svolgerà l’evento oppure il punto di ritrovo",true);
	private Campo ora=new Campo("Ora","Indica l'ora in cui i partecipanti dovranno recarisi nel luogo prestabilito",true);
	private Campo durata=new Campo("Durata","Indica la durata in termini di numero(approssimativo)di ore e minuti, per gli eventi che si esauriscono in un sol giorno, o in termini di numero esatto di giorni, per gli eventi che occupano più giorni consecutivi",false);
	private Campo quotaIndividuale=new Campo("Quota individuale"," indica la spesa (o una stima della stessa) che ogni partecipante all’iniziativa dovrà sostenere (si noti che la spesa può anche essere nulla)",true);
	private Campo compresoQuota=new Campo("Compreso nella quota"," indica tutte le voci di spesa comprese nell’ammontare indicato nella “Quota individuale”",false);
	private Campo dataFine=new Campo("Data conclusiva"," Indica la data di fine dell’evento",false);
	private Campo oraFine=new Campo("Ora conclusiva"," Indica l'ora di fine dell’evento",false);
	private Campo note=new Campo("Note"," Contiene informazioni aggiuntive circa l'evento",false);

	//Costruttori
	public Categoria(String _nome, String _descrizione){
		nome=_nome;
		descrizione= _descrizione;
	}

	//Metodi
	public void visualizzaCampi(){
		System.out.println(titolo.visualizzaCampo());
		System.out.println(nPartecipanti.visualizzaCampo());
		System.out.println(termineIscrizione.visualizzaCampo());
		System.out.println(luogo.visualizzaCampo());
		System.out.println(ora.visualizzaCampo());
		System.out.println(durata.visualizzaCampo());
		System.out.println(quotaIndividuale.visualizzaCampo());
		System.out.println(compresoQuota.visualizzaCampo());
		System.out.println(dataFine.visualizzaCampo());
		System.out.println(oraFine.visualizzaCampo());
		System.out.println(note.visualizzaCampo());
	}
	
	// Getters and Setters generati automaticamente
	public String getNome() {
		return nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public Campo getTitolo() {
		return titolo;
	}


	public Campo getnPartecipanti() {
		return nPartecipanti;
	}


	public Campo getTermineIscrizione() {
		return termineIscrizione;
	}


	public Campo getLuogo() {
		return luogo;
	}


	public Campo getOra() {
		return ora;
	}


	public Campo getDurata() {
		return durata;
	}


	public Campo getQuotaIndividuale() {
		return quotaIndividuale;
	}


	public Campo getCompresoQuota() {
		return compresoQuota;
	}


	public Campo getDataFine() {
		return dataFine;
	}


	public Campo getOraFine() {
		return oraFine;
	}


	public Campo getNote() {
		return note;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public void setTitolo(Campo titolo) {
		this.titolo = titolo;
	}


	public void setnPartecipanti(Campo nPartecipanti) {
		this.nPartecipanti = nPartecipanti;
	}


	public void setTermineIscrizione(Campo termineIscrizione) {
		this.termineIscrizione = termineIscrizione;
	}


	public void setLuogo(Campo luogo) {
		this.luogo = luogo;
	}


	public void setOra(Campo ora) {
		this.ora = ora;
	}


	public void setDurata(Campo durata) {
		this.durata = durata;
	}


	public void setQuotaIndividuale(Campo quotaIndividuale) {
		this.quotaIndividuale = quotaIndividuale;
	}


	public void setCompresoQuota(Campo compresoQuota) {
		this.compresoQuota = compresoQuota;
	}


	public void setDataFine(Campo dataFine) {
		this.dataFine = dataFine;
	}


	public void setOraFine(Campo oraFine) {
		this.oraFine = oraFine;
	}


	public void setNote(Campo note) {
		this.note = note;
	}

	
	
}
