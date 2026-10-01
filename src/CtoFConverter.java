import java.util.Scanner;

public class CtoFConverter {
    static void main(){

        Scanner in = new Scanner(System.in);
        double cVal = 0;
        double fVal = 0;
        boolean done = false;
        String trash = "";

        do {
            IO.print("Enter the temp in C: ");


            if(in.hasNextDouble())
            {
                cVal = in.nextDouble();
                in.nextLine();

                fVal = cVal * 9.0/5 + 32;
                IO.println("The celsius value " + cVal + " is equal to " + fVal + " in Fahrenheit" );
                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid Celsius Value not: " + trash);
                IO.println("Try again please");

            }

        }while (!done);











    }
}
