/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.system;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.cristianrosas.controller.* ;




/**
 *
 * @author Lenovo
 */
public class Main extends Application {
    private Stage stage;
    private Scene scene;
    private final String URLVIEW = "/org/cristianrosas/view/";
    
    @Override
    public void start(Stage stage){
        this.stage = stage;
        Image icon = new Image("org/cristianrosas/image/icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("SuperKinal");
        menuPrincipalView();
        //loginView();
        stage.show();

    }
    
    public Initializable switchScene(String fxmlName, int width, int height) throws Exception{
        Initializable resultado;
        FXMLLoader loader = new FXMLLoader();
        
        InputStream file = Main.class.getResourceAsStream(URLVIEW + fxmlName);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(URLVIEW + fxmlName));
        
        scene = new Scene((AnchorPane)loader.load(file), width, height);
        stage.setScene(scene);
        stage.sizeToScene();
        
        resultado = (Initializable)loader.getController();
        
        return resultado;
    }
   
    
    public void menuPrincipalView(){
        try{
            MenuPrincipalController menuPrincipalView = (MenuPrincipalController)switchScene("MenuPrincipalView.fxml", 950, 675);
            menuPrincipalView.setStage(this);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuClientesView(){
        try{
            MenuClientesController menuClientesView = (MenuClientesController)switchScene("MenuClientesView.fxml", 1200, 750);
            menuClientesView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuAgregarClientesView(int op){
        try{
            MenuAgregarClientesController menuAgregarClientesView = (MenuAgregarClientesController)switchScene("MenuAgregarClientesView.fxml", 500, 700);
            menuAgregarClientesView.setOp(op);
            menuAgregarClientesView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuTicketSoporteView(){
        try{
            MenuTicketSoporteController  menuTicketSoporteView = (MenuTicketSoporteController)switchScene("MenuTicketSoporteView.fxml", 1200, 750);
            menuTicketSoporteView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCargosView(){
        try{
            MenuCargosController menuCargosView = (MenuCargosController)switchScene("MenuCargosView.fxml", 500, 700);
            menuCargosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuEditarCargosView(){
        try{
            MenuEditarCargosController menuEditarCargosView = (MenuEditarCargosController)switchScene("MenuEditarCargosView.fxml", 1200, 750);
            menuEditarCargosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuDistribuidoresView(){
        try{
            MenuDistribuidoresController menuDistribuidoresView = (MenuDistribuidoresController)switchScene("MenuDistribuidoresView.fxml", 1200, 750);
            menuDistribuidoresView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formDistribuidoresView(int op){
        try{
            FormDistribuidoresController formDistribuidoresView = (FormDistribuidoresController)switchScene("FormDistribuidoresView.fxml", 500, 700);
            formDistribuidoresView.setOp(op);
            formDistribuidoresView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCategoriaProductosView(){
        try{
            MenuCategoriaProductosController menuCategoriaProductosView = (MenuCategoriaProductosController)switchScene("MenuCategoriaProductosView.fxml", 1200, 750);
            menuCategoriaProductosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formCategoriaProductosView(int op){
        try{
            FormCategoriaProductosController formCategoriaProductosView = (FormCategoriaProductosController)switchScene("FormCategoriaProductosView.fxml", 500, 700);
            formCategoriaProductosView.setOp(op);
            formCategoriaProductosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuEmpleadosView(){
        try{
            MenuEmpleadosController menuEmpleadosView = (MenuEmpleadosController)switchScene("MenuEmpleadosView.fxml", 1200, 750);
            menuEmpleadosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formEmpleadosView(int op){
        try{
            FormEmpleadosController formEmpleadosView = (FormEmpleadosController)switchScene("FormEmpleadosView.fxml", 500, 700);
            formEmpleadosView.setOp(op);
            formEmpleadosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuFacturaView(){
        try{
            MenuDetalleFacturasController menuFacturaView = (MenuDetalleFacturasController)switchScene("MenuFacturaView.fxml", 1200, 750);
            menuFacturaView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuCompraView(){
        try{
            MenuComprasController menuComprasView = (MenuComprasController)switchScene("MenuComprasView.fxml", 1200, 750);
            menuComprasView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuPromocionView(){
        try{
            MenuPromocionesController menuPromocionesview = (MenuPromocionesController)switchScene("MenuPromocionesView.fxml", 1200, 750);
            menuPromocionesview.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuProductoView(){
        try{
            MenuProductosController menuProductosView = (MenuProductosController)switchScene("MenuProductosView.fxml", 1200, 750);
            menuProductosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formProductoView(int op){
        try{
            FormProductosController formProductosView = (FormProductosController)switchScene("FormProductosView.fxml", 500, 700);
            formProductosView.setOp(op);
            formProductosView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void loginView(){
        try{
            LoginController loginView = (LoginController)switchScene("LoginView.fxml", 500, 700);
            loginView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void formUsuarioView(){
        try{
            ResgistrarUsuarioController formUsuarioView = (ResgistrarUsuarioController)switchScene("ResgistrarUsuarioView.fxml", 500, 700);
            formUsuarioView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


   


    
}