package ExceptionHandling;


@SuppressWarnings("serial")
public class TimeFormatException extends Exception{
	
	public TimeFormatException() {
		
	}
	
	public TimeFormatException(String error){
		
		super("TimeFormatException: Wrong format used for time");	
		
	}
	
	}

