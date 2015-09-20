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
public class EstacionPasar {
     public EstacionPasar siguiente;
     public EstacionPasar anterior;
     public String nombreEstacion;

    public EstacionPasar(String nombreEstacion) {
        this.siguiente =null;
        this.anterior =null;
        this.nombreEstacion=nombreEstacion;
    }
}
