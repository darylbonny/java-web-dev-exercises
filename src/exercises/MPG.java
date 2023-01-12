package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");

        double x = input.nextDouble();
        System.out.println("Enter amount of gas used (gallons: ");

        double y = input.nextDouble();
        System.out.println("Miles per gallon (Mpg) is " + (x/y));
    }
}
