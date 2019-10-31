package org.chevalier.service;

import java.util.List;

import org.chevalier.dao.IAnnonceDao;
import org.chevalier.dao.IPersonneDao;
import org.chevalier.domaine.Annonce;
import org.chevalier.domaine.Personne;

public class AnnonceService implements IAnnonceService {

	private Annonce annonce;
	private IAnnonceDao iAnnonce;
	
	public AnnonceService(Annonce iAnnonce) {
		this.annonce = annonce;
	}
	
	public AnnonceService(IAnnonceDao iAnnonce) {
		super();
		this.iAnnonce = iAnnonce;
	}
	
	@Override
	public boolean creerAnnonce(Personne personne, Annonce a) {
		iAnnonce.creerAnnonce(personne, a);
		return true;
	}

	@Override
	public Annonce getAnnonce(int idAnnonce) {
		return iAnnonce.getAnnonce(idAnnonce);
	}

	@Override
	public void deleteAnnonce(int idAnnonce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAnnonce(Annonce a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Annonce> findAllAnnonce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAnnonceId(Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
