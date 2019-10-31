package org.chevalier.service;

import java.util.List;

import org.chevalier.domaine.Personne;

public interface IPersonneService {

	//Crud Personne
		 public boolean creerPersonne(Personne personne);
		 public Personne getPersonne(int idPersonne);
		 public void deletePersonne(int idPersonne);
		 public void updatePersonne(Personne p);
		 public List<Personne> findAllPersonnes();
		 public int getPersonneId(Personne p);
}