package com.hugosergent.assurance;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/
public class ContratMRH extends Contrat{
	
	public ContratMRH()
	{
		super();
	}
	
	public List<String> determinerGaranties()
	{
		List<String> nouvellesGaranties = new ArrayList<String>();
		nouvellesGaranties.add("Icendies");
		nouvellesGaranties.add("Vitres");
		nouvellesGaranties.add("Inondations");
		nouvellesGaranties.add("Responsabilité Civile");
		
		return nouvellesGaranties;
	}
	
	public double determinerCotisation()
	{
		double cotisations=100.0;
		return cotisations;
	}
	
	public Contrat creationContrat()
	{
		ContratMRH nouveauContratMRH = new ContratMRH();
		nouveauContratMRH.determinerCotisation();
		nouveauContratMRH.determinerGaranties();
		return nouveauContratMRH;
	}

}
