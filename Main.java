import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Quadratic Equation Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
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
    

