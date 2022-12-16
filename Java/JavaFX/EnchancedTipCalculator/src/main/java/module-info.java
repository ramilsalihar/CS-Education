module example.enchancedtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens example.enchancedtipcalculator to javafx.fxml;
    exports example.enchancedtipcalculator;
}