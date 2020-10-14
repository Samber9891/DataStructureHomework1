
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoopArray {
// properties 

int array[] = new int[5];


// constructor

private int i;

public LoopArray() {
}

 
public void run() {
// methods

        for (int i = 0; i < 5; i++); {

            Scanner userNum = new Scanner(System.in);
            System.out.println("Please enter a number");
            array[0] = userNum.nextInt();
        }

   
        for (int i = 0; i < 5; i++); {

            Scanner userNum = new Scanner(System.in);
            System.out.println("Please enter a second number");
            array[1] = userNum.nextInt();
        }


        for (int i = 0; i < 5; i++); {

            Scanner userNum = new Scanner(System.in);
            System.out.println("Please enter a thrid number");
            array[2] = userNum.nextInt();
           
        }

        for (int i = 0; i < 5; i++); {

            Scanner userNum = new Scanner(System.in);
            System.out.println("Please enter a fourth number");
            array[3] = userNum.nextInt();
        }
        for (int i = 0; i < 5; i++); {

            Scanner userNum = new Scanner(System.in);
            System.out.println("Please enter a fifth number");
            array[4] = userNum.nextInt();
          
        }

System.out.println("Your brand new array is " + Arrays.toString(array));
    }
}
    



