import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallons = input.nextDouble();
            if (gallons <= 0) {
                System.out.println("Please enter a positive value.");
            }
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = input.nextDouble();
            if (fuelEfficiency <= 0) {
                System.out.println("Please enter a positive value.");
            }
        } while (fuelEfficiency <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = input.nextDouble();
            if (pricePerGallon <= 0) {
                System.out.println("Please enter a positive value.");
            }
        } while (pricePerGallon <= 0);

        double costFor100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceWithFullTank = gallons * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costFor100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.%n", distanceWithFullTank);

    }
}
