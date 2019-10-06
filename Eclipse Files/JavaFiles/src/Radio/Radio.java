package Radio;


public class Radio {
	
	private int station = 1;
	private int volume = 1;
	private boolean on = false;
	
	Radio(){
	}
	
	
	int getStation(){
		
		return station;
	}
	
	int getVolume() {
		
		return volume;
	}
	
	boolean turnOn() {
		
		this.on = true;
		
		return on;
	}
	
	boolean turnOff() {
		
		this.on = false;
		
		return on;
	}

 	int stationUp() {
 		
 		if (on == true) {
 			station ++;
 		}
 			
 			return station;
 		}
 	
 	int stationDown() {
 		
 		if (on == true) {
 			station --;
 		}
 			
 			return station;
 		}
 	
 	int volumeUp() {
 		
 		if (on == true) {
 			volume ++;
 		}
 			
 			return volume;
 		}
 	
 	int volumeDown() {
 		
 		if (on == true) {
 			volume --;
 		}
 			
 			return volume;
 		}
 	
 	String ToString() {
 		
 		String description;
 		
 		if (on == true) {
 		
 		description = "The radio station is " + station + " and the volume is " + volume;
 		
 		}
 		
 		else {
 			
 			description = "The radio station is off ";
 			
 		}
 		
 		return description;
 	}
	 
	 
 }
	
	


