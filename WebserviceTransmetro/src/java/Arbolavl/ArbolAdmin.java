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

    public Administrador getRaiz() {
        return raiz;
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
     
     //Balanceamiento
     public Administrador insertarAVL(Administrador nuevo,Administrador subarbol){
         Administrador NuevoPadre=subarbol;
         if(nuevo.id<subarbol.id){
             if(subarbol.hijoIzquierdo==null){
                 subarbol.hijoIzquierdo=nuevo;
             }else{
                 subarbol.hijoIzquierdo=insertarAVL(nuevo,subarbol.hijoIzquierdo);
                 if((obtenerFE(subarbol.hijoIzquierdo)-obtenerFE(subarbol.hijoDerecho))==2){
                     if(nuevo.id<subarbol.hijoIzquierdo.id){
                         NuevoPadre=rotarIzquierda(subarbol);
                     }else{
                          NuevoPadre=rotarDobleizquierda(subarbol);
                     }
                 }
             }
         }else if (nuevo.id>subarbol.id){
             if(subarbol.hijoDerecho==null){
                 subarbol.hijoDerecho=nuevo;
             }else{
                 subarbol.hijoDerecho=insertarAVL(nuevo,subarbol.hijoDerecho);
                if((obtenerFE(subarbol.hijoDerecho)-obtenerFE(subarbol.hijoIzquierdo))==2){
                    if(nuevo.id>subarbol.hijoDerecho.id){
                        NuevoPadre=rotarDerecha(subarbol);
                    }else{
                        NuevoPadre=rotarDoblederecha(subarbol);
                    }
                }
             }
         }else{
             System.out.println("Nodo duplicado no se puede Ingresar");
         }
       //acutalizar FE
       if((subarbol.hijoIzquierdo==null)&&(subarbol.hijoDerecho!=null)){
           subarbol.fe=subarbol.hijoDerecho.fe+1;
       }else if((subarbol.hijoDerecho==null)&&(subarbol.hijoIzquierdo!=null)){
           subarbol.fe=subarbol.hijoIzquierdo.fe+1;
       }else{
           subarbol.fe=Math.max(obtenerFE(subarbol.hijoIzquierdo), obtenerFE(subarbol.hijoDerecho))+1;
       }
       return NuevoPadre;
     }
     //inserta un nodo nuevo
      public void insertar(String correo,String contra){
          Administrador nuevo= new Administrador(correo,contra);
          if(raiz==null){
              raiz=nuevo;
          }else{
              raiz=insertarAVL(nuevo,raiz);
          }
      }
      
      //Recorrer arbol
      public void recorrerInOrden(Administrador x){
          if(x!=null){
              recorrerInOrden(x.hijoIzquierdo);
              System.out.print(x.correo+", ");
              recorrerInOrden(x.hijoDerecho);
          }else{
              System.out.print("");
          }
      }
      public void recorrerPreOrden(Administrador x){
          if(x!=null){
           System.out.print(x.correo+", ");
           recorrerPreOrden(x.hijoIzquierdo);
           recorrerPreOrden(x.hijoDerecho);
          }else{
              System.out.print("");
          }
      }
      
      public void recorrerPostOrden(Administrador x){
          if(x!=null){
           recorrerPostOrden(x.hijoIzquierdo);
           recorrerPostOrden(x.hijoDerecho);
           System.out.print(x.correo+", ");
          }else{
              System.out.print("");
          }
      }
      
      //metodo Eliminar
     public boolean eliminar(String contra){
        numero= tamaContra(contra);
        if (raiz == null)
	{
             System.out.println("Esta vacio");
	      return false;  
        }else{
           Administrador aux=raiz;
           Administrador padre = raiz;
           boolean esHijoIzq=true;
           while(aux.id!=numero){
            padre=aux;
             if(numero==raiz.id){
                 
             }
             else if(numero<aux.id){//se debe ir por la izquierda
                 esHijoIzq=true;
                 aux=aux.hijoIzquierdo;
             }else{
                 esHijoIzq=false;
                 aux=aux.hijoDerecho;
             }
             
             if(aux==null){
                 System.out.println("No se encontro");
                 return false;
             }
           }//fin de while
           if((aux.hijoIzquierdo==null) && (aux.hijoDerecho==null)){//significa que es hoja
               if(aux==raiz){
                   raiz=null;
               }else if(esHijoIzq){
                   padre.hijoIzquierdo=null;
               }
               else{
                   padre.hijoDerecho= null;
               }
           }else if(aux.hijoDerecho==null){
               if(aux==raiz){
                   raiz=aux.hijoIzquierdo;
               }else if(esHijoIzq){
                   padre.hijoIzquierdo=aux.hijoIzquierdo;
               }
               else{
                   padre.hijoDerecho= aux.hijoIzquierdo;
               }
           }else if(aux.hijoIzquierdo==null){
                if(aux==raiz){
                   raiz=aux.hijoDerecho;
               }else if(esHijoIzq){
                   padre.hijoIzquierdo=aux.hijoDerecho;
               }
               else{
                   padre.hijoDerecho= aux.hijoIzquierdo;
               }
           }else{
               Administrador remplazo= obtenerNodoReemplazo(aux);
               if(aux==raiz){
                   raiz=remplazo;
               }else if(esHijoIzq){
                   padre.hijoIzquierdo=remplazo;
               }else{
                   padre.hijoDerecho=remplazo;
               }
               remplazo.hijoIzquierdo=aux.hijoIzquierdo;
           }
           return true;
        }
     }
     
}
