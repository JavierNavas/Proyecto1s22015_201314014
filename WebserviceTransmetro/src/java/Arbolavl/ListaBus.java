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
public class ListaBus {
     public Bus inicio;
     public Bus fin;
     int tamano;
     
     
      public ListaBus(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
      
      public boolean vacio()
	    {
	        return(this.inicio == null);
	    }
      
      public void agregar(Bus nuevo){
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
      
      public void AgregarInicio(Bus nuevo){
        if(inicio==null){
        inicio=nuevo;
        }else{
        nuevo.siguiente=inicio;
        inicio.anterior=nuevo;
        inicio=nuevo;
        }
        }
      
      public Bus eliminar(int dato)
   {
       Bus eliminar = null;
       if(!vacio())
       {      Bus actual = inicio;
              Bus  anterior = inicio;
           for(int i =0;i<this.tamano;i++)
           {
               if(actual.id==dato)
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
      
   public Bus EliminaInicio(){
		if(vacio()){
		System.out.println("No hay elementos");
		return null;
		}else if(inicio==fin){
		Bus nuevo=inicio;
	   inicio=fin=null;
		this.tamano--;
		return nuevo;
		}
		else{
		Bus nuevo=inicio;
		inicio=inicio.siguiente;
		this.tamano--;
		return nuevo;
		}
	}
   
   public Bus EliminaFinal(){
       if(vacio()) {
       	System.out.println("No hay elementos");
       }
       else{
   		if(inicio==fin){
   		Bus nuevo=inicio;
   		inicio=fin=null;
   		this.tamano--;
   		return nuevo;
   		}else{
           Bus actual = inicio;
           Bus anterior= inicio;
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
   
    public Bus obtener(int id){
	       Bus temp=inicio;
	    	while(temp!=null){
	    		if (temp.id==id){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
    }
    
     public boolean existe(int id){
        Bus aux = inicio;
        while(aux!=null){
                if(aux.id==id){
                    System.out.println("hola");
                    return true;
                }
                aux= aux.siguiente;
        }
        return false;
    }
     
    public void ordenar(ListaBus lista){
        
    }
      
    public Bus obtenerpos(int a){
    Bus actual = inicio;
      for(int pos =0;pos<a;pos++){
          if(actual != null){
          actual = actual.siguiente;
          }
          else 
              return null;
      }
    
    return actual;
 }
}
