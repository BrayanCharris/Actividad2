/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BrayanCharris
 */
public class ConexionPOST {
    public static final String URL="jdbc:postgresql://localhost:5432/postgres";
    public static Connection connection=null;
    public static void getConnection(){
        try {
            connection=DriverManager.getConnection(URL,"root", "1234");
            JOptionPane.showMessageDialog(null,"Conexion establecida a POSTGRESQL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR POSTGRESQL","ERROR",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
}
