import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map; 

public class CarHashMap {

    static HashMap<String, String> cars = new HashMap<>();

    public static void run() {
// properties 

    cars.put("Honda", "Civic");
    cars.put("Toyota", "Camry"); 
    cars.put("Infiniti", "G6"); 

// end of properties

// begin user entry

    Scanner userModel = new Scanner(System.in);
    System.out.println("What Car Model are you looking for today?");
    String model = userModel.nextLine();

// end user entry


// begin method

for ( String i : cars.values()) {

    System.out.println("\nOh you're looking for a "  + model + " our " + cars.values() + " section is right over here");

}




    // end of method
        }
}