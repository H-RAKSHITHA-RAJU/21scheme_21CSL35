import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the coefficients
        System.out.println("Enter the coefficients a, b, and c of the quadratic equation ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the discriminant value and determine the number of real solutions
        if (discriminant > 0) {
            // Two distinct real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);
            System.out.println("The equation has one real solution:");
            System.out.println("Root: " + root);
        } else {
            // No real solutions
            System.out.println("The equation has no real solutions.");
        }

        scanner.close();
    }
}
