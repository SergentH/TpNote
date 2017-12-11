package com.hugosergent.assurance;

import java.util.List;

/**
*
* @author Hugo SERGENT 4A Info
*/
public abstract class Contrat {


	static int base_clef=0;
	protected final String numeroContrat;
	protected Boolean contratValide;
	
	
	public Contrat()
	{
		numeroContrat=String.valueOf(base_clef);
		base_clef++;
		contratValide=true;
	}
	
	public String getNumeroContrat() {
		return numeroContrat;
	}

	public Boolean getContratValide() {
		return contratValide;
	}

	public void setContratValide(Boolean contratValide) {
		this.contratValide = contratValide;
	}

	
	public abstract Contrat creationContrat();
	
	public abstract List<String> determinerGaranties();
	
	public abstract double determinerCotisation();
	
}
