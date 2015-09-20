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
public class EstacionGeneral {
    EstacionGeneral hijoIzquierdo;
    EstacionGeneral hijoDerecho;
    EstacionGeneral padre; 
    int id;
    String nombre;
    String contra;
    int numeroPersonas;
    int fe;

    public EstacionGeneral(int id, String nombre, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
        this.hijoDerecho=null;
        this.fe=0;
        this.hijoIzquierdo= null;
        this.padre= null;
        numeroPersonas=0;
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

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    
}
