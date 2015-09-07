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
public class ListaEstacionPasar {
     public EstacionPasar inicio;
     public EstacionPasar fin;
     int tamano;
     
     
      public ListaEstacionPasar(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
      
      public boolean vacio()
	    {
	        return(this.inicio == null);
	    }
      
      public void agregar(EstacionPasar nuevo){
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
      
      public void AgregarInicio(EstacionPasar nuevo){
        if(inicio==null){
        inicio=nuevo;
        }else{
        nuevo.siguiente=inicio;
        inicio.anterior=nuevo;
        inicio=nuevo;
        }
        }
      
      public EstacionPasar eliminar(String nombre)
   {
       EstacionPasar eliminar = null;
       if(!vacio())
       {      EstacionPasar actual = inicio;
              EstacionPasar  anterior = inicio;
           for(int i =0;i<this.tamano;i++)
           {
               if(actual.nombreRuta.equalsIgnoreCase(nombre))
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
      
   public EstacionPasar EliminaInicio(){
		if(vacio()){
		System.out.println("No hay elementos");
		return null;
		}else if(inicio==fin){
		EstacionPasar nuevo=inicio;
	   inicio=fin=null;
		this.tamano--;
		return nuevo;
		}
		else{
		EstacionPasar nuevo=inicio;
		inicio=inicio.siguiente;
		this.tamano--;
		return nuevo;
		}
	}
   
   public EstacionPasar EliminaFinal(){
       if(vacio()) {
       	System.out.println("No hay elementos");
       }
       else{
   		if(inicio==fin){
   		EstacionPasar nuevo=inicio;
   		inicio=fin=null;
   		this.tamano--;
   		return nuevo;
   		}else{
           EstacionPasar actual = inicio;
           EstacionPasar anterior= inicio;
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
   
    public EstacionPasar obtener(String nombre){
	       EstacionPasar temp=inicio;
	    	while(temp!=null){
	    		if (temp.nombreRuta.equals(nombre)){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
    }
    
}
