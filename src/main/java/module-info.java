module com.example.bodybuild {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bodybuild to javafx.fxml;
    exports com.example.bodybuild;
}