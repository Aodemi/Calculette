package javafx.calculette.calculette;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class DemoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void toggleAffichage() {

        if(welcomeText.isVisible()){
            welcomeText.setVisible(false);
        }
        else{
            welcomeText.setVisible(true);
        }
    }

    @FXML
    protected void textRouge() {
        welcomeText.setTextFill(Color.RED);
    }


}
