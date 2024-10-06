import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validInput;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                validInput = true;
            } else {
                String trash = scanner.nextLine();
                System.out.println("Invalid input: " + trash);
                validInput = false;
            }
        } while (!validInput);

        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                validInput = true;
            } else {
                String trash = scanner.nextLine();
                System.out.println("Invalid input: " + trash);
                validInput = false;
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

    }
}