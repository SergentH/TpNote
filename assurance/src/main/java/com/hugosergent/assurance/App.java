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
        
        Personne p2 = new Personne();
        p2.setNom("Petit");
        p2.setPrenom("Bernadette");
        p2.creerContrat(1);
        p2.creerContrat(2);
        p2.resilierContrat(p2.obtenirContrats().get(0));
        
        Personne p3 = new Personne();
        p3.setNom("Loz");
        p3.setPrenom("Emile");
        System.out.println(p3);
        
        Personne p4 = new Personne();
        p4.setNom("Prevert");
        p4.setPrenom("Jacqueline");
        p4.creerContrat(2);
        
        Personne p5 = new Personne();
        p5.setNom("Sergent");
        p5.setPrenom("Hugo");
        p5.creerContrat(3);
        p5.creerContrat(2);
        p5.creerContrat(1);
        
        MMA.AjouterClient(p1);
        MMA.AjouterClient(p2);
        MMA.AjouterClient(p3);
        MMA.AjouterClient(p4);
        MMA.AjouterClient(p5);
        
        System.out.println(MMA.obtenirNombreDeClients());
        System.out.println(MMA.obtenirNombreDeProspects());
        System.out.println(MMA.obtenirNombreDeContrats());
        System.out.println(MMA.obtenirPlusGrosClient());
    }
}
