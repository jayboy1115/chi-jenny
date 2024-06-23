import java.util.Scanner;

public class BarChart1 {
   
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    
   int num1=0,num2=0,num3=0,num4=0,num5=0; 

   System.out.println("Enter five number between 1 and 30");
  
   System.out.print("Enter num1: ");
    num1 = scanner.nextInt();

   System.out.print("Enter num2: ");
    num2 = scanner.nextInt();

   System.out.print("Enter num3: ");
    num3 = scanner.nextInt();

   System.out.print("Enter num4: ");
    num4 = scanner.nextInt();

   System.out.print("Enter num: ");
    num5 = scanner.nextInt();

    System.out.println();
    System.out.println("BAR CHART");
} 
  public void main(String[] args) { 
   num1 = "Num 1: "; 

     for(int i = 0; i < num1; i++) {
        num1 += "*";
  }
       num1 += num1;
        num1="";
     System.out.println(num1);
}
}
     


   
   
    
