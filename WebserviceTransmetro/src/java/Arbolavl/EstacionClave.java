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
public class EstacionClave {
    EstacionClave hijoIzquierdo;
    EstacionClave hijoDerecho;
    EstacionClave padre; 
    int id;
    int nombre;
    String contra;
    int numeroPersonas;
    int fe;

    public EstacionClave(int id, int nombre, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
        this.hijoDerecho=null;
        this.fe=0;
        this.hijoIzquierdo= null;
        this.padre= null;
        this.numeroPersonas=0;
        
    }
    
    
    
}
