module example.enchancedtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens example.enchancedtipcalculator to javafx.fxml;
    exports example.enchancedtipcalculator;
}