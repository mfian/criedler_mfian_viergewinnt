module com.example.testa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testa to javafx.fxml;
    exports com.example.testa;
}