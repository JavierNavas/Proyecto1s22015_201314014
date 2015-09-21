package controles;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javier
 */
public class Leer {
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
		       String fileOutputPath="C:\\Users\\javier\\Documents\\Proyecto1s22015_201314014\\WebCliente\\web\\images\\ArbolAdmi.jpg";
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
  
  
     public void generartxtchofer(String estructura){
         BufferedWriter b=null;
        try {
            String file="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolChofer.txt";
            b = new BufferedWriter(new FileWriter(file));
            b.write(estructura);
            b.close();
            } catch (IOException ex) {

            }
	}
 
  public void generarchofer(){
		   try{
		       String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
		       String fileInputPath="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolChofer.txt";
		       String fileOutputPath="C:\\Users\\javier\\Documents\\Proyecto1s22015_201314014\\WebCliente\\web\\images\\ArbolChofer.jpg";
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
  
  
  
    public void generartxtc(String estructura){
         BufferedWriter b=null;
        try {
            String file="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolC.txt";
            b = new BufferedWriter(new FileWriter(file));
            b.write(estructura);
            b.close();
            } catch (IOException ex) {

            }
	}
 
  public void generarc(){
		   try{
		       String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
		       String fileInputPath="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolC.txt";
		       String fileOutputPath="C:\\Users\\javier\\Documents\\Proyecto1s22015_201314014\\WebCliente\\web\\images\\ArbolEstacionC.jpg";
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
  
   public void generartxtg(String estructura){
         BufferedWriter b=null;
        try {
            String file="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolG.txt";
            b = new BufferedWriter(new FileWriter(file));
            b.write(estructura);
            b.close();
            } catch (IOException ex) {

            }
	}
 
  public void generarg(){
		   try{
		       String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
		       String fileInputPath="C:\\Users\\javier\\Documents\\Bluetooth Folder\\arbolG.txt";
		       String fileOutputPath="C:\\Users\\javier\\Documents\\Proyecto1s22015_201314014\\WebCliente\\web\\images\\ArbolEstacionG.jpg";
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
  
  
  public void generartxtbus(String estructura){
         BufferedWriter b=null;
        try {
            String file="C:\\Users\\javier\\Documents\\Bluetooth Folder\\ListaBus.txt";
            b = new BufferedWriter(new FileWriter(file));
             b.write("graph G");
	         b.write("{");
            b.write(estructura);
              b.write("}");
            b.close();
            
            } catch (IOException ex) {

            }
	}
 
  public void generarbus(){
		   try{
		       String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
		       String fileInputPath="C:\\Users\\javier\\Documents\\Bluetooth Folder\\ListaBus.txt";
		       String fileOutputPath="C:\\Users\\javier\\Documents\\Proyecto1s22015_201314014\\WebCliente\\web\\images\\ListaBus.jpg";
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
