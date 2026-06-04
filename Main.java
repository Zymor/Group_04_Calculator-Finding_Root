import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Mini Project: Quadratic Equation Solver ---");
        System.out.println("Equation format: Ax^2 + Bx + C = 0\n");

        // 1. Get inputs from the user
        System.out.print("Enter value for A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for B: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for C: ");
        double c = scanner.nextDouble();

         scanner.close();
        
        }


    }
    

