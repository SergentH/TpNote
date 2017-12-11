package com.hugosergent.assurance;

import java.util.Scanner;
import java.util.logging.Logger;
/**
*
* @author Hugo SERGENT 4A Info
*/
public class App 
{
    public static void main( String[] args )
    {
    	//private static Logger logger = Logger.getLogger(App.class);
    	
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
        System.out.println("Plus gros client --> "+ MMA.obtenirPlusGrosClient());
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Début boucle infinie pour IHM");
        
        while(true)
        {
        	 System.out.println("Pour ajouter un client tapez 1");
             System.out.println("Pour ajouter un contrat tapez 2");
             
             int frappe = sc.nextInt(); 
             sc.nextLine();
             String str;
             switch (frappe) {
             case 1:  
             		System.out.println("Creation d'un nouveau client");
             		Personne p6 = new Personne();
             		System.out.println("Entrez son nom");
             		str = sc.nextLine();
             		p6.setNom(str);
             		System.out.println("Entrez son prenom");
             		str = sc.nextLine();
             		p6.setPrenom(str);  
             		System.out.println("Client Créé");
                     break;
             case 2:  
             		System.out.println("Creation d'un nouveau Contrat");
             		System.out.println("Selectionnez le numero du client");
             		int personne= sc.nextInt();
             	    sc.nextLine();
             		System.out.println("Selectionnez le numero du Contrat a creer, 1 pour Auto, 2 pour MRH, 3 pour Prevoyance");
             		frappe= sc.nextInt();
             	    sc.nextLine();
             		MMA.listeClients.get(personne).creerContrat(frappe);
             		System.out.println("Contrat Créé");
             		break;
                      
             default: break;
             }
             
        }
       
    }
}
