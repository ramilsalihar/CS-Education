module example.enchancedtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bmi_calculator to javafx.fxml;
    exports com.example.bmi_calculator;
}