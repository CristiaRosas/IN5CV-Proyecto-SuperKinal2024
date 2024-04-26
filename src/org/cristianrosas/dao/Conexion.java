/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianrosas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Conexion {
    private static Conexion instance;
    private String url = "jdbc:mysql://localhost:3306/superKinalIN5CV?serverTimezone=GMT-6";
    private String user = "CristianRosas"; // Cambiar esto dependiendo de donde esta la Db
    private String password = "Cristia3430U"; // Cambiar esto dependiendo de donde esta la Db
    
    private Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static Conexion getInstance(){
        if(instance == null){
            instance = new Conexion();
        }
        return instance;
    }
    
    public Connection obtenerConexion()throws SQLException{
        return DriverManager.getConnection(url, user, password);
        
    }
}
