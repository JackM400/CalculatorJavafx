package sample;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class FXMLController implements Initializable {
    private boolean numberInput;
    private BigDecimal left;
    private String selectedOpeeration;

    public FXMLController() {
        this.numberInput = false;
        this.left = BigDecimal.ZERO;
        this.selectedOpeeration = "";
    }

    @FXML
    public void buttonOperation(ActionEvent evt) {
        Button buttonn = (Button) evt.getSource();
        String buttonText = buttonn.getText();

        if (buttonText.equals("C")) {
            if (buttonText.equals("C")) {
                left = BigDecimal.ZERO;

            }
            selectedOpeeration = "";
            TextField.clear();
            numberInput = true;
            return;
        }
    }

    @FXML
    private TextField TextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
