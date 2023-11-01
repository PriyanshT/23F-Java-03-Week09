module com.example.week09part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week09part2 to javafx.fxml;
    exports com.example.week09part2;
}