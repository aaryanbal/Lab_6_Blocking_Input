import java.util.Random;

import java.util.Scanner;



public class HighorLow {
    static void main(){
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int guess = 0;
        boolean done = false;
        String trash = "";
        int val = generator.nextInt(10) + 1;


        do {
            IO.print("Enter a number between 1 and 10: ");

            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();


                if (guess >= 1 && guess <= 10){
                    done = true;

                } else {
                    trash = in.nextLine();
                    IO.println("Guess is invalid, try again please. " + trash);

                }


            }


        } while (!done);

        IO.println("The number was: " + val);

        if (guess > val) {
            IO.println("Your guess was too high!");

        } else if (guess < val) {
            IO.println("Your guess was too low!");

        } else {
            IO.println("You were on the money!");
        }









    }


}
