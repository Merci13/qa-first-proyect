/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qafirstproyect;
import db.Conexion;
import db.db_methodos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Jorge Solis
 */
public class main {
    public static void main(String[] args) throws SQLException, Exception {
      try {
            Connection con = Conexion.conection();
            System.out.println("Co");
        } catch (Exception e) {
            System.out.println(e);
        }  
    }
    
}
