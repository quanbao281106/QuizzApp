module com.tqb.quizappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.tqb.quizappv2 to javafx.fxml;
    exports com.tqb.quizappv2;
    exports com.tqb.pojo;
}
