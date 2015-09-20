/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolavl;

/**
 *
 * @author javier
 */
public class Ruta {
     Ruta siguiente;
     Ruta anterior;
     public int id;
     public String nombre;
     public ListaEstacionPasar lista= new ListaEstacionPasar () ;

    public Ruta(String nombre) {
        this.nombre= nombre;
        this.siguiente= null;
        this.anterior= null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
     
     
}
