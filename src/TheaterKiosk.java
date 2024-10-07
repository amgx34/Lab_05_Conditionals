//Pseudo Code:

        //Prompt the user to enter their age.
        //If the age is 21 or older, display a message that they get a wrist band.
        //If the age is less than 21, the program does nothing.
        //Java Implementation:


import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner in = new Scanner(System.in);

        // Declare variables
        int age = 0;
        String trash = "";

        // Prompt the user for their age
        System.out.print("Enter your age: ");


        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();


            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }

        } else {

            trash = in.nextLine();
            System.out.println("Invalid input. You entered: " + trash);
            System.out.println("Please enter a valid number for age.");
        }
    }
}