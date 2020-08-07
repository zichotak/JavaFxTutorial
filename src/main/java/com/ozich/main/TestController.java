package com.ozich.main;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class TestController implements Initializable {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private CheckBox checkbox1;

    public TestController() {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button1.setText("Tlacitko 1");
        button2.setText("Tlacitko 2");
        checkbox1.setText("zaskrtni me!");

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    checkbox1.setSelected(true);
                    checkbox1.setText("Nech me byt a odskrtni me!");
                    button1.setText("Tlacitko 1");
            }
        });

        button2.setOnAction(event -> {
            checkbox1.setSelected(false);
            checkbox1.setText("zaskrtni me!");
            button1.setText("Si me nastval!");
        });
    }
}
