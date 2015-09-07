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
public class ListaRuta {
     public Ruta inicio;
     public Ruta fin;
     int tamano;
     
     
      public ListaRuta(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
      
      public boolean vacio()
	    {
	        return(this.inicio == null);
	    }
      
      public void agregar(Ruta nuevo){
		 if(vacio())
	     {
	         inicio = nuevo;
	         fin = nuevo;
	         tamano = 1;
	     }
	     else{
	         fin.siguiente= nuevo;
	         nuevo.anterior=fin;
	         fin=nuevo;
	         tamano++;
	     }
	} 
      
      public int tamano(){
	    return this.tamano;
	}
      
      public void AgregarInicio(Ruta nuevo){
        if(inicio==null){
        inicio=nuevo;
        }else{
        nuevo.siguiente=inicio;
        inicio.anterior=nuevo;
        inicio=nuevo;
        }
        }
      
      public Ruta eliminar(String nombre)
   {
       Ruta eliminar = null;
       if(!vacio())
       {      Ruta actual = inicio;
              Ruta  anterior = inicio;
           for(int i =0;i<this.tamano;i++)
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
       return eliminar;
   }
      
   public Ruta EliminaInicio(){
		if(vacio()){
		System.out.println("No hay elementos");
		return null;
		}else if(inicio==fin){
		Ruta nuevo=inicio;
	   inicio=fin=null;
		this.tamano--;
		return nuevo;
		}
		else{
		Ruta nuevo=inicio;
		inicio=inicio.siguiente;
		this.tamano--;
		return nuevo;
		}
	}
   
   public Ruta EliminaFinal(){
       if(vacio()) {
       	System.out.println("No hay elementos");
       }
       else{
   		if(inicio==fin){
   		Ruta nuevo=inicio;
   		inicio=fin=null;
   		this.tamano--;
   		return nuevo;
   		}else{
           Ruta actual = inicio;
           Ruta anterior= inicio;
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
   
    public Ruta obtener(String nombre){
	       Ruta temp=inicio;
	    	while(temp!=null){
	    		if (temp.nombre.equals(nombre)){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
    }
    
}
