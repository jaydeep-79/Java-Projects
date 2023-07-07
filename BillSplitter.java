import java.util.Scanner;

public class BillSpilter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      
        System.out.println("Enter the bill amount: ");
        int amount = in.nextInt();
      
        System.out.println("No. of person: ");
        int person = in.nextInt();

        int spilt = amount/person;

        System.out.println("Split: " + Math.round(spilt));

    }
}
