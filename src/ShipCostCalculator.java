import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        double price = 0;
        double shippingCost = 0;
        String trash = "";


        System.out.print("Enter the price of the item: ");


        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();


            if (price >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = price * 0.02;
            }


            double totalPrice = price + shippingCost;
           System.out.println("Shipping cost is: $" + shippingCost);

            System.out.println("Total cost is : $" + totalPrice);;
        } else {

            System.out.println("Invalid input. You entered: " + trash);
            System.out.println("Please enter a valid number for the item price.");
        }
    }
}