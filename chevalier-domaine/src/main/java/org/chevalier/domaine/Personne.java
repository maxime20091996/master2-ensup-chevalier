package org.chevalier.domaine;

import java.util.ArrayList;

public class Personne {

	private int personneId;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private String dateNaissance;
	
	ArrayList<Annonce> annonce = new ArrayList<Annonce>();

	public Personne(int personneId, String nom, String prenom, String login, String motDePasse,
			String dateNaissance) {
		// TODO Auto-generated constructor stub
	}

	public int getPersonneId() {
		return personneId;
	}

	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public ArrayList<Annonce> getAnnonce() {
		return annonce;
	}

	public void setAnnonce(ArrayList<Annonce> annonce) {
		this.annonce = annonce;
	}

	@Override
	public String toString() {
		return "Personne [personneId=" + personneId + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDePasse=" + motDePasse + ", dateNaissance=" + dateNaissance + ", annonce=" + annonce + "]";
	}

	public Personne getPersonne(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
