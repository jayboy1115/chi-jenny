import java.util.Scanner;

public class RaisedToPower {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

   int raised = 1;
   int number1 = 0;
   int number2 = 0;
      
       System.out.print("Enter first number: ");
         number1 = scanner.nextInt();

         System.out.print("Enter second number: ");
             number2 = scanner.nextInt();

           for(int assist = 0; assist < number2; assist++) {
                 raised *= number2;
       }
               System.out.printf("%d raised to power %d is: %d%n", number1, number2, raised);
  }
} 