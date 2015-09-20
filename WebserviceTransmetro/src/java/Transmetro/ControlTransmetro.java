
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
import Arbolavl.Bus;
import Arbolavl.EstacionPasar;
import Arbolavl.ListaBus;
import Arbolavl.ListaC;
import Arbolavl.ListaEstacionPasar;
import Arbolavl.ListaG;
import Arbolavl.ListaRuta;
import Arbolavl.Ruta;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author javier
 */
@WebService(serviceName = "ControlTransmetro")
public class ControlTransmetro {
   public static ArbolAdmin admin = new ArbolAdmin();
   public static ArbolChofer chofer = new ArbolChofer();
   public static ArbolEstacionC estacionClave = new ArbolEstacionC();
   public static ArbolEstacionG estacionGeneral= new ArbolEstacionG();
   public static ListaBus buses = new ListaBus();        
   public static ListaRuta rutas = new ListaRuta();
   public static ListaEstacionPasar temp= new ListaEstacionPasar();
   int c=0;
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
         if(admin.eliminar(correo,admin.getRaiz())){
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
    public boolean AgregarEstacionG(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "contra") String contra) {
        if(estacionGeneral.insertar(id, nombre, contra)){
        return true;
        }else{
        return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarEstacionG")
    public boolean EliminarEstacionG(@WebParam(name = "id") int id) {
        if(estacionGeneral.eliminar(id)){
        return true;
        }else{
        return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModificarEstaciong")
    public boolean ModificarEstaciong(@WebParam(name = "idantiguo") int idantiguo, @WebParam(name = "idnuevo") int idnuevo, @WebParam(name = "nombrenuevo") String nombrenuevo, @WebParam(name = "contranuevo") String contranuevo) {
        if(estacionGeneral.Modificar(idantiguo,idnuevo, nombrenuevo, contranuevo)){
        return true;
        }else{
        return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarEstacionC")
    public boolean AgregarEstacionC(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "contra") String contra) {
      if(estacionClave.insertar(id, nombre, contra)){
        return true;
        }else{
        return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarEstacionC")
    public boolean eliminarEstacionC(@WebParam(name = "id") int id) {
        if(estacionClave.eliminar(id)){
        return true;
        }else{
        return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarEstacionC")
    public boolean modificarEstacionC(@WebParam(name = "idviejo") int idviejo, @WebParam(name = "idnuevo") int idnuevo, @WebParam(name = "nombrenuevo") String nombrenuevo, @WebParam(name = "contranuevo") String contranuevo) {
        if(estacionClave.Modificar(idviejo,idnuevo, nombrenuevo, contranuevo)){
        return true;
        }else{
        return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "id") String id, @WebParam(name = "contra") String contra, @WebParam(name = "tipo") String tipo) {
        if(tipo.equals("Administrador")){
          if(admin.buscar(id,admin.getRaiz())==null){
              return false;
          }else{
              if(admin.buscar(id,admin.getRaiz()).getCorreo().equals(id)&&admin.buscar(id,admin.getRaiz()).getContra().equals(contra)){
                  return true;
              }
              else{
                  return false;
              }
          }
      }else if(tipo.equals("Estacion Clave")){
          if(estacionClave.buscar(Integer.parseInt(id),estacionClave.getRaiz())==null){
              return false;
          }else{
              if(estacionClave.buscar(Integer.parseInt(id),estacionClave.getRaiz()).getId()==Integer.parseInt(id) && estacionClave.buscar(Integer.parseInt(id),estacionClave.getRaiz()).getContra().equals(contra)){
                  return true;
              }
              else{
                  return false;
              }
          }
      }
      else if(tipo.equals("Estacion General")){
           if(estacionGeneral.buscar(Integer.parseInt(id),estacionGeneral.getRaiz())==null){
              return false;
          }else{
              if(estacionGeneral.buscar(Integer.parseInt(id),estacionGeneral.getRaiz()).getId()==Integer.parseInt(id) && estacionGeneral.buscar(Integer.parseInt(id),estacionGeneral.getRaiz()).getContra().equals(contra)){
                  return true;
              }
              else{
                  return false;
              }
          }
      }
      else if(tipo.equals("Chofer")){
           if(chofer.buscar(Integer.parseInt(id),chofer.getRaiz())==null){
              return false;
          }else{
              if(chofer.buscar(Integer.parseInt(id),chofer.getRaiz()).getId()==Integer.parseInt(id) && chofer.buscar(Integer.parseInt(id),chofer.getRaiz()).getContra().equals(contra)){
                  return true;
              }
              else{
                  return false;
              }
          }
      }
      else{
          return false;
      }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DibujarArbol")
    public String DibujarArbol(@WebParam(name = "tipo") String tipo) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GraficarLista")
    public String GraficarLista(@WebParam(name = "tipo") String tipo) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarChofer")
    public boolean AgregarChofer(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "contra") String contra) {
         if(chofer.insertar(id,nombre,apellido,contra)){
              return true;
          }else{
              return false;
          }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarChofer")
    public boolean eliminarChofer(@WebParam(name = "id") int id) {
        if(chofer.eliminar(id)){
              return true;
          }else{
              return false;
          }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarChofer")
    public boolean modificarChofer(@WebParam(name = "idviejo") int idviejo, @WebParam(name = "idnuevo") int idnuevo, @WebParam(name = "nombrenuevo") String nombrenuevo, @WebParam(name = "apellidonuevo") String apellidonuevo, @WebParam(name = "contranuevo") String contranuevo) {
        if(chofer.Modificar(idviejo,idnuevo,nombrenuevo,apellidonuevo,contranuevo)){
              return true;
          }else{
              return false;
          }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarBus")
    public boolean AgregarBus(@WebParam(name = "id") String id) {
        int idbus=Integer.parseInt(id);
        if(buses.existe(idbus)){
        return false;
        }else{
        Bus nuevo= new Bus(idbus);
        buses.agregar(nuevo);
        return true;
        }  
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AsignarBusChofer")
    public String AsignarBusChofer(@WebParam(name = "idbus") int idbus, @WebParam(name = "idruta") int idruta, @WebParam(name = "idchofer") int idchofer, @WebParam(name = "horainicio") String horainicio, @WebParam(name = "horafinal") String horafinal, @WebParam(name = "fecha") String fecha) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerDot")
    public String ObtenerDot(@WebParam(name = "tipo") String tipo) {
        if(tipo.equals("Administrador")){
        return ArbolAdmin.getDotFile(admin);
        }else if(tipo.equals("Chofer")){
            return ArbolChofer.getDotFile(chofer);
        }else if(tipo.equals("EstacionClave")){
            return ArbolEstacionC.getDotFile(estacionClave);
        }else if(tipo.equals("EstacionGeneral")){
            return ArbolEstacionG.getDotFile(estacionGeneral);
        }else if(tipo.equals("Bus")){
            return ArbolChofer.getDotFile(chofer);
        }else{
            return "";
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarBus")
    public boolean EliminarBus(@WebParam(name = "id") String id) {
        int idbus=Integer.parseInt(id);
        if(buses.existe(idbus)){
        buses.eliminar(idbus);
        return true;
        }else{
        return false;
        }  
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenertamanoc")
    public int obtenertamanoc() {
         if(estacionClave.getRaiz()!=null){
           estacionClave.ce=new ListaC();
        }
        estacionClave.recorrerPostOrdenM(estacionClave.getRaiz());
        int tamano=estacionClave.ce.tamano();
        return tamano;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerc")
    public String obtenerc(@WebParam(name = "pos") int pos) {
        String nombre=estacionClave.ce.obtenerpos(pos).nombre;
        return nombre;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenertamanoG")
    public int obtenertamanoG() {
        if(estacionGeneral.getRaiz()!=null){
           estacionGeneral.ge=new ListaG();
        }
        estacionGeneral.recorrerPostOrdenM(estacionGeneral.getRaiz());
        int tamano=estacionGeneral.ge.tamano();
        return tamano;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerG")
    public String obtenerG(@WebParam(name = "pos") int pos) {
        String nombre=estacionGeneral.ge.obtenerpos(pos).nombre;
        return nombre;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarRuta")
    public boolean agregarRuta(@WebParam(name = "nombre") String nombre) {
        if(rutas.existe(nombre)){
        return false;
        }else{
        Ruta nueva = new Ruta(nombre);
        nueva.lista=temp;
        rutas.agregar(nueva);
        temp=new  ListaEstacionPasar();
        return true;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarRuta")
    public boolean eliminarRuta(@WebParam(name = "nombre") String nombre) {
        if(rutas.existe(nombre)){
        rutas.eliminar(nombre);
        return true;
        }else{
             return false;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarestaciontemp")
    public boolean agregarestaciontemp(@WebParam(name = "nombre") String nombre) {
        if(temp.existe(nombre)){
            return false;
        }else{
        EstacionPasar nuevo = new EstacionPasar(nombre);
        temp.agregar(nuevo);
        return true;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenertamanotemp")
    public int obtenertamanotemp() {
        return temp.tamano();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerestaciontemp")
    public String obtenerestaciontemp(@WebParam(name = "id") int id) {
        String nombre=temp.obtenerpos(id).nombreEstacion;
        return nombre;
    }
    

   
    

   
}
