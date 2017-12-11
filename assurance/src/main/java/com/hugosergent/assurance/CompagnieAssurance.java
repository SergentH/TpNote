package com.hugosergent.assurance;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/

public class CompagnieAssurance {

	private String nom;
	List<Personne> listeClients;
	

	public CompagnieAssurance() {
		listeClients = new ArrayList<Personne>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void AjouterClient(Personne client)
	{
		this.listeClients.add(client);
	}
	
	public int obtenirNombreDeClients()
	{
		int nombreClients=0;
		for(Personne p : listeClients)
		{
			if(p.estClient()==true)
			{
			   nombreClients++;
			}
		}
		return nombreClients;
	}
	
	public int obtenirNombreDeProspects()
	{
		int nombreProspects=0;
		for(Personne p : listeClients)
		{
			if(p.estClient()==false)
			{
				nombreProspects++;
			}
		}
		return nombreProspects;
	}
	
	
	public int obtenirNombreDeContrats()
	{
		int nombreDeContrats =0;
		
		
		for(Personne p : listeClients)
		{
			List<Contrat> liste = p.obtenirContrats();
			for(Contrat c : liste)
			{
				if(c.contratValide == true)
				{
					nombreDeContrats++;
				}
			}
		}
		
		return nombreDeContrats;
	}
	
	public Personne obtenirPlusGrosClient()
	{
		Personne LaBaleine=null;
		boolean premierPassage = true;
		int entier;
		ComparateurClient comparerLesClients = new ComparateurClient();
		List<Personne> listeClients = this.listeClients;
		for(Personne p : listeClients)
		{
			if(premierPassage == true)
			{
				LaBaleine = p;
				premierPassage = false;
			}
			else
			{
				if( p.estClient())
				{
					entier = comparerLesClients.compare(LaBaleine, p);
					
					if(entier<0)
					{
						LaBaleine = p;
					}
				}
			}
			
		}
		
		return LaBaleine;
		
	}
	
}
