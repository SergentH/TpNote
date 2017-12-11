package com.hugosergent.assurance;

/**
*
* @author Hugo SERGENT 4A Info
*/
public class App 
{
    public static void main( String[] args )
    {
        CompagnieAssurance MMA = new CompagnieAssurance();
        
        Personne p1 = new Personne();
        p1.setNom("Paul");
        p1.setPrenom("Jean");
        p1.creerContrat(1);
        
        p2.setNom("Petit");
        p2.setPrenom("Bernadette");
        p2.creerContrat(1);
        
        p3.setNom("Loz");
        p3.setPrenom("Emile");
        
        p4.setNom("Prevert");
        p4.setPrenom("Jacqueline");
        p4.creerContrat(2);
        
        p5.setNom("Sergent");
        p5.setPrenom("Hugo");
        p5.creerContrat(3);
        
        MMA.AjouterClient(p1);
        
        
    }
}
