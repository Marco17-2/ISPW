module com.example.bodybuild {
    requires javafx.controls;
    requires javafx.fxml;


    opens ispw to javafx.fxml;
    exports ispw;
}