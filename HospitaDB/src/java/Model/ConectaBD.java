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
    private static String bd = "HOSPITAL";
    public static String usuario = "Hospital";
    public static String passw = "12345";
    public static String url = "jdbc:oracle:thin:@localhot:1521:XE";

    public static Connection abrir() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //con = DriverManager.getConnection(url,usuario,passw);
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            con = DriverManager.getConnection(BaseDeDatos, "Hospital", "12345");
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
