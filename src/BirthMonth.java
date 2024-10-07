import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int birthMonth = 0;
        String trash = "";


        System.out.print("Enter your birth month (1-12): ");


        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();


            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {

            System.out.println("Invalid input. You entered: " + trash);
            System.out.println("Please enter a valid number between 1 and 12.");
        }
    }
}