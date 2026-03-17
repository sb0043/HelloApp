/**
 * HelloAppUC4.java - A simple Java application that greets multiple users by name
 * if provided as command-line arguments, or defaults to greeting "World" if none
 * are given.
 *
 * Greet Multiple Users - The application should accept multiple names as
 * command-line arguments and display a personalized greeting for each user.
 *
 * Usage: java HelloAppUC4 [name1] [name2] ... [nameN]
 * - If names are provided, it will display "Hello, [Name1], [Name2], ..."
 * - If no names are provided, it will display "Hello, World!"
 *
 * @author Developer Name
 * @version 4.0
 * @since UC1
 */

public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        // If names are provided, combine them
        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}