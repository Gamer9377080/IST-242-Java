import java.util.Scanner;
import java.lang.Math;
public class Krzysztof_IST242_QuadraticFormula {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double p = 3.14;
        double a, b, c;
        //gets an imput for a,b,c
        System.out.print("Enter a real number for \"a\": ");
        a = scn.nextDouble();
        System.out.println();
        System.out.print("Enter a real number for \"b\": ");
        b = scn.nextDouble();
        System.out.println();
        System.out.print("Enter a real number for \"c\"3: ");
        c = scn.nextDouble();
        System.out.println();
        double discriminant = (b * b) - (4 * a * c);
        if(a == 0){
            System.out.println("The value of \"a\" cannot be 0");
            System.out.println("Please enter a value for \"a\" that is not 0: ");
            a = scn.nextDouble();
        }
        if(discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("your values for a, b, and c are: " + a + ", " + b + ", " + c);
            System.out.println("Root 1 (+): " + String.format("$%.4f%n", root1));
            System.out.println("Root 2 (-): " + String.format("$%.4f%n", root2));
        }
    }
}
