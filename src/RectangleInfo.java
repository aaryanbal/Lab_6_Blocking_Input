import java.util.Scanner;


public class RectangleInfo {
    static void main(){
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        boolean done = false;
        String trash = "";


        do {
            IO.print("Enter the width of the Rectangle: ");

            if (in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;

            } else {
                trash = in.nextLine();
                IO.println("Please enter a valid input!");
                IO.println("Try again!");

            }
        } while(!done);
        done = false;


        do {
            IO.print("Enter the height of the Rectangle: ");


            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;


            } else {
                trash = in.nextLine();
                IO.println("Please enter a valid input!");
                IO.println("Try again!");



            }

        } while (!done);

        double areaRec = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        IO.println("The area of the Rectangle is: " + areaRec);
        IO.println("The perimeter of the Rectangle is: " + perimeter);
        IO.println("The diagonal of the Rectangle is: " + diagonal);













    }

}
