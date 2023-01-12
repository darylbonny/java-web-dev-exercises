package exercises;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of triangle: ");

        int x = input.nextInt();
        System.out.println("Enter width of triangle: ");

        int y = input.nextInt();
        System.out.println("Area of rectangle is " + (x*y));
    }
}
