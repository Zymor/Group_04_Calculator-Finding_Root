import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class Controller {
    
    @FXML
    private TextField textField_num1;   // Input A
    @FXML
    private TextField textField_num2;   // Input B
    @FXML
    private TextField result_num1;      // Output x₁
    @FXML
    private TextField result_num2;      // Output x₂
    @FXML
    private Button button_result;
    
    @FXML
    private void on_calculate() {
        try {
            String aText = textField_num1.getText();
            String bText = textField_num2.getText();
            
            // Check if fields are empty
            if (aText.isEmpty() || bText.isEmpty()) {
                result_num1.setText("Error");
                result_num2.setText("Enter values");
                return;
            }
            
            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            System.out.println("x: " + a + ", y: " + b);
            
            if (a == 0) {
                result_num1.setText("Error");
                result_num2.setText("A cannot be 0");
                return;
            }
            
            // Solve Ax² + Bx = 0
            double x1 = 0;
            double x2 = -b / a;
            
            // Display results with formatting
            result_num1.setText(String.format("%.2f", x1));
            result_num2.setText(String.format("%.2f", x2));
            
            // Debug output
            System.out.println("Equation: " + a + "x² + " + b + "x = 0");
            System.out.println("x₁ = " + x1 + ", x₂ = " + x2);
            System.out.println("Results displayed in text fields successfully.");


            
        } catch (NumberFormatException e) {
            result_num1.setText("Error");
            result_num2.setText("Invalid number");
            System.err.println("Number format error: " + e.getMessage());
        }
    }
}