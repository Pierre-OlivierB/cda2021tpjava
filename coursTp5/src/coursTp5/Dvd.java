package coursTp5;


public class Dvd extends Personne{
	private String dvdName;
	private int dvdDuration;
	private String director; 
	
	public String getDirector(){
		return director;
	}
	public void setDirector(String dirName) {
		this.director=dirName;
	}
	public int getDvdDuration(){
		return dvdDuration;
	}
	public void setDvdDuration(int dvdMinutes) {
		this.dvdDuration=dvdMinutes;
	}
	
	
	public Dvd() {
		super();
	}
	public void dvdDescription(String t, int min, String maker) {
		this.dvdName = t;
		this.dvdDuration = min;
		this.director= maker;
		
		
		System.out.println("Le nom du dvd est le suivant: "+ t+".");
		System.out.println("Le temps du film est de: "+ min+"minutes. Son réalisateur est :"+maker+".");
	}
	public Dvd(String nom, String prenom) {
		super(nom,prenom);
		System.out.println(nom);
		System.out.print(prenom);
	}

}
