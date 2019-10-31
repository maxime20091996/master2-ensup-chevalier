package org.chevalier.service;

import java.util.List;

import org.chevalier.dao.IPersonneDao;
import org.chevalier.domaine.Personne;

public class PersonneService implements IPersonneService{

	private Personne personne;
	private IPersonneDao iPersonne;
	
	public PersonneService(Personne iPersonne) {
		this.personne = personne;
	}
	
	public PersonneService(IPersonneDao iPersonne) {
		super();
		this.iPersonne = iPersonne;
	}
	
	@Override
	public boolean creerPersonne(Personne personne) {
		iPersonne.creerPersonne(personne);
		return true;
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		return iPersonne.getPersonne(idPersonne);
	}

	@Override
	public void deletePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPersonneId(Personne p) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
