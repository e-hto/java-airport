
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Airport {

    private HashMap<String, Integer> planes;
    
    private ArrayList<String> flights;
    
    private Scanner reader;


public Airport( ) {
   
    HashMap<String, Integer> planesMap = new HashMap<String, Integer>();
    
     ArrayList<String> flightsList = new ArrayList<String>();
    
    this.planes = planesMap;
    
    this.flights = flightsList;
    
    Scanner read = new Scanner(System.in);
    
    this.reader = read;
    
}


public void start(){
    
    System.out.println("Airport panel\n" +
"--------------------\n");
    
    while ( true ) {
    
        System.out.println("");
        
    System.out.print( "Choose operation:\n" +
"[1] Add airplane\n" +
"[2] Add flight\n" +
"[x] Exit\n" +
    
 "> "   
    );
    String input = reader.nextLine();
    
    
    if ( input.equals( "1")) {
        
        input1();
        
    }
    
    if ( input.equals ( "2" )) {
        
        
        input2();
    }
    
    if ( input.equals( "x")) {
        
        //break from x input in flight service takes us back HERE so need
        //to find a way to make it break from both loops
        
        flightService();
        
        break;
    }
}
    
}

public void input1(){
    
    System.out.print("Give plane ID: ");
    
    String id =  reader.nextLine();
    
    System.out.print("Give plane capacity: ");
    
    Integer capacity =  Integer.parseInt(reader.nextLine());
    
    planes.put( id, capacity );
}

public void input2(){
    
    System.out.print("Give plane ID: ");
    
    String id =  reader.nextLine();
     
    System.out.print("Give departure airport code: ");
    
    String departure =  reader.nextLine();
    
   System.out.print("Give destination airport code: ");
    
   String destination =  reader.nextLine();
   
   // String comboStore = id + " (" + departure + "-" + destination + ")";
    
    
    // want capacity integer of plane id, id is the key
    
    String flight = id + " (" + planes.get( id ) + " ppl) (" + departure + "-" + destination + ")";
    
    flights.add(flight);
}

public void flightService(){
    
    System.out.println("");
    
    System.out.print("Flight service\n" +
"------------\n\n" 
            );

    while ( true) {
    
        System.out.println("");
        
        System.out.print("Choose operation:\n" +
"[1] Print planes\n" +
"[2] Print flights\n" +
"[3] Print plane info\n" +
"[x] Quit\n" +
"> ");
        
String input = reader.nextLine();

if ( input.equals ( "x")) { break; } 
    
    
    
if ( input.equals ("1") ) { 
    
   //print flights
   
    ArrayList<String> re = new ArrayList<String>();
    
    for ( String key : planes.keySet() ) {
        
    re.add(key + " (" + planes.get(key) + " ppl)" );
   
    }
    
   for ( String element : re) {
       
       System.out.println(element);
   }
   
   


    
    }


if ( input.equals ( "2") ) {
    
    for ( String flight : flights ) {
        
        System.out.println(flight);
    }
   
}


if ( input.equals ( "3") ) {
    
    System.out.print("Give plane ID: ");
    
    String id = reader.nextLine();
    
    System.out.println(id + " (" + planes.get(id) + " ppl)");
    
   
}



}

}



  

}
