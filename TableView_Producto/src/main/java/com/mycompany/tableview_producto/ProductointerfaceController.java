package com.mycompany.tableview_producto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductointerfaceController implements Initializable {

    @FXML private TableView tblProductos;
    @FXML private TableColumn colId;
    @FXML private TableColumn colNombre;
    @FXML private TableColumn colPrecio;
    @FXML private TableColumn colTalla;

    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private TextField txtPrecio;
    @FXML private TextField txtTalla;
    @FXML private Button agregarProducto;

    private ObservableList listaProductos = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Enlace de las columnas con los atributos de Producto 🔗
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colTalla.setCellValueFactory(new PropertyValueFactory<>("talla"));

        tblProductos.setItems(listaProductos);
    }    

    @FXML
    private void agregaProductos(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        int talla = Integer.parseInt(txtTalla.getText());

        Producto nuevoProducto = new Producto(id, nombre, precio, talla);
        listaProductos.add(nuevoProducto);

        txtId.clear();
        txtNombre.clear();
        txtPrecio.clear();
        txtTalla.clear();
    }
}