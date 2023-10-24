module com.example.metro_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metro_management to javafx.fxml;
    exports com.example.metro_management;
}