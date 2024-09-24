module by.costapp.costcontrolapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires eu.hansolo.fx.countries;
    requires eu.hansolo.fx.heatmap;
    requires eu.hansolo.toolboxfx;
    requires eu.hansolo.toolbox;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            requires eu.hansolo.tilesfx;
    requires java.logging;

    opens by.costapp.costcontrolapp to javafx.fxml;
    exports by.costapp.costcontrolapp;
}