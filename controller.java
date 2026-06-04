import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller extends Algorithm {

    @FXML
    private Button button_result;

    @FXML
    private Label label_findroot;

    @FXML
    private Label label_resultofx1;

    @FXML
    private Label label_resultofx2;

    @FXML
    private Label label_solution;

    @FXML
    private Label label_x2;

    @FXML
    private Label label_x21;

    @FXML
    private Label label_x211;

    @FXML
    private TextField result_num1;

    @FXML
    private TextField result_num2;

    @FXML
    private TextField textField_num1;

    @FXML
    private TextField textField_num2;

    @FXML
    private TextField textField_num3;

    @FXML
    void on_calculate(ActionEvent event) {
        String aText = textField_num1.getText();
        String bText = textField_num2.getText();
        String cText = textField_num3.getText();

        if (aText == null || aText.isBlank() || bText == null || bText.isBlank() || cText == null || cText.isBlank()) {
            result_num1.setText("Error");
            result_num2.setText("Enter values");
            return;
        }

        try {
            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double c = Double.parseDouble(cText);

            if (a == 0) {
                result_num1.setText("Error");
                result_num2.setText("A cannot be 0");
                return;
            }

            String[] roots = solveQuadratic(a, b, c);
            result_num1.setText(roots[0]);
            result_num2.setText(roots[1]);
        } catch (NumberFormatException e) {
            result_num1.setText("Error");
            result_num2.setText("Invalid number");
        }
    }

}
