import java.util.GregorianCalendar;
import java.util.Scanner;

public class Client extends Personne{
	private char type;
	
	public char getType() {
		return type;
	}
	public void setType(char t) {
		this.type = t;
	}
	@Override
	public void affichage() {
		super.affichage();
		/*System.out.println("Son prenom est : "+getDateNaissance());*/
		switch (type) {
		case 'P':
			System.out.println("type de client: Particulier");
			break;
		case 'E':
			System.out.println("type de client: Entreprise");
			break;
		case 'A':
			System.out.println("type de client: Administration");
			break;
		default:
			System.out.println("type de client: Inconnu");
			break;
		}
	}
	
	/*private String nom;
	private String prenom;
	private String adresseLigne1;
	private String adresseLigne2;
	private String adresseCP;
	private String adresseVille;
	private GregorianCalendar dateDeNaissance;*/
	
	/*public Client(){*/
		/*nom="defaut";
		prenom="defaut";
		adresseLigne1="defaut";
		adresseLigne2="defaut";
		adresseCP="defaut";
		adresseVille="defaut";*/
		/*dateDeNaissance= new GregorianCalendar();*/
	}
	/*public Client(String nom, String prenom, GregorianCalendar dateDeNaissance) {
		
	}
	Scanner verifClient = new Scanner(System.in);
	public void saisieDesInformationsClients(String idClients) {
		
		System.out.println("Identifiant: "+idClients);
		
		saisieNom();
		
		/*verifClient.nextLine();*/
				
		/*saisiePrenom();
				
		saisieAdresseLign1();		
		
		saisieAdresseLign2();		
		
		saisieAdresseCP();	
		
		saisieAdresseVille();	

		/*System.out.println("Veuillez saisir votre année de naissance: ");
		int anneeNaisVerif = verifClient.nextInt();
		System.out.println("Veuillez saisir votre mois de naissance: ");
		int moisNaisVerif = verifClient.nextInt();
		System.out.println("Veuillez saisir votre jour de naissance: ");
		int jourNaisVerif = verifClient.nextInt();
		System.out.println("Vous êtes né le: "+ GregorianCalendar(anneeNaisVerif,moisNaisVerif,jourNaisVerif));*/
		
		
		/*affichageDesInformationsClients();
	}
	
	public void affichageDesInformationsClients() {
		System.out.println("");
		System.out.println("Informations, nom: "+nom+" ; prénom: "+prenom);
		System.out.println("Adresse Ligne 1: "+adresseLigne1);
		System.out.println("Adresse Ligne 2: "+adresseLigne2);
		System.out.println("Code postal: "+adresseCP);
		System.out.println("Ville: "+ adresseVille);
		System.out.println("");
	}
	public void saisieNom() {
		System.out.println("Veuillez saisir le nom du client: ");
		nom = verifClient.nextLine();
		System.out.println("Nom du client: "+ nom);
	}
	public void saisiePrenom() {
		System.out.println("Veuillez saisir le prenom du client: ");
		prenom = verifClient.nextLine();
		System.out.println("Nom du client: "+ prenom);
	}
	public void saisieAdresseCP() {
		System.out.println("Veuillez saisir le code postal: ");
		adresseCP = verifClient.nextLine();
		System.out.println("Vous avez saisi: "+ adresseCP);
	}
	/*public void saisieDateDeNaissance() {
	
	}*/
	/*public void saisieAdresseLign1() {
		System.out.println("Veuillez saisir l'adresse ligne 1: ");
		adresseLigne1 = verifClient.nextLine();
		System.out.println("Vous avez saisi: "+ adresseLigne1);
	}
	public void saisieAdresseLign2() {
		System.out.println("Veuillez saisir l'adresse ligne 2: ");
		adresseLigne2 = verifClient.nextLine();
		System.out.println("Vous avez saisi: "+ adresseLigne2);
	}
	public void saisieAdresseVille() {
		System.out.println("Veuillez saisir la ville: ");
		adresseVille = verifClient.nextLine();
		System.out.println("Vous avez saisi: "+ adresseVille);
	}
	public String getNomClient() {
		return nom;
	}
	public String getPrenomClient() {
		return prenom;
	}
	public String getAdresseLigne1() {
		return adresseLigne1;
	}
	public String getAdresseLigne2() {
		return adresseLigne2;
	}
	public String getAdresseCP() {
		return adresseCP;
	}
	public String getAdresseVille() {
		return adresseVille;
	}
	public GregorianCalendar getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	
	public void setNomClient(String nom) {
		this.nom=nom;
	}
	public void setPreomClient(String prenom) {
		this.prenom=prenom;
	}
	public void setAdresseLigne1(String adresseLigne1) {
		this.adresseLigne1=adresseLigne1;
	}
	public void setAdresseLigne2(String adresseLigne2) {
		this.adresseLigne2=adresseLigne2;
	}
	public void setAdresseCP(String adresseCP) {
		this.adresseCP=adresseCP;
	}
	public void setAdresseVille(String adresseVille) {
		this.adresseVille=adresseVille;
	}
	public void setDateDeNaissance(GregorianCalendar dateDeNaissance) {
		this.dateDeNaissance=dateDeNaissance;
	}
	
	
}*/
