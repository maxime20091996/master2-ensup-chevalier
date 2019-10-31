package org.chevalier.domaine;

public class Annonce {

	private int annonceId;
	private String intitule;
	private String detail;
	private String prix;
	private Personne personne;
	public int getAnnonceId() {
		return annonceId;
	}
	public void setAnnonceId(int annonceId) {
		this.annonceId = annonceId;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	@Override
	public String toString() {
		return "Annonce [annonceId=" + annonceId + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ ", personne=" + personne + "]";
	}
	public Annonce(int annonceId, String intitule, String detail, String prix, Personne personne) {
		super();
		this.annonceId = annonceId;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
		this.personne = personne;
	}
}
