/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Fichero {

    private FileOutputStream fos;
    private DataOutputStream salida;
    private FileInputStream fis;
    private DataInputStream entrada;

    public void escribir(int index) {
        try {
            fos = new FileOutputStream("/Data/producto.dat");
            salida = new DataOutputStream(fos);
            try {
                salida.writeInt(index);
            } catch (IOException ex) {
                Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
    }

    public int lectura() {
        int indice = 0;
        try {
            fis = new FileInputStream("/Data/productos.dat");
            entrada = new DataInputStream(fis);
            while (true) {   
                indice = entrada.readInt();  //se lee  un entero del fichero
                System.out.println(indice);  //se muestra en pantalla
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return indice;
    }
}
