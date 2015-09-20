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
public class Nodo {
     public static void main(String[] args) {
         ArbolAdmin arbol = new ArbolAdmin();
         ArbolEstacionC esta= new ArbolEstacionC();
        arbol.generartxt(ArbolAdmin.getDotFile(arbol));
         ListaBus bus= new ListaBus();
         if(arbol.eliminar("noooooooo",arbol.getRaiz())){
           System.out.println("si se elimino");
          }else{
               System.out.println("error");
          }
         if(arbol.insertar("javier", "sda")){
             System.out.println("se inserto xXP");
         }else{
             System.out.println("errrorrrrrr");
         }
         arbol.insertar("navarro", "adasx");
         arbol.insertar("n", "adas");
          arbol.insertar("milton", "prueba");
         arbol.insertar("noooooooo", "adas");
         arbol.insertar("o", "adasf");
         if(arbol.insertar("navarro", "da")){
             System.out.println("se inserto XP");
         }else{
             System.out.println("errrorrrrrr");
         }
         arbol.recorrerPostOrden(arbol.getRaiz());
         System.out.println("");
         arbol.recorrerInOrden(arbol.getRaiz());
         System.out.println(arbol.buscar("navarro",arbol.getRaiz()).contra);
          if(arbol.eliminar("noooooooo",arbol.getRaiz())){
               System.out.println("si se elimino");
          }else{
               System.out.println("error");
          }
         System.out.println("");
         arbol.recorrerInOrden(arbol.getRaiz());
          
         arbol.Modificar("javier", "javiernavarro", "prueba");
         arbol.generartxt(ArbolAdmin.getDotFile(arbol));
         arbol.generar();
         Bus uno = new Bus(0);
         Bus dos = new Bus(2);
         bus.agregar(uno);
         bus.agregar(dos);
         System.out.println(bus.existe(2));
         System.out.println(bus.obtenerpos(0).id);
         for(int i=0;i<bus.tamano;i++){
             System.out.println(bus.obtenerpos(i).id+"ja");
         }
         esta.insertar(1,"guajos", "hola1");
         esta.insertar(2,"justo", "hola2");
         esta.insertar(3,"vene", "hola3"); 
         esta.recorrerPostOrdenM(esta.getRaiz());
         for(int i=0;i<esta.ce.tamano();i++){
         System.out.println(esta.ce.obtenerpos(i).nombre);
         }
         
        if(esta.getRaiz()!=null){
           esta.ce=new ListaC();
        }
        System.out.println(esta.ce.tamano());
     }
}
