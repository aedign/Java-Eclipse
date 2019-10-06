package Radio;


public class testRadio {
	
	public static void main (String[] args) {
		
		Radio r1 = new Radio();
		
		
		r1.turnOn();
		System.out.println(r1.ToString() + " \n");
		
	
		r1.volumeUp();r1.volumeUp();r1.volumeUp();
		System.out.println(r1.ToString()+ " \n");
		
		r1.stationUp();r1.stationUp();r1.stationUp();r1.stationUp();r1.stationUp();
		System.out.println(r1.ToString()+ " \n");
		
		r1.stationDown(); r1.stationDown();
			System.out.println(r1.ToString()+ " \n");
			
			r1.turnOff();
			System.out.println(r1.ToString()+ " \n");
			
			r1.volumeUp();r1.volumeUp();
			System.out.println(r1.ToString()+ " \n");
		
		
		
	}

}
