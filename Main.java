import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main(String[] args) {
        System.out.println("Starting Quadratic Equation Solver...");
        System.out.println("Program will solve equations of form: Ax^2 + Bx + C = 0");
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Loading FXML...");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Quadratic Equation Solver - Group 04");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("Application window opened successfully!");
    }
}