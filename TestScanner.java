import java.util.*;
public class TestScanner
{
    public static void main(String[] args)
    {

    }

    public static void year()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean validinput = false;
        int year;
        String confirmation;

        while (!validinput)
        {
            System.out.println("Please enter a year");
            if(!keyboard.hasNextInt())
            {
                year = keyboard.nextInt();
                System.out.println("Is this ok? Type yes to continue, type anything else to exit");
                confirmation = keyboard.nextLine();
                if (confirmation.equalsIgnoreCase("yes"))
                {
                    validinput = true;
                }
                else
                {
                    System.out.println("Resetting...");
                }
            }
            else 
            {
                System.out.println("Please enter a valid year");
            }

        }
    }
}
