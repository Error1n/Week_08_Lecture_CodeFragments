import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSNRegEx = "^\\d{3}-\\d{2}-\\d{4}$";

        String men = "men";
        String bird = "bird";
        String pluralMen = "";

        String any = "";

        sayhello();
        sayMsg("Hello");
        sayMsg("Goodbye");
        repeatMsg("Screw it!", 10);

        System.out.println(pluralize(men));
        System.out.println(pluralize(bird));

        pluralMen = pluralize("Men");
        System.out.println(pluralMen);

        System.out.println(CtoF(100.0));

        // 5 character field with 2 precision for first one, 2f for float. Creates a C to F list from -10 to 120
        System.out.println("C val   F val");
        for(double c = -10.0; c < 120; c += .5) // += means add .5 each time
            System.out.printf("%5.2f\t%5.2f\n", c, CtoF(c));


        any = getString(in, "Enter your name");
        System.out.println("You said: " + any);



    }


    // static methods go here after the main



    /**
     * Prints the word "Hello"
     */

    private static void sayhello()
    {
        System.out.println("Hello");
    }



    /**
     * Displays a string message
     * @param msg the string message to be displayed
     */

    private static void sayMsg(String msg)
    {
        System.out.println(msg);
    }



    /**
     * repeats a message
     * @param msg the message
     * @param reps the number of times to be repeated
     */
    private static void repeatMsg(String msg, int reps)
    {
        for(int rep = 0; rep < reps; rep++) //indicates the number of times to be repeated, specified in Main
        System.out.println(msg);
    }



    /**
     * Adds an s onto the end of a string to make it plural
     * @param singularBase the string to pluralize
     * @return the string with the appended "s"
     */

    private static String pluralize(String singularBase) //because it's not void, it always has to have a return type
    {
        return singularBase + "s";
    }



    /**
     * creates a C to F chart
     * @param Cval celsius value
     * @return the F value
     */

    private static double CtoF(double Cval)
    {
        return Cval * 9.0/5.0 + 32.0;
    }


    /**
     * Asks for someone's name and loops until they type something
     * @param scan The input
     * @param prompt The message
     * @return The message
     */
    private static String getString(Scanner scan, String prompt)
    {
        boolean done = false;
        String val = "";

        do
        {
            System.out.print(prompt + ": ");
            val = scan.nextLine();
            if(val.length() > 0)
                done = true;
            else
                System.out.println("You must enter some characters!" +
                        "");
        }while(!done);

        return val;

    }

}