package coursTp5;

public class Livre extends article {
	private String bookName;
	private String ISBN;
	private int numbrPag;
	private String author;
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String autName) {
		this.author=autName;
	}
	public String getISBN(){
		return ISBN;
	}
	public void setISBN(String bISBN) {
		this.ISBN=bISBN;
	}
	public int getNumbrPage(){
		return numbrPag;
	}
	public void setNumbrPage(int bNmbr) {
		this.numbrPag=bNmbr;
	}
	
	
	public Livre() {
		super();
	}
	public void livreDescription(String b, String ISBN, int n,String a) {
		this.bookName = b;
		this.ISBN = ISBN;
		this.numbrPag = n;
		this.author= a;	
		
		System.out.println("Le nom du livre est le suivant: "+ b+".");
		System.out.println("Son ISBN est le suivant: "+ ISBN +". Le nombre de page est de :"+n+". Son auteur s'appelle: "+a+".");
	}

}
