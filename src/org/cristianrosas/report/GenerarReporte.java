
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.report;

import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.cristianrosas.dao.Conexion;
import win.zqxu.jrviewer.JRViewerFX;

/**
 *
 * @author informatica
 */
public class GenerarReporte {
    private static GenerarReporte instance;
    private static Connection conexion;
    
    private GenerarReporte(){
        
    }
    
    public static GenerarReporte getInstance(){
        if(instance == null){
            instance = new GenerarReporte();
        }
        
        return instance;
    }
    
    public void generarFactura(int factId){
        try{
            //paso 1: abrir la conexion a la DB
            conexion = Conexion.getInstance().obtenerConexion();
            // paso 2: definir los parametros de la DB
            Map<String, Object>parametros = new HashMap<>();
            parametros.put("factId", factId);
            // paso 3: crear el reporte
            InputStream jasperPath = GenerarReporte.class.getResourceAsStream("/org/cristianrosas/report/Factura.jasper");
            JasperPrint reporte = JasperFillManager.fillReport(jasperPath, parametros, conexion);
            // paso 4: crear la ventana de javaFX para mostrar el reporte
            Stage reportStage = new Stage();
            // paso 5: llenar el stage con el reporte
            JRViewerFX reportViewer = new JRViewerFX(reporte);
            
            Pane root = new Pane();
            
            root.getChildren().add(reportViewer);
            
            reportViewer.setPrefSize(1000, 800);
            
            Scene scene = new Scene(root);
            reportStage.setScene(scene);
            reportStage.setTitle("factura");
            reportStage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    

}