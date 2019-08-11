package sample;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    private boolean numberInput;
    private BigDecimal left;
    private String selectedOpeeration;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public FXMLController(BigDecimal left, String selectedOpeeration, boolean numberInput) {
        this.numberInput = numberInput;
        this.left = left;
        this.selectedOpeeration = selectedOpeeration;
    }
}
