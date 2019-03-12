import java.util.ArrayList;

import MyLib.Menù;
import MyLib.Utility;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Costanti che contengono i messaggi da visualizzare in Output

		final String MSGBENVENUTO="Benvenuto nella social di gestione eventi";
		final String NOMEMENU="GESTIONE Eventi";
		final String[] OPZIONI={"Visualizza Categorie Disponibili"};
		final String NOME="Nome categoria: ";
		final String DESCRIZIONE="Descrizione: ";
		final String SCELTACATEGORIA="Quale categoria vuoi vedere in dettaglio?";
			
		
		System.out.println(MSGBENVENUTO);

		ArrayList<Categoria> categorie=new ArrayList<>();
		Partita partita= new Partita();
		categorie.add(partita);
		
		
		Menù myMenu= new Menù(NOMEMENU,OPZIONI);
		int scelta;
		
		
		do{
			scelta=myMenu.scegli();
			switch(scelta)
			{
			case 0:
				break;
			
			case 1:
				// Visualizza categorie
				
				for(int i=0; i<categorie.size();i++){
					System.out.println(i+1+")");
					System.out.println(NOME + categorie.get(i).getNome());
					System.out.println(DESCRIZIONE + categorie.get(i).getDescrizione()+"\n");
				}
				int numCat=Utility.leggiIntero(1, categorie.size()+1, SCELTACATEGORIA);
				categorie.get(numCat-1).visualizzaCampi();
				
				
				break;
			}
		}while(scelta!=0);
		
	}

}
