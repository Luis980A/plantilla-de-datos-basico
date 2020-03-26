/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class Mapa {
   public int indice;
   private HashMap<Integer,Object> lista;
   
   //constructor de la clase
   public Mapa(){}
   //crear el hashmap
   public void crear(){
       lista = new HashMap<Integer,Object>(); 
   }
   //insertar
   public void insertar(int index,Object obj){
       lista.put(index, obj);
   }
   //eliminar
   public void eliminar(int index){
       lista.remove(index);
   }
   //actualizar
   public void actualizar(int index,Object obj){
       lista.replace(index, obj);
   }
   //tamanio de la lista hashmap
   public int tamanio(){
       return lista.size();
   }
   //retornar el hashmap
   public HashMap list(){
       return lista;
   }
   //retornar el Object
   public Object obtener(int indice){
       Object paquete = lista.get(indice);
       return paquete;
   }
}
