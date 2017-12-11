package com.hugosergent.assurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/
public class Personne {

	private Boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private List<Contrat> contratsClient;
	private List<Personne> Famille;
	
	
	public Personne(){
		estUnClient = false;
		contratsClient = new ArrayList<Contrat>();
		Famille = new ArrayList<Personne>();
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
	public List<Personne> getFamille() {
		return Famille;
	}

	public void setFamille(List<Personne> famille) {
		Famille = famille;
	}

	public boolean estClient()
	{
		return estUnClient;
	}
	
	public String obtenirNomComplet()
	{
		return nom+" "+prenom;
	}
	
	public Date obtenirDateDeNaissance()
	{
		return dateDeNaissance;
	}
	
	public Contrat creerContrat(int entier)
	{
		Contrat nouveauContrat = null;
		
	
		if(entier==1)
		{
			nouveauContrat = new ContratAuto();
		}
		else if(entier==2)
		{
			nouveauContrat = new ContratMRH();
		}
		else if(entier==3)
		{
			nouveauContrat = new ContratPrevoyance();
		}
		
		this.estUnClient = true;
		this.contratsClient.add(nouveauContrat);
		
		return nouveauContrat;
	}
	
	public void resilierContrat(Contrat aResilier)
	{
		aResilier.contratValide=false;
		List<Contrat> contratsClient = this.obtenirContrats();
		boolean estToujoursClient =false;
		for(Contrat c : contratsClient)
		{
			if(c.contratValide==true)
			{
				estToujoursClient=true;
			}
		}
		
		if(estToujoursClient == false)
		{
			this.estUnClient=false;
		}
		
	}
	
	public void resilierContrat(String aResilier)
	{
		List<Contrat> contratsClient = this.obtenirContrats();
		boolean estToujoursClient =false;
		for(Contrat c : contratsClient)
		{
			if(c.numeroContrat.equals(aResilier))
			{
				c.contratValide=false;
			}
		}
		
		for(Contrat c :contratsClient)
		{
			if(c.contratValide==true)
			{
				estToujoursClient=true;
			}
		}
		
		if(estToujoursClient == false)
		{
			this.estUnClient=false;
		}
		
	}
	
	public List<Contrat> obtenirContrats()
	{
		return this.contratsClient;
	}
	
	@SuppressWarnings("null")
	public List<Contrat> obtenirContratsAuto()
	{
		List<Contrat> contratsClient = this.obtenirContrats();
		List<Contrat> contratsAutoCLient = null;
		for(Contrat c : contratsClient)
		{
			if(c instanceof ContratAuto)
			{
				contratsAutoCLient.add(c);
			}
		}
		return contratsAutoCLient;
	}
	
	@SuppressWarnings("null")
	public List<Contrat> obtenirContratsMRH()
	{
		List<Contrat> contratsClient = this.obtenirContrats();
		List<Contrat> contratsMRHCLient = null;
		for(Contrat c : contratsClient)
		{
			if(c instanceof ContratMRH)
			{
				contratsMRHCLient.add(c);
			}
		}
		return contratsMRHCLient;
	}
	
	@SuppressWarnings("null")
	public List<Contrat> obtenirContratsPrevoyance()
	{
		List<Contrat> contratsClient = this.obtenirContrats();
		List<Contrat> contratsPrevoyanceCLient = null;
		for(Contrat c : contratsClient)
		{
			if(c instanceof ContratPrevoyance)
			{
				contratsPrevoyanceCLient.add(c);
			}
		}
		return contratsPrevoyanceCLient;
	}
	
	
	public String toString()
	{
		return "Identité: "+this.obtenirNomComplet()+", est client: "+this.estClient();
	}
	
	
}
