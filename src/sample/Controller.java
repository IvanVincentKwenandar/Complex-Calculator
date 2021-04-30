package sample;

import java.math.BigDecimal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{
    public boolean inputAngka;
    public String operator;

    public Controller(){
        this.inputAngka = false;
        this.operator = "";
    }

    @FXML
    public TextField display;

    @FXML
    void klikTombol(ActionEvent event){
        Button btn = (Button) event.getSource();
        final String btn_text = btn.getText();
        if (btn_text.matches("0-9\\.")){
            if (!inputAngka){
                inputAngka = true;
                display.clear();
            }
            display.appendText(btn_text);
            return;
        }
    }


}
