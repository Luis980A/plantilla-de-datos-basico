/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class ConectaBD {


    public static Connection con;
    private static String bd = "factura";
    public static String usuario = "root";
    public static String passw = "rootluis";
    public static String url = "jdbc:mysql://localhost:3306/";

    public static Connection abrir() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url+bd+"?/autoReconnect=true&useSSL=false",usuario,passw);
            System.out.println("conectado a base de datos " + bd);
        } catch (Exception e) {
            System.err.println("Error en la coneccion: " + e.getMessage());
        }
        return con;
    }

    public static void cerrar() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.err.println("Error: no se puede cerrar la coneccion a " + bd);
        }
    }
    
}
