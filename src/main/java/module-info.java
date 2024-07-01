module com.example.preview {
    requires javafx.controls;
    requires javafx.fxml;
    requires annotations;


    opens com.example.preview to javafx.fxml;
    exports com.example.preview;
}