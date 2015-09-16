/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolavl;

import java.util.Date;

/**
 *
 * @author javier
 */
public class BusAsignado {
    int id;
    int idBus;
    Date fecha;
    ListaHorario listahora = new  ListaHorario();
    BusAsignado siguiente;
    BusAsignado anterior;
   
    public BusAsignado(int id,int idBus,Date fecha) {
        this.id=id;
        this.idBus = idBus;
        this.fecha=fecha;
        this.siguiente=null;
        this.anterior=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
