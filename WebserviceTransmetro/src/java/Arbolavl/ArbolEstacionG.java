/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolavl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author javier
 */
public class ArbolEstacionG {
      public ListaG ge= new ListaG();
    private EstacionGeneral raiz;
    int numero;
    int numero2;
    String error="";
    
    public ArbolEstacionG() {
      this.raiz=null;
    }

    public EstacionGeneral getRaiz() {
        return raiz;
    }
    
    //Insertar
    public boolean insertar(int id,String nombre,String contra) {

     EstacionGeneral nuevo= new EstacionGeneral(id,nombre,contra);

     insertarAVL(this.raiz,nuevo);
     if(error.equals("error")){
         error="";
         return false;
     }
     return true;
    }
    
    //Insertar AVL
    
    public void insertarAVL(EstacionGeneral p, EstacionGeneral q) {
  
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
          error="error";
      }
     }
    }
    
    
    public void recursivoBalance(EstacionGeneral cur) {
  
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
    private void setBalance(EstacionGeneral cur) {
      cur.fe = altura(cur.hijoDerecho)-altura(cur.hijoIzquierdo);
    }
    
    //Resegresa la altura
    private int altura(EstacionGeneral cur) {
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
 
 public EstacionGeneral rotarIzquierda(EstacionGeneral n) {
  
  EstacionGeneral v = n.hijoDerecho;
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
 
 
  public EstacionGeneral rotarDerecha(EstacionGeneral n) {
  
  EstacionGeneral v = n.hijoIzquierdo;
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
  
   public EstacionGeneral dobleRotarIzquierdaDerecha(EstacionGeneral u) {
     u.hijoIzquierdo = rotarIzquierda(u.hijoIzquierdo);
   return rotarDerecha(u);
   }
 
   public EstacionGeneral dobleRotarDerechaIzquierda(EstacionGeneral u) {
    u.hijoDerecho = rotarDerecha(u.hijoDerecho);
    return rotarIzquierda(u);
   }
 
 
   public boolean eliminar(int id) {
    eliminarAVL(this.raiz,id);
    if(error.equals("error")){
         error="";
         return false;
     }
     return true;
   }
 
   private int tamaContra(String dato){
        int c=0;
        for (int x=0;x<dato.length();x++){
              c=c+dato.codePointAt(x);
        }
        System.out.println(c);
        return c;
    }
      
   public void eliminarAVL(EstacionGeneral p,int q) {
     if(p==null) {
      System.out.println("El arbol esta vacio");
      error="error";
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
   
   public void eliminarNodoEncontrado(EstacionGeneral q) {
     EstacionGeneral r;
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
      q.nombre=r.nombre;
     }
  
     EstacionGeneral p;
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
   
   
    public EstacionGeneral sucesor(EstacionGeneral q) {
       if(q.hijoDerecho!=null) {
         EstacionGeneral r = q.hijoDerecho;
         while(r.hijoIzquierdo!=null) {
         r = r.hijoIzquierdo;
       }
       return r;
       }else{
        EstacionGeneral p = q.padre;
         while(p!=null && q==p.hijoDerecho) {
         q = p;
         p = q.padre;
         }
       return p;
      }
    }
    
     public void recorrerInOrden(EstacionGeneral x){
          if(x!=null){
              recorrerInOrden(x.hijoIzquierdo);
              System.out.print(x.id+", ");
              recorrerInOrden(x.hijoDerecho);
          }else{
              System.out.print("");
          }
      }
      public void recorrerPreOrden(EstacionGeneral x){
          if(x!=null){
           System.out.print(x.id+", ");
           recorrerPreOrden(x.hijoIzquierdo);
           recorrerPreOrden(x.hijoDerecho);
          }else{
              System.out.print("");
          }
      }
      
      public void recorrerPostOrden(EstacionGeneral x){
          if(x!=null){
           recorrerPostOrden(x.hijoIzquierdo);
           recorrerPostOrden(x.hijoDerecho);
           System.out.print(x.id+", ");
          }else{
              System.out.print("");
          }
      }
      
      //metodo Buscar
      public EstacionGeneral buscar(int id, EstacionGeneral r){
        if(raiz==null){
            return null;
        }else if(r==null){
            return r;
        }else if(r.id==id){
            return r;
        }
        else if(r.id<id){
            return buscar(id,r.hijoDerecho);
        }else if(r.id>id){
            return buscar(id,r.hijoIzquierdo);
        }else{
            return null;
        }
        
    }
   
     
      public boolean Modificar(int idAntiguo,int nuevoid,String nombre,String con){
        EstacionGeneral temp = buscar(idAntiguo,raiz);
        if(eliminar(idAntiguo)){
            if(insertar(nuevoid,nombre,con)){
                //se modifico con exito
            }else{
                //hubo problemas se inserta de nuevo el que se elimino
                insertar(temp.id,temp.nombre,temp.contra);
                return false;   
            }
          return true;
        }else{
           //no se logro la operacion
          return false;
        }
        
    }
      
public static String getDotFile(ArbolEstacionG t){
  StringBuilder sb = new StringBuilder();
  sb.append("digraph G {\n");//escribiendo en sintaxis dot
  sb.append("graph [ dpi = 250 ]\n"); 
  sb.append("nodesep=0.3;\n");
  sb.append("ranksep=0.2;\n");
  sb.append("margin=0.1;\n");
  sb.append("node [shape=circle];\n");
  sb.append("edge [arrowsize=0.8];\n");
  
  StringBuilder treeContent = getDotTreeContent(new StringBuilder(), t.getRaiz(), 1);
  if(treeContent!=null){
  sb.append(treeContent);
  }
  sb.append("}");
  
  return sb.toString();
}


private static StringBuilder getDotTreeContent(StringBuilder sb, EstacionGeneral n, int i){
    if(n!=null){
    sb.append(String.format("node%d [label=\"%s\"];\n", i, "IdNumerico:"+n.id+" Nombre:"+n.nombre+" Password: "+n.contra));
  int lChild = 2*i;
  int rChild = 2*i + 1;
  //codigo personalizado
  if(n.hijoIzquierdo  != null){
    sb.append(String.format("node%d -> node%d;\n", i, lChild));
    getDotTreeContent(sb, n.hijoIzquierdo, lChild);
  }//xppppp
  if(n.hijoDerecho != null){
    sb.append(String.format("node%d -> node%d;\n", i, rChild));
    getDotTreeContent(sb, n.hijoDerecho, rChild);
  }
  return sb;
    }else{
        return null;
    }
}

 public void generartxt(String estructura){
         BufferedWriter b=null;
        try {
            String file="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolAdmi.txt";
            b = new BufferedWriter(new FileWriter(file));
            b.write(estructura);
            b.close();
            } catch (IOException ex) {

            }
	}
 
  public void recorrerPostOrdenM(EstacionGeneral x){
          if(x!=null){
           recorrerPostOrdenM(x.hijoIzquierdo);
           recorrerPostOrdenM(x.hijoDerecho);
            ge.agregar(new G(x.nombre));
          }else{
              
          }
          
      }
}
