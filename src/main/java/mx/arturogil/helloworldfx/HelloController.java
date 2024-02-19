package mx.arturogil.helloworldfx;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    private TextField numberTextField;

    @FXML
    void handleBtnOneClick (ActionEvent event) {
        System.out.println("ACTION EVENT");
    }

    @FXML
    void handleKeyboardInput(KeyEvent e) {
        System.out.println("KEY PRESSED: "+ e.getCharacter());
        var keyPressed = e.getCharacter().charAt(0);
        var currentText = numberTextField.getText();
        if(!Character.isDigit(keyPressed)) {
            numberTextField.setText(currentText.substring(0, currentText.length() - 1));
        }
    }

    @FXML
    void handleBtnTwoClick(ActionEvent e) {
        System.out.println("aaaaaaaaaaaa");
    }

}