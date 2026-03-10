//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    double width = 0;
    double height = 0;
    double area = 0;
    double perimeter = 0;
    double diagonal = 0;
    boolean done = false;
    String trash = "";

    do
    {
        System.out.println("Enter the width of the rectangle: ");
        if (in.hasNextDouble())
        {
            width = in.nextDouble();
            in.nextLine();
            done = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect value entered is: " + trash);
        }
    } while (!done);

    done = false;

    do
    {
        System.out.println("Enter the height of the rectangle: ");
        if (in.hasNextDouble())
        {
            height = in.nextDouble();
            in.nextLine();
            done = true;
            area = height * width;
            perimeter = 2 * (height + width);
            diagonal = Math.sqrt(height * height + width * width);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect value entered is: " + trash);
        }
    } while (!done);
    System.out.println("The area of the rectangle is: " + area);
    System.out.println("The perimeter of the rectangle is: " + perimeter);
    System.out.println("The length of the diagonal is: " + diagonal);

}
