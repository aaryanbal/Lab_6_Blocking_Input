import java.util.Scanner;

public class FuelCosts {
    static void main(){

        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double PriceGallon = 0;
        boolean done = false;
        String trash = "";


        do {
            IO.print("Enter the number of gallons in the tank: ");


            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                IO.println("You must enter a valid # of Gallons: " + trash);
                IO.println("Try again please");

            }
        } while (!done);
        done = false;


            do {
                IO.print("Enter the MPG: ");


                if (in.hasNextDouble()) {
                    mpg = in.nextDouble();
                    in.nextLine();
                    done = true;

                } else {
                    trash = in.nextLine();
                    IO.println("You must enter a valid MPG : " + trash);
                    IO.println("Try again please");
                }
            } while (!done);
            done = false;


            do {
                IO.print("Enter the PPG: ");


                if (in.hasNextDouble()) {
                    PriceGallon = in.nextDouble();
                    in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    IO.println("You must enter a valid PPG : " + trash);
                    IO.println("Try again please");


                }
            } while (!done);

            double cost100 = (100 / mpg) * PriceGallon;
            double distance = gallons * mpg;


            IO.println("The cost to drive 100 Miles is: " + cost100);
            IO.println("The distance the car can go with a full tank is: " + distance);





        }



    }

