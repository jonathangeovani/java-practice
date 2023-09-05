package com.primeiroprojetojava.helloworldgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMensagem;
    private Button bntClique;

    @FXML
    protected void clicouBotao() {
        lblMensagem.setText("Hello World!");
    }
}