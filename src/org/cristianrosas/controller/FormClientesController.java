/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.cristianrosas.dao.Conexion;
import org.cristianrosas.dto.ClienteDTO;
import org.cristianrosas.model.Cliente;
import org.cristianrosas.system.Main;

/**
 * FXML Controller class
 *
 * @author informatica
 */
public class FormClientesController implements Initializable {
    private Main stage;
    private int op;
    
    private static Connection conexion;
    private static PreparedStatement statement;
    
    @FXML 
    Button btnGuardar, btnCancelar;
    @FXML 
    TextField tfclienteId, tfNombre, tfApellido,tfTelefono, tfDireccion, tfNit;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(ClienteDTO.getClienteDTO().getCliente() != null){
            cargarDatos(ClienteDTO.getClienteDTO().getCliente());
        }
    } 
 
    
    @FXML
    public void handleButtonAction(ActionEvent event){
        if(event.getSource() == btnCancelar){
            stage.menuClientesView();
            ClienteDTO.getClienteDTO().setCliente(null);
        }else if(event.getSource() == btnGuardar){
            if(op == 1){
                agregarCliente();
                stage.menuPrincipalView();
            }else if (op == 2){
                editarCliente();
                ClienteDTO.getClienteDTO().setCliente(null);
                stage.menuPrincipalView();
            }
        }
    }
    
    public void agregarCliente(){
        try{
            conexion = Conexion.getInstance().obtenerConexion();
            String sql = "call sp_agregarCliente(?, ?, ?, ?, ?)";
            statement = conexion.prepareStatement(sql);
            statement.setString(1, tfNombre.getText());
            statement.setString(2, tfApellido.getText());
            statement.setString(3, tfTelefono.getText());
            statement.setString(4, tfDireccion.getText());
            statement.setString(5, tfNit.getText());
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(statement != null){
                    statement.close();
                }
                if(conexion != null){
                    conexion.close();
                }
            }catch(SQLException e ){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void cargarDatos(Cliente cliente){
        tfclienteId.setText(Integer.toString (cliente.getClienteId()));
        tfNombre.setText(cliente.getNombre());
        tfApellido.setText(cliente.getApellido());
        tfTelefono.setText(cliente.getTelefono());
        tfDireccion.setText(cliente.getDireccion());
        tfNit.setText(cliente.getNit());
    }
    
    public void editarCliente(){
        try{
            conexion = Conexion.getInstance().obtenerConexion();
            String sql = "call sp_agregarCliente(?, ?, ?, ?, ?, ?)";
            statement = conexion.prepareStatement(sql);
            statement.setInt(1,Integer.parseInt (tfclienteId.getText()));
            statement.setString(2, tfNombre.getText());
            statement.setString(3, tfApellido.getText());
            statement.setString(4, tfTelefono.getText());
            statement.setString(5, tfDireccion.getText());
            statement.setString(6, tfNit.getText());
            statement.execute();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(statement != null){
                    statement.close();
                }
                if(conexion != null){
                    conexion.close();
                }
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
   
    
        public Main getStage() {
        return stage;
    }

    public void setStage(Main stage) {
        this.stage = stage;
    }

    public void setOp(int op) {
        this.op = op;
    }


    
}
