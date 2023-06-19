import java.util.Scanner;

public class MixPrograms {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Following for different Programs");
        System.out.println("T -> Temp calculator");
        System.out.println("B -> Basic calculator");
        System.out.println("P -> Number Printer");
        System.out.println("A -> Age calculator");

        char select = in.next().toUpperCase().charAt(0);

        switch (select) {

            case 'B':

                System.out.println("Enter 1st num: ");
                int x = in.nextInt();

                System.out.println("Enter 2nd num: ");
                int y = in.nextInt();

                System.out.println("Enter the operator: ");
                char op = in.next().charAt(0);

                switch (op) {

                    case '+':
                        System.out.println(x + y);
                        break;
                        
                    case '-':
                        System.out.println(x - y);
                        break;

                    case '*':
                        System.out.println(x * y);
                        break;

                    case '/':
                        System.out.println(x / y);
                        break;

                    default:
                        System.out.println("Invalid Input Enter Again");

                }
                break;

            case 'T':

                System.out.println("Enter C for Celcius ");
                System.out.println("Enter F for Farenhite ");

                char degree = in.next().charAt(0);
                // Filetering Out the First Charactor

                if (degree == 'c' || degree == 'C') {
                    System.out.println("Enter Celcius: ");
                    float c = in.nextFloat();
                    {
                        System.out.println("Farenhite: " + Math.round(c * 9 / 5 + 32));
                    }
                } // If the user inputs C or c that means he wants to convert celsius to
                // Fahrenheit

                if (degree == 'f' || degree == 'F') {
                    System.out.println("Enter Farenhite: ");
                    float f = in.nextFloat();
                    {
                        System.out.println("Celcius: " + Math.round(f - 32) * 5 / 9);
                    }
                } // if the user inputs f or F he wa
                break;

            case 'P':

                System.out.println("Enter the number till you want to print it: ");
                int num = in.nextInt();
                num++;

                for (int i = 0; i < num; i++){
                    System.out.println(i);
                }
                break;

            case 'A':
                System.out.println("Enter Your birth year: ");
                int year = in.nextInt();
                System.out.println("Your age is " + (2023 - year));
                break;

            default:
                System.out.println("Invalid Input, Enter again");

        }
    }
}
