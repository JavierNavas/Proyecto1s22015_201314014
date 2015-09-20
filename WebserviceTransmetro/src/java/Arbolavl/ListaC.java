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
public class ListaC {
     public C inicio;
     public C fin;
     int tamano;
     
     
      public ListaC(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
      
      public boolean vacio()
	    {
	        return(this.inicio == null);
	    }
      
      public void agregar(C nuevo){
		 if(vacio())
	     {
	         inicio = nuevo;
	         fin = nuevo;
	         tamano = 1;
                 System.out.println("agregue el primero");
	     }
	     else{
	         fin.siguiente= nuevo;
	         nuevo.anterior=fin;
	         fin=nuevo;
	         tamano++;
                  System.out.println("agreguegado");
	     }
	} 
      
      public int tamano(){
	    return this.tamano;
	}
      
      public void AgregarInicio(C nuevo){
        if(inicio==null){
        inicio=nuevo;
        }else{
        nuevo.siguiente=inicio;
        inicio.anterior=nuevo;
        inicio=nuevo;
        }
        }
      
      public void eliminar(String nombre)
   {
       if(!vacio())
       {      C actual = inicio;
              C  anterior = inicio;
           for(int i =0;i<tamano();i++)
           {
               if(actual.nombre.equals(nombre))
               {
                   if(actual == inicio)
                   {
                       inicio = actual.siguiente;
                   }
                   if(actual == fin)
                   {
                       fin =anterior;
                       if(anterior == null)
                           fin = inicio;
                   }else{
                       anterior.siguiente = actual.siguiente;
                       
                   }
                   this.tamano--;
               }
               anterior = actual;
               actual = actual.siguiente;
           }
                           
       }
   }
      
   public C EliminaInicio(){
		if(vacio()){
		System.out.println("No hay elementos");
		return null;
		}else if(inicio==fin){
		C nuevo=inicio;
	   inicio=fin=null;
		this.tamano--;
		return nuevo;
		}
		else{
		C nuevo=inicio;
		inicio=inicio.siguiente;
		this.tamano--;
		return nuevo;
		}
	}
   
   public C EliminaFinal(){
       if(vacio()) {
       	System.out.println("No hay elementos");
       }
       else{
   		if(inicio==fin){
   		C nuevo=inicio;
   		inicio=fin=null;
   		this.tamano--;
   		return nuevo;
   		}else{
           C actual = inicio;
           C anterior= inicio;
           while(actual.siguiente != null) {
               anterior=actual;
               actual =actual.siguiente;
           }
           anterior.siguiente=null;
           this.tamano--;
           return actual;
   		}
   		
     }
       return null;
   }
   
    public C obtener(String nombre){
	       C temp=inicio;
	    	while(temp!=null){
	    		if (temp.nombre.equals(nombre)){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
    }
    
     public boolean existe(String nombre){
        C aux = inicio;
        while(aux!=null){
                if(aux.nombre.equals(nombre)){
                    System.out.println("hola");
                    return true;
                }
                aux= aux.siguiente;
        }
        return false;
    }
     
    public void ordenar(ListaBus lista){
        
    }
      
    public C obtenerpos(int a){
     C actual = inicio;
      for(int pos =0;pos<a;pos++){
          if(actual != null){
          actual = actual.siguiente;
          }
          else 
              return null;
      }
    
    return actual;
 }
    
 public void imprimir()
{
	if (vacio()){
		System.out.println("la lista esta Vacia" );
	}
	else{
		C Actual=inicio;
		while(Actual != null){
		  System.out.println(Actual.nombre+"sii ");
			Actual=Actual.siguiente;
		}
		System.out.println();
	}
}
}
