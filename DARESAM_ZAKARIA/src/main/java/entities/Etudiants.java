package entities;

public class Etudiants {
	
		int id;
		String nom;
		String prenom;
		String email;
		String password;
		
		
		
		        /*-----------CONSTRUCTEUR------------*/
		
		
		public Etudiants() {
				
		}     
		        /*-----------GETTERS / SETTERS------------*/
		
		
			public String getPassword() {
				return password;
			}
	
			public void setPassword(String password) {
				this.password = password;
			}

		
			public int getId() {
				return id;
			}
		
			public void setId(int id) {
				this.id = id;
			}
		
			public String getNom() {
				return nom;
			}
		
			public void setNom(String nom) {
				this.nom = nom;
			}
		

				@Override
				public String toString() {
					return "Etudiants [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
							+ ", password=" + password + "]";
				}


			public String getPrenom() {
				return prenom;
			}
		
			public void setPrenom(String prenom) {
				this.prenom = prenom;
			}
		
			public String getEmail() {
				return email;
			}
		
			public void setEmail(String email) {
				this.email = email;
			}

	

}
