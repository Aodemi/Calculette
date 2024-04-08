module javafx.calculette.calculette {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens javafx.calculette.calculette to javafx.fxml;
    exports javafx.calculette.calculette;
}