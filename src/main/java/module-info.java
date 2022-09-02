module com.silverlink.firstfxpractice {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;

    opens com.silverlink.firstfxpractice to javafx.fxml;
    exports com.silverlink.firstfxpractice;
}