import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

   		int largestNum = 0;
    		int smallestNum = 0;
     		int stop = 1;
     while (stop != 0)  {
    	System.out.println("Enter a number: ");
    	int input = scanner.nextInt();

    	System.out.println("Enter a number (or 0 to quit): ");
    	stop = scanner.nextInt();

     
    		if (input > largestNum) {
    	 		largestNum++;
    		}
  
     		if(input < smallestNum) {  
      			 smallestNum++;
    		}

		largestNum = largestNum;
		smallestNum = smallestNum;

    	}

    	System.out.printf(" %s %d %s %n ","The number ", +largestNum , " is the largest!"); 
   	System.out.printf(" %s %d %s %n ","The number ",  +smallestNum , " is the  smallest!"); 

   }
   }