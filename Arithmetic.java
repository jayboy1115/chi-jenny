import java.util.Scanner;

public class Arithmetic {

      public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter first integer:");
       int number1 = input.nextInt();


       System.out.print("Enter second integer:");
       int number2 = input.nextInt();

       int squareNumber1 = number1 * number1;
       int squareNumber2 = number2 * number2;
       int sumSquares = squareNumber1 + squareNumber2;
       int diffSquares = squareNumber1 - squareNumber2;

       System.out.printf("Square of first integer: %n ", + squareNumber1);
       System.out.printf("Square of second integer: %n ", + squareNumber2);
       System.out.printf("Sum of squares: %n " + sumSquares);
       System.out.printf("Difference of squares: %n " + diffSquares);
 
       }

}








