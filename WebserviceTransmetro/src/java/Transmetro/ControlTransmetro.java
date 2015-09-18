/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transmetro;

import Arbolavl.ArbolAdmin;
import Arbolavl.ArbolChofer;
import Arbolavl.ArbolEstacionC;
import Arbolavl.ArbolEstacionG;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author javier
 */
@WebService(serviceName = "ControlTransmetro")
public class ControlTransmetro {
   ArbolAdmin admin = new ArbolAdmin();
   ArbolChofer chofer = new ArbolChofer();
   ArbolEstacionC estacionClave = new ArbolEstacionC();
   ArbolEstacionG estacionGeneral= new ArbolEstacionG();
           

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarAdministrador")
    public boolean AgregarAdministrador(@WebParam(name = "correo") String correo, @WebParam(name = "contra") String contra) {
          if(admin.insertar(correo,contra)){
              return true;
          }else{
              return false;
          }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarAdministrador")
    public boolean EliminarAdministrador(@WebParam(name = "correo") String correo) {
         if(admin.eliminar(correo)){
              return true;
          }else{
              return false;
          } 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModificarAdmi")
    public boolean ModificarAdmi(@WebParam(name = "correoAntiguo") String correoAntiguo, @WebParam(name = "correoNuevo") String correoNuevo, @WebParam(name = "contraNuevo") String contraNuevo) {
        if(admin.Modificar(correoAntiguo, correoNuevo, contraNuevo)){
              return true;
          }else{
              return false;
          } 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarEstacionG")
    public String AgregarEstacionG(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "contra") String contra) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarEstacionG")
    public String EliminarEstacionG(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModificarEstaciong")
    public String ModificarEstaciong(@WebParam(name = "idantiguo") int idantiguo, @WebParam(name = "idnuevo") int idnuevo, @WebParam(name = "nombrenuevo") String nombrenuevo, @WebParam(name = "contranuevo") String contranuevo) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarEstacionC")
    public String AgregarEstacionC(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "contra") String contra) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarEstacionC")
    public String eliminarEstacionC(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarEstacionC")
    public String modificarEstacionC(@WebParam(name = "idviejo") int idviejo, @WebParam(name = "idnuevo") int idnuevo, @WebParam(name = "nombrenuevo") String nombrenuevo, @WebParam(name = "contranuevo") String contranuevo) {
        //TODO write your implementation code here:
        return null;
    }

   
}
