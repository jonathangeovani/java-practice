module com.primeiroprojetojava.helloworldgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.primeiroprojetojava.helloworldgui to javafx.fxml;
    exports com.primeiroprojetojava.helloworldgui;
}