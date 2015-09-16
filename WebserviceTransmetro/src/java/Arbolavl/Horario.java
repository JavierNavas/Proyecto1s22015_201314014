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
public class Horario {
     int id;
     String horaEntrada;
     int idEstacionClave;
     Horario siguiente;
     Horario anterior;

    public Horario(int id,String horaEntrada, int idEstacionClave) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.idEstacionClave=idEstacionClave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getIdEstacionClave() {
        return idEstacionClave;
    }

    public void setIdEstacionClave(int idEstacionClave) {
        this.idEstacionClave = idEstacionClave;
    }
   
     
     
}
