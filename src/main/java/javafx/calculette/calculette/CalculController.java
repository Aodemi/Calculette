package javafx.calculette.calculette;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class CalculController {
    @FXML
    private Label operation;

    @FXML
    protected void onClickAddOne(ActionEvent event) {
        int calculTotal = 0;
        String val = ((Button) event.getSource()).getText();
        if(operation.getText().compareTo("0") == 0){
            operation.setText("");
        } else if (val.compareTo("=") == 0) {
            calculTotal = Integer.parseInt(operation.getText());
            operation.setText(String.valueOf(calculTotal));
        }
        operation.setText(operation.getText() + val);
    }


}
