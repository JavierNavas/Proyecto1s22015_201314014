/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbolavl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class ArbolAdmin {
    private Administrador raiz;
    int numero;
    int numero2;
    String error="";
    
    public ArbolAdmin() {
      this.raiz=null;
    }

    public Administrador getRaiz() {
        return raiz;
    }
    
    //Insertar
    public boolean insertar(String correo,String contra) {

     Administrador nuevo= new Administrador(correo,contra);

     insertarAVL(this.raiz,nuevo);
     if(error.equals("error")){
         error="";
         return false;
     }
     return true;
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
          error="error";
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
 
 
   public boolean eliminar(String correo) {
    numero=tamaContra(correo);
    eliminarAVL(this.raiz,numero);
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
      
   public void eliminarAVL(Administrador p,int q) {
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
   
     
      public boolean Modificar(String correoAntiguo,String nuevocorreo,String con){
        Administrador temp = buscar(correoAntiguo,raiz);
        if(eliminar(correoAntiguo)){
            if(insertar(nuevocorreo,con)){
                //se modifico con exito
            }else{
                //hubo problemas se inserta de nuevo el que se elimino
                insertar(temp.correo,temp.contra);
                return false;   
            }
          return true;
        }else{
           //no se logro la operacion
          return false;
        }
        
    }
      
public static String getDotFile(ArbolAdmin t){
  StringBuilder sb = new StringBuilder();
  sb.append("digraph G {\n");//escribiendo en sintaxis dot
  sb.append("graph [ dpi = 250 ]\n"); 
  sb.append("nodesep=0.3;\n");
  sb.append("ranksep=0.2;\n");
  sb.append("margin=0.1;\n");
  sb.append("node [shape=circle];\n");
  sb.append("edge [arrowsize=0.8];\n");
  
  StringBuilder treeContent = getDotTreeContent(new StringBuilder(), t.getRaiz(), 1);
  sb.append(treeContent);
  
  sb.append("}");
  
  return sb.toString();
}


private static StringBuilder getDotTreeContent(StringBuilder sb, Administrador n, int i){
    sb.append(String.format("node%d [label=\"%s\"];\n", i, "Correo:"+n.correo+" Password: "+n.contra));
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
 
  public void generar(){
		   try{
		       String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
		       String fileInputPath="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolAdmi.txt";
		       String fileOutputPath="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolAdmi.jpg";
		       String tParam="-Tjpg";
		       String toParam="-o";
		       String[]cmd= new String[5];
		       cmd[0]=dotPath;
		       cmd[1]=tParam;
		       cmd[2]=fileInputPath;
		       cmd[3]=toParam;
		       cmd[4]= fileOutputPath; 
		       Runtime rt = Runtime.getRuntime();
		       rt.exec(cmd);
		   }catch(Exception ex){
		       ex.printStackTrace();
		   }  finally {
		 }
		}
}
