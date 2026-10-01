module com.mycompany.tableview_producto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tableview_producto to javafx.fxml;
    exports com.mycompany.tableview_producto;
}
