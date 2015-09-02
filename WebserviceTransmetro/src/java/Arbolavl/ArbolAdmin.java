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
    
    //Insertar
    public void insertar(String correo,String contra) {

     Administrador nuevo= new Administrador(correo,contra);

     insertarAVL(this.raiz,nuevo);
    }
    
    //Insertar AVL
    
    public void insertarAVL(Administrador p, Administrador q) {
  
      if(p==null) {
           this.raiz=q;
      } else {
   
   
      if(q.id<p.id) {
       if(p.hijoIzquierdo==null) {
        p.hijoIzquierdo = q;
        q.padre = p;
         recursivoBalance(p);
      } else {
        insertarAVL(p.hijoIzquierdo,q);
      }
     } else if(q.id>p.id) {
      if(p.hijoDerecho==null) {
      p.hijoDerecho = q;
      q.padre = p;
      recursivoBalance(p);
      } else {
      insertarAVL(p.hijoDerecho,q);
     }
     } else {
      // No hace nada ya existe ese nodo
      }
     }
    }
    
    
    public void recursivoBalance(Administrador cur) {
  
       setBalance(cur);
       int balance = cur.fe;
  
     // verificamos el balanceo
     if(balance==-2) {
   
     if(altura(cur.hijoIzquierdo.hijoIzquierdo)>=altura(cur.hijoIzquierdo.hijoDerecho)) {
        cur = rotarDerecha(cur);
       } else {
     cur = dobleRotarIzquierdaDerecha(cur);
       }
     } else if(balance==2) {
     if(altura(cur.hijoDerecho.hijoDerecho)>=altura(cur.hijoDerecho.hijoIzquierdo)) {
      cur = rotarIzquierda(cur);
     } else {
      cur = dobleRotarDerechaIzquierda(cur);
     }
    }
  
    // No llega a la raiz
     if(cur.padre!=null) {
     recursivoBalance(cur.padre);
     } else {
      this.raiz = cur;
       System.out.println("------------ Balance Finalizado----------------");
     }
    }
    
    //regresa el factor de equilibrio
    private void setBalance(Administrador cur) {
      cur.fe = altura(cur.hijoDerecho)-altura(cur.hijoIzquierdo);
    }
    
    //Resegresa la altura
    private int altura(Administrador cur) {
      if(cur==null) {
      return -1;
      }
      if(cur.hijoIzquierdo==null && cur.hijoDerecho==null) {
      return 0;
      } else if(cur.hijoIzquierdo==null) {
      return 1+altura(cur.hijoDerecho);
      } else if(cur.hijoDerecho==null) {
       return 1+altura(cur.hijoIzquierdo);
      } else {
        return 1+maximo(altura(cur.hijoIzquierdo),altura(cur.hijoDerecho));
      }
    }
 
 //Regresa el numero mas grande
 private int maximo(int a, int b) {
     if(a>=b) {
      return a;
     } else {
      return b;
     }
 }
 
 public Administrador rotarIzquierda(Administrador n) {
  
  Administrador v = n.hijoDerecho;
  v.padre = n.padre;
  
  n.hijoDerecho = v.hijoIzquierdo;
  
  if(n.hijoDerecho!=null) {
   n.hijoDerecho.padre=n;
  }
  
  v.hijoIzquierdo = n;
  n.padre = v;
  
  if(v.padre!=null) {
   if(v.padre.hijoDerecho==n) {
    v.padre.hijoDerecho = v;
   } else if(v.padre.hijoIzquierdo==n) {
    v.padre.hijoIzquierdo = v;
   }
  }
  
  setBalance(n);
  setBalance(v);
  
  return v;
 }
 
 
  public Administrador rotarDerecha(Administrador n) {
  
  Administrador v = n.hijoIzquierdo;
  v.padre = n.padre;
  
  n.hijoIzquierdo = v.hijoDerecho;
  
  if(n.hijoIzquierdo!=null) {
   n.hijoIzquierdo.padre=n;
  }
  
  v.hijoDerecho = n;
  n.padre = v;
  
  
  if(v.padre!=null) {
   if(v.padre.hijoDerecho==n) {
    v.padre.hijoDerecho = v;
   } else if(v.padre.hijoIzquierdo==n) {
    v.padre.hijoIzquierdo = v;
   }
  }
  
  setBalance(n);
  setBalance(v);
  
  return v;
 }
  
   public Administrador dobleRotarIzquierdaDerecha(Administrador u) {
     u.hijoIzquierdo = rotarIzquierda(u.hijoIzquierdo);
   return rotarDerecha(u);
   }
 
   public Administrador dobleRotarDerechaIzquierda(Administrador u) {
    u.hijoDerecho = rotarDerecha(u.hijoDerecho);
    return rotarIzquierda(u);
   }
 
 
   public void eliminar(String correo) {
    numero=tamaContra(correo);
    eliminarAVL(this.raiz,numero);
   }
 
   private int tamaContra(String dato){
        int c=0;
        for (int x=0;x<dato.length();x++){
              c=c+dato.codePointAt(x);
        }
        System.out.println(c);
        return c;
    }
      
   public void eliminarAVL(Administrador p,int q) {
     if(p==null) {
      System.out.println("El arbol esta vacio");
      return;
     }else{
      if(p.id>q)  {
       eliminarAVL(p.hijoIzquierdo,q);
      } else if(p.id<q) {
      eliminarAVL(p.hijoDerecho,q);
      } else if(p.id==q) {
      eliminarNodoEncontrado(p);
      }
     }
   }
   
   public void eliminarNodoEncontrado(Administrador q) {
     Administrador r;
      if(q.hijoIzquierdo==null || q.hijoDerecho==null) {
       if(q.padre==null) {
        this.raiz=null;
         q=null;
         return;
        }
        r = q;
      } else {
      r = sucesor(q);
      q.id = r.id;
      q.contra=r.contra;
      q.correo=r.correo;
     }
  
     Administrador p;
     if(r.hijoIzquierdo!=null) {
     p = r.hijoIzquierdo;
     }else{
      p = r.hijoDerecho;
     }
  
      if(p!=null) {
       p.padre = r.padre;
      }
  
     if(r.padre==null) {
     this.raiz = p;
     }else {
     if(r==r.padre.hijoIzquierdo) {
       r.padre.hijoIzquierdo=p;
     } else {
       r.padre.hijoDerecho = p;
      }
   // balanceando
      recursivoBalance(r.padre);
     }
     r = null;
    }
   
   
    public Administrador sucesor(Administrador q) {
       if(q.hijoDerecho!=null) {
         Administrador r = q.hijoDerecho;
         while(r.hijoIzquierdo!=null) {
         r = r.hijoIzquierdo;
       }
       return r;
       }else{
         Administrador p = q.padre;
         while(p!=null && q==p.hijoDerecho) {
         q = p;
         p = q.padre;
         }
       return p;
      }
    }
    
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
      
      //metodo Buscar
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
      
     public Administrador Modificar(String contra,String con, Administrador r){
        numero= tamaContra(contra);
        if(raiz==null){
            return null;
        }else if(r.id==numero){
            r.contra=con;
            return r;
        }
        else if(r.id<numero){
            return Modificar(contra,con,r.hijoDerecho);
        }else{
            return Modificar(contra,con,r.hijoIzquierdo);
        }
        
    }
    //Metodo Buscar
    /*public Administrador buscar(String contra, Administrador r){
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
      }*/
     
      //metodo Eliminar
    /* public boolean eliminar(String contra){
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
     }*/
     
    
      
}
