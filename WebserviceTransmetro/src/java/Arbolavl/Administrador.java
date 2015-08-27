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
public class Administrador {
    int id;
    String correo;
    String contra;
    int fe;
    Administrador hijoIzquierdo;
    Administrador hijoDerecho;
    public Administrador(String correo,String contra) {
        this.fe = 0;
        this.correo=correo;
        this.contra=contra;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
        this.id=tamaContra(contra);
    }
    private int tamaContra(String dato){
        int c=0;
        for (int x=0;x<dato.length();x++){
              c=c+dato.codePointAt(x);
        }
        System.out.println(c);
        return c;
    }
}
