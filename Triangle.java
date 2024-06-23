        import java.util.Scanner;

public class Triangle {

       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.println("Enter length of the sides:");
       double len = input.nextDouble ();

       System.out.println("Enter height of the triangle:");
       double hei = input.nextDouble ();

       double area = len*hei;

       double volume = area*len;

       System.out.printf("the volume of the equilateral triangle is %.2f", volume);
       }
}
       