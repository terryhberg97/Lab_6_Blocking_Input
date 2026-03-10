//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    double choice = 0;
    boolean done = false;
    double fahrenheit = 0;
    String trash = "";

    
    do
    {
        System.out.println("Enter a temperature in C: ");
        if(in.hasNextDouble()) {
            choice = in.nextDouble();
            in.nextLine();
            done = true;
            fahrenheit = ((1.8) * choice) + 32;

        }
        else
        {
            trash = in.nextLine();
            System.out.println("Incorrect Value Entered is: " + trash);
        }

    } while (!done);

    System.out.println("The equivalent temperature in F is: " + fahrenheit);

}
