package sample;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    private boolean numberInput;
    private BigDecimal LHS;
    private String selectedOperation;

    public FXMLController() {
        this.numberInput = false;
        this.LHS = BigDecimal.ZERO;
        this.selectedOperation = "";
    }

    @FXML
    public void buttonOperation(ActionEvent evt) {
        Button buttonn = (Button) evt.getSource();
        String buttonText = buttonn.getText();
        //if operator command input
        if (buttonText.matches("[/*+-]")) {
            selectedOperation = buttonText;
            LHS = new BigDecimal(textField.getText());
            numberInput = false;
            return;
        }
        //sum input
        if (buttonText.equals("=")) {
            final BigDecimal RHS;
            if (numberInput) {
                RHS = new BigDecimal(textField.getText());
            } else {
                RHS = LHS;
            }
            textField.setText(LHS.toString());
            LHS = calculate(LHS, RHS, selectedOperation);
            numberInput = false;
            return;
        }

        //clear command input
        if (buttonText.equals("Clear")) {
            if (buttonText.equals("Clear")) {
                LHS = BigDecimal.ZERO;
            }
            selectedOperation = "";
            textField.clear();
            numberInput = true;
            return;
        }

        //if number command input
        if (buttonText.matches("[0-9\\.]")) {
            if (!numberInput) {
                textField.clear();
                numberInput = true;
            }
            textField.appendText(buttonText);
            return;
        }

    }

    public static BigDecimal calculate(BigDecimal LHS, BigDecimal RHS, String operator) {
        switch (operator) {
            case "*":
                return LHS.multiply(RHS);
            case "/":
                return LHS.divide(RHS);
            case "+":
                return LHS.add(RHS);
            case "-":
                return LHS.subtract(RHS);
        }
        return RHS;
    }

    @FXML
    private TextField textField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
