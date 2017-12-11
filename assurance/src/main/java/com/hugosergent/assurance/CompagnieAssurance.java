package com.hugosergent.assurance;

import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/

public class CompagnieAssurance {

	private String nom;
	List<Personne> listeClients;
	

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
	
	public int obtenirNimbreDeProspects()
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
	
}
