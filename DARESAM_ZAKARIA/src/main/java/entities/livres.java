package entities;

import java.util.List;

public class livres {
	
		int id;
		String titre;
		String auteur;
	    String description;
	    
	                  /*-----------CONSTRUCTEUR------------*/
	    
	    public livres() {
			
		}
	    
	                  /*-----------GETTERS / SETTERS------------*/
	    
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getTitre() {
				return titre;
			}
			public void setTitre(String titre) {
				this.titre = titre;
			}
			public String getAuteur() {
				return auteur;
			}
			public String setAuteur(String auteur) {
				return this.auteur = auteur;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}

			@Override
			public String toString() {
				return "livres [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", description=" + description
						+ "]";
			}

			
	

}
