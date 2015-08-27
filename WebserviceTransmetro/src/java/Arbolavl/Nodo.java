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
         arbol.insertar("javier", "sda");
         arbol.insertar("navarro", "adas");
         arbol.insertar("n", "adas");
         arbol.insertar("noooooooo", "adas");
         arbol.insertar("o", "adas");
         arbol.recorrerPostOrden(arbol.getRaiz());
     }
}
