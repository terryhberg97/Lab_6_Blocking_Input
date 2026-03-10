import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    double numberOfGallons = 0;
    double fuelEfficiency = 0;
    double priceGallon = 0;
    double costToDrive = 0;
    double fullTankDistance = 0;
    boolean done = false;
    String trash = "";

    do
    {
        System.out.print("Enter the number of gallons: ");
        if (in.hasNextDouble())
        {
            numberOfGallons = in.nextDouble();
            in.nextLine();
            done = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect value entered is: " + numberOfGallons);
        }
    } while (!done);

    do
    {
        System.out.println("Enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
            in.nextLine();
            done = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect value entered is: " + fuelEfficiency);
        }
    } while (!done);

    do
    {
        System.out.println("Enter the price of gas per gallon:  ");
        if (in.hasNextDouble())
        {
            priceGallon = in.nextDouble();
            in.nextLine();
            done = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect value entered is: " + priceGallon);
        }
    } while (!done);
    costToDrive = (100 / fuelEfficiency) * priceGallon;
    fullTankDistance = numberOfGallons * fuelEfficiency;

    System.out.println("The cost to drive 100 miles is: $" + costToDrive);
    System.out.println("On a full tank, the car can go: " + fullTankDistance + " miles");
}
