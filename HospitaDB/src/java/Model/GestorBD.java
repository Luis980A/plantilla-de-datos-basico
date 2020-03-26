/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class GestorBD {

    private Connection conector = ConectaBD.abrir();
    ResultSet rs = null;

    public boolean registrar(int cod, String n1, String n2, String a1, String a2, String fecha) {
        Connection conn = null;
        Statement stm;
        ResultSet rs;
        PreparedStatement ps = null;
        int resultUpdate = 0;
        try {
            conn = ConectaBD.abrir();
            ps = conn.prepareStatement("insert into medico (cod_medico, nombre_uno, nombre_dos, apellido_uno, apellido_dos, Fecha_nac) values(?,?,?,?,?,?)");
            ps.setInt(1, cod);
            ps.setString(2, n1);
            ps.setString(3, n2);
            ps.setString(4, a1);
            ps.setString(5, a2);
            ps.setDate(6, Date.valueOf(fecha));
            resultUpdate = ps.executeUpdate();
            if (resultUpdate != 0) {
                ConectaBD.cerrar();
                return true;
            } else {
                ConectaBD.cerrar();
                return false;
            }
        } catch (Exception e) {
            System.err.println("ERROR EN LA BASE DE DATOS: ");
            return false;
        }
    }
    
    public boolean registrar_Paciente(int cod, String n1, String n2, String a1, String a2, String fecha) {
        Connection conn = null;
        Statement stm;
        ResultSet rs;
        PreparedStatement ps = null;
        int resultUpdate = 0;
        try {
            conn = ConectaBD.abrir();
            ps = conn.prepareStatement("insert into paciente (cod_paciente, nombre_uno, nombre_dos, apellido_uno, apellido_dos, Fecha_nac) values(?,?,?,?,?,?)");
            ps.setInt(1, cod);
            ps.setString(2, n1);
            ps.setString(3, n2);
            ps.setString(4, a1);
            ps.setString(5, a2);
            ps.setDate(6, Date.valueOf(fecha));
            resultUpdate = ps.executeUpdate();
            if (resultUpdate != 0) {
                ConectaBD.cerrar();
                return true;
            } else {
                ConectaBD.cerrar();
                return false;
            }
        } catch (Exception e) {
            System.err.println("ERROR EN LA BASE DE DATOS: ");
            return false;
        }
    }

    public ResultSet consultaGlobal(String SQL) {
        try {
            Statement stmt = conector.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            return rs;
        } catch (Exception e) {
            return rs = null;
        }
    }
}
