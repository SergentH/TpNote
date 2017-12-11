package com.hugosergent.assurance;

import java.util.Comparator;

public class ComparateurClient implements Comparator<Personne>{
	 @Override
	    public int compare(Personne p1, Personne p2)
	    {
	        return p1.obtenirContrats().size() - p2.obtenirContrats().size();
	    }
}
