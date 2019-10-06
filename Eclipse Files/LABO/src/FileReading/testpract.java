package FileReading;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class testpract{


public static void main(String[] args){

ArrayList<String> al = new ArrayList<String>();

Scanner scan = new Scanner(System.in);

try {

String filename = scan.nextLine();

scan = new Scanner(new File(filename));


   while (scan.hasNext()){

      al.add(scan.next());
     
   }
   
   
   System.out.print(al);
   
   
   }
   catch (Exception e){

System.out.println("You fool");

}


try{
   
   int count = 0;
   
   
   while(count < 4){
   
   String data = al.get(count);

   int number = Integer.parseInt(data);
   System.out.println(number);
   count++;
   
   }
   
   }
   
   catch (Exception e){
   System.out.println("Math, dude");
   
   }
   
   scan.close();

}


}


   




