module com.tqb.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.tqb.quizzapp to javafx.fxml;
    exports com.tqb.quizzapp;
}
