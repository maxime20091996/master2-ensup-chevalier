package org.chevalier.service;

import java.util.List;

import org.chevalier.domaine.Annonce;
import org.chevalier.domaine.Personne;

public interface IAnnonceService {

	 //Crud Annonce
	 public boolean creerAnnonce(Personne personne, Annonce a);
	 public Annonce getAnnonce(int idAnnonce);
	 public void deleteAnnonce(int idAnnonce);
	 public void updateAnnonce(Annonce a);
	 public List<Annonce> findAllAnnonce();
	 public int getAnnonceId(Annonce a);
}
