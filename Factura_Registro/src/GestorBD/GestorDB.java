package GestorBD;

import Model.ConectaBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GestorDB {

    private ConectaBD conexion = new ConectaBD();
    private Statement st;
    private ResultSet rs;
    private Connection conn;
    private PreparedStatement ps;
    
    //verifica si existe usuario y le darle acceso
    public boolean verificador(String correo, String passw) {
        conn = conexion.abrir();
        String passC = null;
        String passW = null;
        try {
            Statement stmt = conn.createStatement();
            String SQL = "SELECT correo,contrasenia FROM usuario WHERE correo='" + correo + "' and contrasenia='" + passw + "';";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                passC = rs.getString("correo");
                passW = rs.getString("contrasenia");
            }
            System.out.println(passC + " " + passW);
            if (passW.equals(passw)) {
                if (passC.equals(correo)) {
                    return true;
                }else{
                   JOptionPane.showMessageDialog(null, "usuario no valido"); 
                }
            } else {
                JOptionPane.showMessageDialog(null, "password no valido");
                ConectaBD.cerrar();
                return false;
            }
        } catch (Exception e) {
            System.err.println("ERROR EN LA BASE DE DATOS: " + e);
        }
        return false;
    }
    
     //enviar queery este metodo funciona para insertar y modificar
     public void InsertarOfModificar(String SQL) {
        Connection conect = conexion.abrir();
        try {
            PreparedStatement pst = conect.prepareStatement(SQL);
            int res = pst.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "OPERACION EXITOSA");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Registro");
            }

            conect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Revise los datos algo tecleo mal ?");
            System.err.println(e);
        }
    }
     
    //borra un registro mandando la tabla y la condicion del registro de la llave primaria
    public void EliminarBD(String tabla, String condicion) {
        Connection conect = conexion.abrir();
        try {
            PreparedStatement pst = conect.prepareStatement("DELETE FROM "+tabla+" "+condicion);
           
            int res = pst.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error No Existe Ese Registro");
            }

            conect.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Revise los datos algo tecleo mal ?");
            System.err.println(e.getCause());
        }
    }
    
    //selecionar todos los campos de una tabla
    public ResultSet SeleccionarTodos(String table) {
        Connection conect = conexion.abrir();
        try {
            st = conect.createStatement();
            rs = st.executeQuery("select * from " + table);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return rs;
    }
}
