import java.util.Scanner;

public class Multiples {
     
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the first integer: ");
     int num1 = scanner.nextInt();
   
     System.out.print("Enter the second integer: ");
     int num2 = scanner.nextInt();

     int tripledNum1 = num1 * 3;
     int doubledNum2 = num2 * 2;

     if (tripledNum1 % doubledNum2 == 0) { 
      System.out.printf(" %s %d %s %d %n ", "The first number tripled", + tripledNum1 , "is a multiple of the second number doubled", + doubledNum2);
    }

 else {
   System.out.printf(" %s %d %s %d %n ", "The first number tripled", + tripledNum1 , "is not a multiple of the second number doubled", + doubledNum2);
}
}
}