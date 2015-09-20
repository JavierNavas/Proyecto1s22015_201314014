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
public class Chofer {
    int id;
    String nombre;
    String apellido;
    String contra;
    int fe;
    Chofer hijoIzquierdo;
    Chofer hijoDerecho;
    Chofer padre;
    ListaBusAsignado Listabuses = new ListaBusAsignado();
    
    public Chofer( int id,String nombre,String apellido,String contra) {
        this.fe = 0;
        this.contra=contra;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
        this.padre=null;
        this.id=id;
        this.apellido=apellido;
        this.nombre=nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
