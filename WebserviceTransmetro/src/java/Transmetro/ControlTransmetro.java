/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transmetro;

import Arbolavl.ArbolAdmin;
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
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarAdministrador")
    public String AgregarAdministrador(@WebParam(name = "correo") String correo, @WebParam(name = "contra") String contra) {
          admin.insertar(correo,contra);
          String mensaje ="se ha ingresado correctamente";
        return mensaje;
    }
}
