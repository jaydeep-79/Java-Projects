import java.util.Scanner;

public class BasicCalculator {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value: ");
        int x = in.nextInt();
        // first number input

        System.out.println("Enter value: ");
        int y = in.nextInt();
        // second number input

        System.out.println("Enter the operator: ");
        char operator = in.next().charAt(0);
        // operator input

        switch(operator) {

            case ('+') :
                System.out.println("Ans: " + (x + y));
                break;
            // addition

            case ('-') :
                System.out.println("Ans: " + (x - y));
                break;
            // subtraction

            case ('*') :
                System.out.println("Ans: " + (x * y));
                break;
            // multiplication

            case ('/') :
                System.out.println("Ans: " + (x / y));
                break;
            // division

            default:
                System.out.println("Invalid Input");
                // in case the user inputs something invalid
        }
    }
}

