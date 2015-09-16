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

   
}
