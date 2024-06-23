import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int largestNum = 0;
    int smallestNum = 0;

    System.out.println("Enter a number (or -1 to quit): ");
    int input = scanner.nextInt();

    while (input != -1)  {
    if (input > largestNum) {
     input = largestNum; 
    }
    else {
     if(input < smallestNum) {  
      input = smallestNum;
    }
    }
    System.out.println("Enter a number (or -1 to quit): ");
    }

    System.out.printf(" %s %d %s %n ","The number ", +largestNum , " is the largest!"); 
   System.out.printf(" %s %d %s %n ","The number ",  +smallestNum , " is the  smallest!"); 

   }
   }