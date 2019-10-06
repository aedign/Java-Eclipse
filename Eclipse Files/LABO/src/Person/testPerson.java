package Person;

import java.util.ArrayList;

public class testPerson {

	public static void main(String[] args) {
		
		
ArrayList<Integer> al1 = new ArrayList<Integer>();

al1.add(10);
al1.add(50);
al1.add(60);
al1.add(70);
al1.add(30);
al1.add(90);


int count = al1.size() -1;

System.out.println(count);

System.out.println(avgArray(al1,0,0));


	}
	
	
public static double avgArray(ArrayList<Integer> al1, int index, int sum) {
	double avg = 0;


	
	if (index >= al1.size()) {
		
		avg = sum / (double)al1.size();
		return avg;
	}
	
	else {
		
	
		sum += (al1.get(index));
		index++;
		return avgArray(al1, index, sum);
	}
	
	
	
	
	
	
}

}
