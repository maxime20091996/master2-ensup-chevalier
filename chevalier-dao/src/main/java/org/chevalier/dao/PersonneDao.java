package org.chevalier.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.chevalier.domaine.Personne;

public class PersonneDao implements IPersonneDao {

	private String url="jdbc:mysql://localhost/boncoin";
	private String login="root";
	private String passwd="";
	private Connection cn;
	private Statement st;
	
	public PersonneDao(){
		//se connecter à la bdd
		System.out.println("Personne Dao");
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
	public boolean creerPersonne(Personne personne) {
		System.out.println("création personne");
		try {
			st = cn.createStatement();
			String sql = "INSERT INTO `personne` VALUES ("+personne.getPersonneId()+",'" + personne.getNom() + "','"
					+ personne.getPrenom() +"','"+personne.getLogin()+"','"+personne.getMotDePasse()+"','"+personne.getDateNaissance()+"','" +personne.getAnnonce()+"')";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("erreur sqlexception");
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		int personneId = 0;
		String nom;
		String prenom;
		String login;
		String motDePasse;
		String dateNaissance;
		
		Personne personne = null;
		try {
			st = cn.createStatement();
			String sql = "Select * FROM medecin WHERE id="+personneId+";";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				personneId = rs.getInt("id");
				nom = rs.getString("nom");
				prenom = rs.getString("prenom");
				login = rs.getString("login");
				motDePasse = rs.getString("mot de passe");
				dateNaissance = rs.getString("Date de naissance");
				personne = new Personne(personneId, nom, prenom, login, motDePasse, dateNaissance);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personne;
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
