package coursTp5;

public class article {
	int reference; 
	String designation; 
	int prix;
		
	public int getReference(){
		return reference;
	}
	public void setReference(int ref) {
		this.reference=ref;
	}
	public String getDesignation(){
		return designation;
	}
	public void setDesignation(String desi) {
		this.designation=desi;
	}
	public int getPrix(){
		return prix;
	}
	public void setPrix(int cout) {
		this.prix=cout;
	}
	public void afficheArticle(int reference,String designation, int prix){
		System.out.println("Sa référence est le: "+ reference);
		System.out.println("Sa désignation est là: "+ designation);
		System.out.println("Son prix est de: "+ prix+"€");
	}
	
}
