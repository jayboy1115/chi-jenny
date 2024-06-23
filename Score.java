import java.util.Scanner;

public class Score {

      public static void main(String[] args) {
      
       Scanner input = new Scanner(System.in);
       int score;

       while (true) {
         System.out.print("Enter your score (or -1 to quit): ");
         score = input.nextInt();

         if (score == -1) {
          break;
         } else if (score >= 60) {
   	    System.out.println("You have passed!");
         } else {
            System.out.println("You have failed. Try again!");
         }
         }

            System.out.println("Finished!");
	}
}
          