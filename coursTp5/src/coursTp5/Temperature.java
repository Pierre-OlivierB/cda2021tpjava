package coursTp5;

public class Temperature {
	
	void checkTemperature(float temperature, String status, int speed) {
		
		if (temperature >660) {
			status ="retour au bercail";
			speed=5;
		}
	}
}
