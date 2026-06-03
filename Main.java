import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main(String[] args) {
        // You can either run the GUI or the console version
        // Choose ONE of these:
        
        // Option 1: Run JavaFX GUI (uncomment this line)
        launch(args);
        
        // Option 2: Run console version (comment out launch above, uncomment below)
        // runConsoleVersion();
    }
    
    // JavaFX GUI version
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml")); // Changed from "scene.fxml" to "View.fxml"
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Quadratic Equation Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // Console version (if you want to run without GUI)
    public static void runConsoleVersion() {
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

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;
        
        // Calculate and display roots
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots: %.2f and %.2f\n", root1, root2);
        } 
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f\n", root);
        } 
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots: %.2f ± %.2fi\n", realPart, imaginaryPart);
        }
        
        scanner.close();
    }
}