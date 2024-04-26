/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.system;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import java.io.InputStream;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import org.cristianrosas.controller.FormClientesController;
import org.cristianrosas.controller.MenuClientesController;
import org.cristianrosas.controller.MenuPrincipalController;
import org.cristianrosas.controller.MenuTicketSoporteViewController;





/**
 *
 * @author Lenovo
 */

public class Main extends Application {
    private Stage stage;
    private Scene scene;
    private final String URLVIEW = "/org/cristianrosas/view/";
    
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        Image icon = new Image ("org/cristianrosas/image/icon.png");
        stage.setTitle("Suuper kinal App");
        stage.getIcons().add(icon);
        menuPrincipalView();
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
           MenuPrincipalController menuPrincipalView = (MenuPrincipalController)switchScene("MenuPrincipalView.fxml", 949, 700);
           menuPrincipalView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuClientesView(){
        try{
            MenuClientesController menuClientesView = (MenuClientesController)switchScene("MenuClienteView.fxml", 1200, 750);
            menuClientesView.setStage(this);
        }catch(Exception e){
            System.out.println("e.getMessage()");
        }
    }
    
    public void formClientesView(int op){
        try{
            FormClientesController formClientesView = (FormClientesController) switchScene("FormClientesView.fxml", 500, 700);
            formClientesView.setOp(op);
            formClientesView.setStage(this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void menuTicketSoporteView(){
        try{
            MenuTicketSoporteViewController menuTicketSoporteView = (MenuTicketSoporteViewController) switchScene("MenuTicketSoporteView.fxml", 1285, 750);
            menuTicketSoporteView.setStage(this);
        }catch(Exception e){
            System.out.println("e.getMessage()");
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
