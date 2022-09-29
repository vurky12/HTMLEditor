module com.example.htmleditor {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.htmleditor to javafx.fxml;
    exports com.example.htmleditor;
}