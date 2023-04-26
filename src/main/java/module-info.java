module com.algorithm.algorithmtest {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.algorithm.algorithmtest to javafx.fxml;
    exports com.algorithm.algorithmtest;
}