package com.hugosergent.assurance;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/
public class ContratPrevoyance extends Contrat{
	
	public ContratPrevoyance()
	{
		super();
	}
	
	public List<String> determinerGaranties()
	{
		List<String> nouvellesGaranties = new ArrayList<String>();
		nouvellesGaranties.add("Accidents de la vie");
		nouvellesGaranties.add("Maladie");
		nouvellesGaranties.add("Mutuelle");
		
		return nouvellesGaranties;
	}
	
	public double determinerCotisation()
	{
		double cotisations=75.0;
		return cotisations;
	}
	
	public Contrat creationContrat()
	{
		ContratPrevoyance nouveauContratPrevoyance = new ContratPrevoyance();
		nouveauContratPrevoyance.determinerCotisation();
		nouveauContratPrevoyance.determinerGaranties();
		return nouveauContratPrevoyance;
	}


}
