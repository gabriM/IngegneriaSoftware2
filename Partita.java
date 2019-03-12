public class Partita extends Categoria {
	private Campo genere=new Campo("Genere","Indica se i partecipanti sono maschi o femmine",true);
	private Campo fasciaEta=new Campo("Fascia di età","Indica l'età massima e minima per partecipare all'evento",true);
	
	public Partita(){
		super("Partita di Calcio","Evento sportivo che prevede un match di 90 minuti");
	}

    public void visualizzaCampi(){
		super.visualizzaCampi();
		System.out.println(genere.visualizzaCampo());
		System.out.println(fasciaEta.visualizzaCampo());
	}
	
	
	
	// Getters and Setters generati automaticamente

	public Campo getGenere() {
		return genere;
	}

	public Campo getFasciaEta() {
		return fasciaEta;
	}

	public void setGenere(Campo genere) {
		this.genere = genere;
	}

	public void setFasciaEta(Campo fasciaEta) {
		this.fasciaEta = fasciaEta;
	}

	
	
	
}

