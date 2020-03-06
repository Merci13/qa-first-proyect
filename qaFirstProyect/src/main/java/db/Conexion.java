/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.*;
/**
 *
 * @author josue
 */
public class Conexion {
    
    public Asociate conection(){
    
     Asociate asociate = new Asociate();
        
           String url = "jdbc:postgresql://localhost:5432/proyectoQAJorgeSolis";
    String user = "postgress";
    String password = "elo2016";
    try{
        
        
    
   Class.forName("org.postgresql.Driver");
   Connection conection = DriverManager.getConnection(url, user, password);
   java.sql.Statement st = conection.createStatement();
   String sql = "SELECT asociate.id,asociate.name,asociate.line,asociate.last_name, asociate_status FROM asociates" ;
   ResultSet result = st.executeQuery(sql);
    while(result.next()){
        int id = result.getInt("asociate.id");
        String name = result.getString("asociate.name");
        int line = result.getInt("asociate.line");
        String lastName = result.getString("asociate.last_name");
        boolean status = result.getBoolean("asociate_status");
        asociate = new asociate(id, name, line, lastName, status);
       
    
    }
    result.close();
    st.close();
    conection.close();
    
        System.out.println(""+asociate.toString());
        System.out.println("blanabasfsd");
    estaloco();
}catch(Exception e){
    
        System.out.println("Error de coneccion " + e);
}

        
    }

    
    }
    
    
    
}
