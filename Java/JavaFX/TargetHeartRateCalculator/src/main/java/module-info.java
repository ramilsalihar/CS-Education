module com.example.targetheartratecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.targetheartratecalculator to javafx.fxml;
    exports com.example.targetheartratecalculator;
}