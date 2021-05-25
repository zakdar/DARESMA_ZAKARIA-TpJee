package project_ben_lhmar;

import java.util.List;

import dao.EtudiantDao;
import dao.livresDao;
import entities.Etudiants;
import entities.livres;

public class main {

	public static void main(String[] args) {

	/*	EtudiantDao dea=new EtudiantDao();
		List<Etudiants> lis = dea.getListEtudiant();
		lis.forEach(System.out::println);
		*/
				/*  livresDao var =new livresDao();
			      List<livres>  list = var.Listelivres();
			      list.forEach(System.out::println);*/
		
			/*livresDao dea=new livresDao();
			livres lv = new livres();
			lv.setAuteur("Soufiane");
			lv.setTitre("hahaha");
			lv.setDescription("hday");
			dea.AjouterLivres(lv);*/
		
				/*livresDao a=new livresDao();
				a.SupprimerLivres(2);*/
		
		/*EtudiantDao aa = new EtudiantDao();
		      Etudiants l= aa.getEtudiant(5);
		      l.setNom("zaki");
		      l.setPrenom("3azi");
		      l.setEmail("koko");
		      l.setPassword("eeeeeee");
		      aa.ModifierEtudiant(l);*/
		  	
				livresDao aa = new livresDao();
				      livres l= aa.getlivres(1);
				      l.setAuteur("zaki");
				      l.setDescription("ggggggggggggg");
				      l.setTitre("kouiu");
				      aa.ModifierLivres(l);
		
	}
     
}
