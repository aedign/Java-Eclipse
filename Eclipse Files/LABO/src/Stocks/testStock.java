package Stocks;


public class testStock {
	
	public static void main (String[] args) {
	
	Stock google = new Stock("GOG", "Google");
	

	
	google.setPreviousClosingPrice(100.98);
	google.setCurrentPrice(115.46);
	google.getChangePercent();
	
	
	System.out.println(google.getName() + " stock:\n" );
	System.out.println("Symbol: " + google.getSymbol());
	System.out.println("Closing price: " + google.getPreviousClosingPrice());
	System.out.println("Current price: " + google.getCurrentPrice());
	System.out.println("Change percent: " + google.getChangePercent() + " %");
	System.out.println(google.getName() +   google.toString()  + "$" + google.getPreviousClosingPrice());
	
	System.out.println();
	Stock microsoft = new Stock("MSF", "Microsoft");
	
	 microsoft.setPreviousClosingPrice(91.76);
	 microsoft.setCurrentPrice(88.17);
	 microsoft.getChangePercent();
	
	System.out.println( microsoft.getName() + " stock:\n" );
	System.out.println("Symbol: " +  microsoft.getSymbol());
	System.out.println("Closing price: " +  microsoft.getPreviousClosingPrice());
	System.out.println("Current price: " +  microsoft.getCurrentPrice());
	System.out.println("Change percent: " +  microsoft.getChangePercent() + " %");
	System.out.println(microsoft.getName() +  microsoft.toString()  + "$" +  microsoft.getPreviousClosingPrice());
	
	
	
	
	

}
	
}
