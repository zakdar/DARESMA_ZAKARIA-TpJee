package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Etudiants;

public class EtudiantDao {
	
	                  /*----------------méthode de get etudiant---------------------*/
	
	public Etudiants getEtudiant(int id){
		Etudiants et = null;
		DBinterraction.connect();
		ResultSet res = DBinterraction.select("select *from etudiant where id="+id);
		
		try {
			  if(res.next()) {
				et = new Etudiants();
				et.setId(res.getInt(1));
				et.setNom(res.getString(2));
				et.setPrenom(res.getString(3));
				et.setEmail(res.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBinterraction.disconnect();
		return et;
	}
	
	            /*-------------------méthode de get list des etudiants------------------*/
	
	public List<Etudiants> getListEtudiant(){
		List<Etudiants> Liste =  new ArrayList<Etudiants>();
		DBinterraction.connect();
		ResultSet res = DBinterraction.select("select *from etudiant");
		try {
			while(res.next()) {
				Etudiants et  = new Etudiants();
				et.setId(res.getInt(1));
				et.setNom(res.getString(2));
				et.setPrenom(res.getString(3));
				et.setEmail(res.getString(4));
				et.setPassword(res.getString(5));
				Liste.add(et);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBinterraction.disconnect();
		return Liste;
	}
	public static void AjouterEtudiant(Etudiants jib) {
		DBinterraction.connect();
		String sql="INSERT INTO `etudiant` ( `nom`, `prenom`, `email`, `password`)" 
				+ "VALUES('"+jib.getNom()+"','"+jib.getPrenom()+"','"+jib.getEmail()+"','"+jib.getPassword()+"')";
		DBinterraction.misajour(sql);		
		DBinterraction.disconnect();
		
	}
	
	public void SupprimerEtudiant(int id) {
		        DBinterraction.connect();
		String sql=("delete from etudiant where id="+id);
		
		DBinterraction.misajour(sql);	
		
		DBinterraction.disconnect();
		
	}
	public void ModifierEtudiant( Etudiants amr) {
		
		DBinterraction.connect();
		String sql="UPDATE `etudiant`"
				+ "SET  nom = '"+amr.getNom()+"', prenom ='"+amr.getNom()+"' , email= '"+amr.getEmail()+"', password='"+amr.getPassword()+"'"
				+ " WHERE id ="+amr.getId();
		DBinterraction.misajour(sql);
		DBinterraction.disconnect();
	}
	
	public static Etudiants Authentification(String email,String pass) {
		Etudiants et = null;
		DBinterraction.connect();
		ResultSet res = DBinterraction.select("select *from etudiant where email= '"+email+"' and password='"+pass+"';");
		
		try {
			  if(res.next()) {
				et = new Etudiants();
				et.setId(res.getInt(1));
				et.setNom(res.getString(2));
				et.setPrenom(res.getString(3));
				et.setEmail(res.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBinterraction.disconnect();
		return et;
	}
	
}
