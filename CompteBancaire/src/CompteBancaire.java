import java.util.Scanner;

public class CompteBancaire {
	
	private Integer numCpte;
	private String nomCpte;
	private Float solde;
	
	/*private int numVerif;
	private String nomVerif;
	private int soldeVerif;*/
	
	/*@Override
	public String toString() {
		return "Compte numéro"+this.numCpte;
	}*/
	
	public CompteBancaire() {
		numCpte = -1;
		nomCpte="un compte";
		solde=0f;
	}
	public Integer getNumCpte() {
		return numCpte;
	}
	public String getNomCpte() {
		return nomCpte;
	}
	public Float getSolde() {
		return solde;
	}
	
	public void setNumCpte(Integer numCpte) {
		this.numCpte = numCpte;
	}
	public void setNomCpte(String nomCpte) {
		this.nomCpte = nomCpte;
	}
	public void setSolde(Float solde) {
		this.solde = solde;
	}
	/*@Override*/
	/*public String toString() {
		return "Compte numéro"+this.numCpte;
	}*/
	public void saisieDesInformationsBancaires(String idCompte) {
		
		System.out.println("Identifiant: "+idCompte);
		System.out.println("Veuillez saisir le numero du compte: ");
		Scanner verif = new Scanner(System.in);
		int numVerif = verif.nextInt();
		System.out.println("Vous avez saisi le numero du compte: "+ numVerif);
		
		verif.nextLine();
		
		System.out.println("Veuillez saisir le nom du compte: ");
		String nomVerif = verif.nextLine();
		System.out.println("Vous avez saisi le nom du compte: "+ nomVerif);
		
		

		System.out.println("Veuillez saisir le numero du solde: ");
		int soldeVerif = verif.nextInt();
		System.out.println("Vous avez saisi le numero du solde: "+ soldeVerif);
		
		
		affichageDesInformationsBancaires(numVerif,nomVerif,soldeVerif);
		
	}
	
	public void affichageDesInformationsBancaires(int numVerif, String nomVerif,int soldeVerif) {
		System.out.println("Vos informations sont les suivantes, num compte: "+numVerif+" ;nom du compte: "+nomVerif+"; son solde: "+soldeVerif+"€");
	}
}
