package dao;



import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import entities.Etudiants;
import entities.livres;

public class livresDao {
   
	   /*-----------------méthode de getlivrers-----------------*/
	  public livres getlivres(int id) {
		    livres liv=new livres();
		    DBinterraction.connect();
		    ResultSet res = DBinterraction.select("select * from oeuvrages where id= "+id);
		     try {
		    	 if (res.next()) {
		    		 liv.setId(res.getInt(1));
		    		 liv.setAuteur(res.getString(2));
		    		 liv.setTitre(res.getString(3));
		    		 liv.setDescription(res.getString(4));
		    		 
		    	 }
				
			} catch (Exception e) {
				
				
			}
		     DBinterraction.disconnect();
		        return liv;
		    
	  }
	  public List<livres> getlivresBycategorie(int id){
		  List<livres> livlis = new ArrayList<livres>() ;
	    	DBinterraction.connect();
	    	ResultSet res=DBinterraction.select("select * from oeuvrages where id_categorie="+id);
	    	 try {
	    		 while(res.next()) {
	    			        livres l=new livres();
	    		            l.setId(res.getInt(1));
	    		            l.setAuteur(res.getString(2));
	    		            l.setTitre(res.getString(3));
	    		            l.setDescription(res.getString(4));
	    		 
				        livlis.add(l);
	    		 }
			} catch (Exception e) {
				// TODO: handle exception
			}
			return livlis;
	  }
	    public List<livres> Listelivres(){
	    	List<livres> livlis = new ArrayList<livres>() ;
	    	DBinterraction.connect();
	    	ResultSet res=DBinterraction.select("select * from oeuvrages");
	    	 try {
	    		 while(res.next()) {
	    			        livres l=new livres();
	    		            l.setId(res.getInt(1));
	    		            l.setAuteur(res.getString(2));
	    		            l.setTitre(res.getString(3));
	    		            l.setDescription(res.getString(4));
	    		 
				        livlis.add(l);
	    		 }
			} catch (Exception e) {
				// TODO: handle exception
			}
			return livlis;
	    	
	    }
	    public static void AjouterLivres(livres ara) {
	    	
	    	DBinterraction.connect();
	    	String sql="INSERT INTO `oeuvrages` (`auteur`, `titre`, `description`, `id_categorie`)"
	    			+ " VALUES ('"+ara.getAuteur()+"','"+ara.getTitre()+"','"+ara.getDescription()+"', 3 )";
	    	DBinterraction.misajour(sql);
	    	DBinterraction.disconnect();
	    }
	    public void SupprimerLivres(int id) {
	    	DBinterraction.connect();
	    	String sql=("delete from oeuvrages where id="+id);
	    	DBinterraction.misajour(sql);
	    	DBinterraction.disconnect();
	    	
	    }
	    
	    public static void reservation(int id, int id_livre) {
	    	DBinterraction.connect();
	    	String sql="INSERT INTO `reservation` (`id_etudiant`, `id_livre`)"
	    			+ " VALUES ("+id+","+id_livre+")";
	    	DBinterraction.misajour(sql);
	    	DBinterraction.disconnect();
	    }
	    
	    public void ModifierLivres( livres amr) {
			DBinterraction.connect();
			String sql="UPDATE `oeuvrages`"
					+ "SET  auteur = '"+amr.getAuteur()+"', titre ='"+amr.getTitre()+"' , description = '"+amr.getDescription()+"'"
					+ " WHERE id ="+amr.getId();
			DBinterraction.misajour(sql);
			DBinterraction.disconnect();
		}
	    
	    
	
}
