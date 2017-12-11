package com.hugosergent.assurance;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/
public class ContratAuto extends Contrat{
	
	public ContratAuto()
	{
		super();
	}
	
	public List<String> determinerGaranties()
	{
		List<String> nouvellesGaranties = new ArrayList<String>();
		nouvellesGaranties.add("Accidents");
		nouvellesGaranties.add("Bris de glace");
		nouvellesGaranties.add("Responsabilité Civile");
		
		return nouvellesGaranties;
	}
	
	public double determinerCotisation()
	{
		double cotisations=150.0;
		return cotisations;
	}
	
	public Contrat creationContrat()
	{
		ContratAuto nouveauContratAuto = new ContratAuto();
		nouveauContratAuto.determinerCotisation();
		nouveauContratAuto.determinerGaranties();
		return nouveauContratAuto;
	}

}
