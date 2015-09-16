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
         if(arbol.insertar("javier", "sda")){
             System.out.println("se inserto xXP");
         }else{
             System.out.println("errrorrrrrr");
         }
         arbol.insertar("navarro", "adasx");
         arbol.insertar("n", "adas");
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
          if(arbol.eliminar("javie")){
               System.out.println("si se elimino");
          }else{
               System.out.println("error");
          }
         arbol.Modificar("o", "jajajja", arbol.getRaiz());
         System.out.println("");
         arbol.recorrerInOrden(arbol.getRaiz());
          System.out.println(arbol.buscar("o",arbol.getRaiz()).contra);
     }
}
