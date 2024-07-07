module com.example.websorting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.websorting to javafx.fxml;
    exports com.example.websorting;
}