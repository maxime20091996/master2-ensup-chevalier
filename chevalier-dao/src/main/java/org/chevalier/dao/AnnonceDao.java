package org.chevalier.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.chevalier.domaine.Annonce;
import org.chevalier.domaine.Personne;

public class AnnonceDao implements IAnnonceDao{
	
	private String url="jdbc:mysql://localhost/boncoin";
	private String login="root";
	private String passwd="";
	private Connection cn;
	private Statement st;

	public AnnonceDao(){
		//se connecter à la bdd
		System.out.println("Annonce Dao");
		System.out.println("connection..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("erreur connection, classnotfound");
			//e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("erreur connection, sqlexception");
			//e.printStackTrace();
		}
	}
	
	@Override
	public boolean creerAnnonce(Personne personne, Annonce a) {
		System.out.println("création annonce");
		try {
			st = cn.createStatement();
			String sql = "INSERT INTO `annonce` VALUES ("+a.getAnnonceId()+",'" + a.getIntitule() + "','"
					+ a.getDetail() +"','"+a.getPrix()+"',"+a.getPersonne()+")";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("erreur sqlexception");
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public Annonce getAnnonce(int idAnnonce) {
		int annonceId = 0;
		String intitule;
		String detail;
		String prix;
		Personne personne;
		
		Annonce annonce = null;
		try {
			st = cn.createStatement();
			String sql = "Select * FROM medecin WHERE id="+annonceId+";";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				annonceId = rs.getInt("id");
				intitule = rs.getString("intitulé");
				detail = rs.getString("detail");
				prix = rs.getString("prix");
				personne = ((Personne) rs).getPersonne("personne");
				annonce = new Annonce(annonceId, intitule, detail, prix, personne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return annonce;
	}

	@Override
	public void deleteAnnonce(int idAnnonce, Annonce a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAnnonce(Personne p, Annonce a) {
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
