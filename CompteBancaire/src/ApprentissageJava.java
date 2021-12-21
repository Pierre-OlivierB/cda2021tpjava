import java.util.Scanner;

public class ApprentissageJava {

	public static void main(String[] args) {
		// TODO code application logic here
		/*Calculette objCalculette = new calculette();
		 *objCalculette.seTitle("Menu ;)");
		 *objCalculette.setVisible(true); */
		
		CompteBancaire objPittDAV;
		CompteBancaire objPittCSL;
		CompteBancaire objPittLivA;
		CompteBancaire objPittAssVie;
		
		objPittDAV = new CompteBancaire();
		objPittCSL = new CompteBancaire();
		objPittLivA = new CompteBancaire();
		objPittAssVie=  new CompteBancaire();
		
		
		System.out.println(objPittDAV);
		System.out.println(objPittCSL);
		System.out.println(objPittLivA);
		System.out.println(objPittAssVie);
		
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
		objPittDAV.saisieDesInformationsBancaires("DAV");
		objPittCSL.saisieDesInformationsBancaires("CSL");
		objPittLivA.saisieDesInformationsBancaires("LivA");
		objPittAssVie.saisieDesInformationsBancaires("AssVie");
		
		
	}

}
