//Pseudo Code:

        //Prompt the user to enter their party affiliation by choosing 'D', 'R', or 'I'.
        //Use cascaded if statements to check the input.
        //If the user enters D, display "You get a Democratic Donkey"
        //If the user enters R, display "You get a Republican Elephant"
       // If the user enters I, display "You get an Independent Person"
       // For any other input, display "You get Other"
        //Java Implementation:

import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String party = in.nextLine().trim().toUpperCase();


        if (party.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}