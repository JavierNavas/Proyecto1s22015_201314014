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
public class ArbolAdmin {
    private Administrador raiz;
    int numero;
    
    public ArbolAdmin() {
      this.raiz=null;
    }
    //Metodo Buscar
    public Administrador buscar(String contra, Administrador r){
        numero= tamaContra(contra);
        if(raiz==null){
            return null;
        }else if(r.id==numero){
            return r;
        }
        else if(r.id<numero){
            return buscar(contra,r.hijoDerecho);
        }else{
            return buscar(contra,r.hijoIzquierdo);
        }
        
    }
    //Tamano en asking de contra
    private int tamaContra(String dato){
        int c=0;
        for (int x=0;x<dato.length();x++){
              c=c+dato.codePointAt(x);
        }
        System.out.println(c);
        return c;
    }
    //factor de equlibrio
    public int obtenerFE(Administrador x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
        }
    }
    //Rotacion Izquierda
    public Administrador rotarIzquierda(Administrador x){
        Administrador aux=x.hijoIzquierdo;
        x.hijoIzquierdo=aux.hijoDerecho;
        aux.hijoDerecho=x;
        x.fe=Math.max(obtenerFE(x.hijoIzquierdo),obtenerFE(x.hijoDerecho))+1;
        aux.fe=Math.max(obtenerFE(aux.hijoIzquierdo),obtenerFE(aux.hijoDerecho))+1;
        return aux;
    }
    
    //Rotacion Derecha
    public Administrador rotarDerecha(Administrador x){
        Administrador aux=x.hijoDerecho;
        x.hijoDerecho=aux.hijoIzquierdo;
        aux.hijoIzquierdo=x;
        x.fe=Math.max(obtenerFE(x.hijoIzquierdo),obtenerFE(x.hijoDerecho))+1;
        aux.fe=Math.max(obtenerFE(aux.hijoIzquierdo),obtenerFE(aux.hijoDerecho))+1;
        return aux;
    }
    
    //Rotacion Doble Derecha
     public Administrador rotarDoblederecha(Administrador x){
         Administrador aux;
         x.hijoDerecho=rotarIzquierda(x.hijoDerecho);
         aux=rotarDerecha(x);
         return aux;
     }
     
     //Rotacion Doble Izquierda
     public Administrador rotarDobleizquierda(Administrador x){
         Administrador aux;
         x.hijoIzquierdo=rotarDerecha(x.hijoIzquierdo);
         aux=rotarIzquierda(x);
         return aux;
     }
}
