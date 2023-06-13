import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter C for Celcius ");
    System.out.println("Enter F for Farenhite ");
    
    char degree = in.next().charAt(0);
    
    if (degree == 'c' || degree == 'C') {
      System.out.println("Enter Celcius: ");
      float c = in.nextFloat();
      {
        System.out.println("Farenhite: " + Math.round(c * 9/5 + 32));
      }
    }
    
    if (degree == 'f' || degree == 'F') {
      System.out.println("Enter Farenhite: ");
      float f = in.nextFloat();
      {
        System.out.println("Celcius: " + Math.round(f - 32) * 5/9);
      }
    }
  
   }
 }