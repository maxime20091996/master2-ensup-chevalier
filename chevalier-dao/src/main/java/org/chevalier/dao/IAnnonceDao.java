package org.chevalier.dao;

import java.util.List;

import org.chevalier.domaine.Annonce;
import org.chevalier.domaine.Personne;

public interface IAnnonceDao {

	//Crud Annonce
		 public boolean creerAnnonce(Personne personne, Annonce a);
		 public Annonce getAnnonce(int idAnnonce);
		 public void deleteAnnonce(int idAnnonce,Annonce a);
		 public void updateAnnonce(Personne p, Annonce a);
		 public List<Annonce> findAllAnnonce();
		 public int getAnnonceId(Annonce a);
}
