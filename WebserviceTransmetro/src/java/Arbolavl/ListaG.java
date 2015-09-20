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
public class ListaG {
    public G inicio;
     public G fin;
     int tamano;
     
     
      public ListaG(){
	        this.inicio= null;
	        this.fin = null;
	        this.tamano = 0;               
	    }
      
      public boolean vacio()
	    {
	        return(this.inicio == null);
	    }
      
      public void agregar(G nuevo){
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
      
      public void AgregarInicio(G nuevo){
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
       {      G actual = inicio;
              G  anterior = inicio;
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
      
   public G EliminaInicio(){
		if(vacio()){
		System.out.println("No hay elementos");
		return null;
		}else if(inicio==fin){
		G nuevo=inicio;
	   inicio=fin=null;
		this.tamano--;
		return nuevo;
		}
		else{
		G nuevo=inicio;
		inicio=inicio.siguiente;
		this.tamano--;
		return nuevo;
		}
	}
   
   public G EliminaFinal(){
       if(vacio()) {
       	System.out.println("No hay elementos");
       }
       else{
   		if(inicio==fin){
   		G nuevo=inicio;
   		inicio=fin=null;
   		this.tamano--;
   		return nuevo;
   		}else{
           G actual = inicio;
           G anterior= inicio;
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
   
    public G obtener(String nombre){
	       G temp=inicio;
	    	while(temp!=null){
	    		if (temp.nombre.equals(nombre)){
	    			return temp;
	    		}
	    		temp=temp.siguiente;
	    	}
	    	return null;
    }
    
     public boolean existe(String nombre){
        G aux = inicio;
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
      
    public G obtenerpos(int a){
     G actual = inicio;
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
		G Actual=inicio;
		while(Actual != null){
		  System.out.println(Actual.nombre+"sii ");
			Actual=Actual.siguiente;
		}
		System.out.println();
	}
}
}
