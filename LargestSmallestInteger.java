import java.util.Scanner;

public class LargestSmallestInteger {
    
       public static void main(String[] args) {
        Scanner Scanner
 = new Scanner(System.in);

       System.out.println("Enter five integers:");
       int num1 = Scanner.nextInt();
       int num2 = Scanner.nextInt();
       int num3 = Scanner.nextInt();
       int num4 = Scanner.nextInt();
       int num5 = Scanner.nextInt();

       int largest = num1;
       int smallest = num1;

       if (num2 > largest) {
        largest = num2;
        }
 
       if (num2 < smallest) {
        smallest = num2;
       }

       if (num3 > largest) {
        largest = num3;
       }
     
       if (num3 < smallest) {
        smallest = num3;
       }

       if (num4 > largest) {
        largest = num4;
       }

       if (num4 < smallest) {
        smallest = num4;
       }

       if (num5 > largest) {
        largest = num5;
       }

       if (num5 < smallest) {
        smallest = num5;
       }

        System.out.printf("Largest: ", largest);
        System.out.printf("Smallest: ", smallest);
    } 
}