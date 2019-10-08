import java.util.*;
public class TestScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("whats your favorite number?");
        boolean epic = false;
        while(epic == false){
            if(keyboard.hasNextInt()){
                int numba = keyboard.nextInt();
                epic = true;
            }
            else{System.out.println("stoopid");
                keyboard.nextLine();}
        }
        System.out.println("Whats ur name loooser");
        String name = keyboard.next();
        keyboard.nextLine();
        System.out.println("Type some stuff boy");
        String[] stuff = keyboard.nextLine().split(" ");
        for(String stuffs : stuff)
        {
            System.out.println(stuffs);}
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
                    keyboard.nextLine();
                }
            }
            else 
            {
                System.out.println("Please enter a valid year");
                keyboard.nextLine();
            }

        }
    }
}
