import java.util.Scanner;

 public class Asteriks1 {

      public static void main(String[] args) {   
      Scanner scanner = new Scanner(System.in);
     
       int number1 = 15, number2 = 19, number3 = 22, number4 = 26, number5 = 29;
        System.out.printf("Enter 5 numbers between 1 - 30: ");
         System.out.printf("%d %d %d %d %d",number1,number2,number3,number4,number5);
          
         System.out.println("");
         System.out.println("");
        
          for (int counter =1; counter <= number1; counter++ ) {
               System.out.printf("*");
       }

         System.out.println("");

         for (int counter =1; counter <= number2; counter++ ) {
               System.out.printf("*");
       }

         System.out.println("");

         for (int counter =1; counter <= number3; counter++ ) {
               System.out.printf("*");
       }

         System.out.println("");

         for (int counter =1; counter <= number4; counter++ ) {
               System.out.printf("*");
       }

         System.out.println("");

         for (int counter =1; counter <= number5; counter++ ) {
               System.out.printf("*");
       }
      }
      }


       