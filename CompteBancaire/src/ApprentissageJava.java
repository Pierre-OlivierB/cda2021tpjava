import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class ApprentissageJava {

	public static void main(String[] args) {
		/*Partie Personne*/
		
		Personne test1;
		Personne test2;
		Personne test3;

		test1 = new Personne();
		test2 = new Personne();
		test3 = new Personne();
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		
		test1.setNom("Dupond");
		test1.setPrenom("Paul");

		test1.setDateNaissance(1990,2,8);
		
		
		System.out.println("Son nom est : "+test1.getNom()+" et son prénom : " +test1.getPrenom());
		System.out.println("Il est naît le : "+test1.getDateNaissance()+" il a donc : " +test1.calculAge()+" ans.");
		
		Client c= new Client();
		c.setNom("CHATON");
		c.setPrenom("Marina");
		System.out.println(c);
		
		System.out.println("Son nom est : "+c.getNom()+" et son prénom : " +c.getPrenom());
		test1.affichage();
		c.affichage();
		
		/*Partie compte bancaire*/
		// TODO code application logic here
		/*Calculette objCalculette = new calculette();
		 *objCalculette.seTitle("Menu ;)");
		 *objCalculette.setVisible(true); */
		
		/*CompteBancaire objPittDAV;
		CompteBancaire objPittCSL;
		CompteBancaire objPittLivA;
		CompteBancaire objPittAssVie;
		
		Client ouistiti;
		Client shlakbuk;
		Client tatouin;
		
		ouistiti = new Client();
		shlakbuk = new Client();
		tatouin = new Client();
		
		
		objPittDAV = new CompteBancaire();
		objPittCSL = new CompteBancaire();
		objPittLivA = new CompteBancaire();
		objPittAssVie=  new CompteBancaire();
		
		
		System.out.println(objPittDAV);
		System.out.println(objPittCSL);
		System.out.println(objPittLivA);
		System.out.println(objPittAssVie);*/
		
		/*System.out.println ("Exemple d'écriture dans la fenêtre de sortie.");
		
		Scanner in = new Scanner(System.in);
		String chaineLue = in.nextLine();
		System.out.println("Voici la chaine saisie "+ chaineLue);
		
		System.out.println("Saisissez un nombre");
		int nombreLu = in.nextInt();
		System.out.println("Nombre "+ nombreLu);*/
		
		/*in.nextLine();*/
		
		/*System.out.println("Saisissez une nouvelle chaîne: ");
		String reChaineLue = in.nextLine();
		System.out.println("Voici la chaine saisie "+ reChaineLue);
		in.close();*/
		
		/*CompteBancaire.saisieDesInformationsBancaires();*/
		/*ouistiti.saisieDesInformationsClients("lolo");
		shlakbuk.saisieDesInformationsClients("lala");
		tatouin.saisieDesInformationsClients("lulu");
		
		objPittDAV.saisieDesInformationsBancaires("DAV");
		objPittCSL.saisieDesInformationsBancaires("CSL");
		objPittLivA.saisieDesInformationsBancaires("LivA");
		objPittAssVie.saisieDesInformationsBancaires("AssVie");*/
		
		
	}

}
