/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.cristianrosas.system.Main;

/**
 * FXML Controller class
 *
 * @author informatica
 */
public class MenuProductosController implements Initializable {
    private Main stage;
    
    private static Connection conexion = null;
    private static PreparedStatement statement = null;
    private static ResultSet resultSet = null;
    @FXML
    TableView tblProductos; 
    
    @FXML
    TableColumn colProductoId,colNombreProducto, ColDescripcionProducto, colCantidadStock, colPrecioUnitario, colPrecioMayor;
            
    @FXML
    Button btnRegresar, btnGuardar, btnEditar, btnEliminar, btnAgregar;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // cargarLista();
        // TODO
    }    
    
    @FXML
    public void handleButtonAction(ActionEvent event){
        if(event.getSource() == btnRegresar){
            stage.menuPrincipalView();
        }

        
    }
}
