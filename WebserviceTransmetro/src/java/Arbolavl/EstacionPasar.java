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
     EstacionPasar siguiente;
     EstacionPasar anterior;
     String nombreRuta;

    public EstacionPasar(String nombreRuta) {
        this.siguiente =null;
        this.anterior =null;
        this.nombreRuta=nombreRuta;
    }
}
