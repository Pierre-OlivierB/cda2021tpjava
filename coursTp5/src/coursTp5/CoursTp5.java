package coursTp5;

import java.util.Date;

/*import java.awt.Color;*/

public class CoursTp5 {
	
	/*String status;
	int speed;
	float temperature;*/
	
	/*void checkTemperature() {
		if (temperature >660) {
			status ="retour au bercail";
			speed=5;
		}
	}*/
	/*void showAttributes() {
		System.out.println("Status : "+status);
		System.out.println("Speed : "+speed);
		System.out.println("Température : "+temperature);
	}*/
	
	
	/*Variable de class*/
	/*private static int random = (int)(new Date().getTime());*/
	
	/*Méthode qui fourni un nombre aléatoire*/
	
	/*public static int random() {
		random = random ^(random*random);
		return random;
	}*/
	
	public static void main(String[] args) {
		
		/*CoursTp5 dante= new CoursTp5();*/
		
		/*Attributs danteAttributs= new Attributs();
		
		danteAttributs.showAttributes("explorant", 2, 510 );
		System.out.println("Augmentation vitesse...3. ");
		danteAttributs.showAttributes("explorant", 3, 510 );
		System.out.println("Changement température... 670");
		System.out.println("Vérification de la température.");
		danteAttributs.checkTemperature(670);*/
		/*Partie article*/
		article test1;
		article test2;
		
		Dvd test3;
		
		Livre test4;
		
		
		test1=new article();
		test2=new article();
		
		test3=new Dvd();
		
		test4=new Livre();
		
		test1.afficheArticle(142, "Lampe", 15);
		test2.afficheArticle(18,"Camion",162);
		
		test3.afficheArticle(151, "Hella", 25);
		test3.dvdDescription("Vf = Hello", 150, "O'Donell");
		
		test4.afficheArticle(200, "Le vieux loup", 19);
		test4.livreDescription("La vieille louve", "A58B89N", 155, "Mc Henri");
		
		

		
		/*for(;;)
			System.out.println("Aléatoire : "+CoursTp5.random());*/
		
	
		/*Voiture mercedes, clio;
		mercedes = new Voiture();
		mercedes.changerCouleur("rouge");
		mercedes.accelerer();
		
		System.out.println(mercedes.changerCouleur("rouge"));
		
		clio = new Voiture();
		clio.changerCouleur ("verte");
		clio.freiner();
		
		System.out.println(clio.couleur);

		Pomme pommes1 = new Pomme();
		Pomme pommes2 = new Pomme();

		pommes1.couleur = "jaune";
		pommes2.calibre = 5;
		
		System.out.println(pommes1.couleur);
		System.out.println(pommes2.calibre);*/
	}

}
