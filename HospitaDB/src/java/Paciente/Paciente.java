/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

/**
 *
 * @author HP
 */
public class Paciente {
    private int cod_paciente;
    private String nombre_uno;
    private String nombre_dos;
    private String apellido_uno;
    private String apellido_dos;
    private String fecha_nac;

    public Paciente() {
    }

    public void New_Paciente(String cod_paciente, String nombre_uno, String nombre_dos, String apellido_uno, String apellido_dos, String fecha_nac) {
        this.cod_paciente = Integer.valueOf(cod_paciente);
        this.nombre_uno = nombre_uno;
        this.nombre_dos = nombre_dos;
        this.apellido_uno = apellido_uno;
        this.apellido_dos = apellido_dos;
        this.fecha_nac = fecha_nac;
    }

    public int getCod_paciente() {
        return cod_paciente;
    }

    public void setCod_paciente(int cod_paciente) {
        this.cod_paciente = cod_paciente;
    }

    public String getNombre_uno() {
        return nombre_uno;
    }

    public void setNombre_uno(String nombre_uno) {
        this.nombre_uno = nombre_uno;
    }

    public String getNombre_dos() {
        return nombre_dos;
    }

    public void setNombre_dos(String nombre_dos) {
        this.nombre_dos = nombre_dos;
    }

    public String getApellido_uno() {
        return apellido_uno;
    }

    public void setApellido_uno(String apellido_uno) {
        this.apellido_uno = apellido_uno;
    }

    public String getApellido_dos() {
        return apellido_dos;
    }

    public void setApellido_dos(String apellido_dos) {
        this.apellido_dos = apellido_dos;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
}
