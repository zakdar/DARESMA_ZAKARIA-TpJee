package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import entities.Categories;
import entities.livres;

public class CategorieDao {
	 public static List<Categories> ListeCategories(){
	    	List<Categories> categor = new ArrayList<Categories>() ;
	    	DBinterraction.connect();
	    	ResultSet res=DBinterraction.select("select * from Categorie");
	    	 try {
	    		 while(res.next()) {
	    			       Categories g=new Categories();
	    		            g.setId(res.getInt(1));
	    		            g.setNom(res.getString(2));
	    		            
				           categor.add(g);
	    		 }
			} catch (Exception e) {
				// TODO: handle exception
			}
			return categor;
	    	
	    }
}
