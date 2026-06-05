import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Controller {
    
    @FXML
    private TextField textField_num1;   // Input A (coefficient of x²)
    @FXML
    private TextField textField_num2;   // Input B (coefficient of x)
    @FXML
    private TextField textField_num3;   // Input C (constant term)
    @FXML
    private TextField result_num1;   // Output x₁
    @FXML
    private TextField result_num2;      // Output x₂
    @FXML
    private Button button_result;
    
    @FXML
    private void on_calculate() {
        try {
            // Get values from all three text fields
            String aText = textField_num1.getText();
            String bText = textField_num2.getText();
            String cText = textField_num3.getText();
            
            // Check if fields are empty
            if (aText.isEmpty() || bText.isEmpty() || cText.isEmpty()) {
                result_num1.setText("Error");
                result_num2.setText("Enter all values");
                return;
            }
            
            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double c = Double.parseDouble(cText);
            
            System.out.println("Solving: " + a + "x^2 + " + b + "x + " + c + " = 0");
            
            // Check if it's a quadratic equation
            if (a == 0) {
                // Linear equation bx + c = 0
                if (b == 0) {
                    result_num1.setText("Error");
                    result_num2.setText("No solution");
                } else {
                    double x = -c / b;
                    result_num1.setText(String.format("%.2f", x));
                    result_num2.setText("Not quadratic");
                }
                return;
            }
            
            // Calculate discriminant
            double discriminant = b * b - 4 * a * c;
            
            if (discriminant > 0) {
                // Two real and distinct roots
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                
                result_num1.setText(String.format("%.2f", x1));
                result_num2.setText(String.format("%.2f", x2));
                
                System.out.println("Two real roots: x_1 = " + x1 + ", x_2 = " + x2);
                
            } else if (discriminant == 0) {
                // One real root (double root)
                double x = -b / (2 * a);
                result_num1.setText(String.format("%.2f", x));
                result_num2.setText(String.format("%.2f", x));
                
                System.out.println("One real root (double): x = " + x);
                
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                
                result_num1.setText(String.format("%.2f + %.2fi", realPart, imaginaryPart));
                result_num2.setText(String.format("%.2f - %.2fi", realPart, imaginaryPart));
                
                System.out.println("Complex roots: " + realPart + " ± " + imaginaryPart + "i");
            }
            
            System.out.println("Results displayed successfully.");
            
        } catch (NumberFormatException e) {
            result_num1.setText("Error");
            result_num2.setText("Invalid number");
            System.err.println("Number format error: " + e.getMessage());
        }
    }
}
