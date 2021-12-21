package coursTp5;

public class Attributs {
	String status;
	int speed; 
	float temperature;
	
	void checkTemperature(float temperature) {
		
		if (temperature >660) {
			status ="retour au bercail";
			speed=5;
			showAttributes(status, speed, temperature);
		}
	}

	void showAttributes(String status, int speed, float temperature) {
		System.out.println("Status : "+status);
		System.out.println("Speed : "+speed);
		System.out.println("Température : "+temperature);
	}
}
