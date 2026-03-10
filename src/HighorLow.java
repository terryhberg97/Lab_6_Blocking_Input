//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Random;
void main() {
    Scanner in = new Scanner(System.in);
    int guess = 0;
    Random gen = new Random();
    int val = gen.nextInt(10) + 1;
    boolean done = false;
    String trash = "";

    do
    {
        System.out.println("Guess the number with a single guess (1-10): ");
        if (in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();

            if (guess >= 1 && guess <= 10)
            {
                done = true;

                System.out.println("The random number generated is: " + val);
                if (guess > val)
                {
                    System.out.println("High");
                }
                else if (guess < val)
                {
                    System.out.println("Low");
                }
                else
                {

                    System.out.println("On the money!");
                }
            }
            else
            {

                System.out.println("Valid inputs are integers 1-10. Incorrect value entered is: " + guess);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Valid inputs are integers 1-10. Incorrect value entered is: " + trash);
        }
    } while (!done) ;
    done = false;
}
