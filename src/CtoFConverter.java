import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter the temperature in celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = celsius * 1.8 + 32;
                System.out.println("The temperature in fahrenheit is " + fahrenheit);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("I don't know the celsius: " + trash);
                System.out.println("You have to enter a valid temperature!");
            }
        }while(!done);

    }
}