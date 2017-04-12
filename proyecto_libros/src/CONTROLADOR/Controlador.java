/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Modelo;
import MODELO.ModeloBibliotecario;
import MODELO.ModeloLibros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Controlador {

    public Controlador() {
    }
    
 
    //metodo para escribir en el fichero Registro_Prestamo.obj
    public void EscribirFS(ArrayList<Modelo>lista, File a) throws IOException{
        try {
            //Creamos un objeto de tipo FileOutoutStream
            FileOutputStream fos=new FileOutputStream(a);
            //Creamos un objeto de tipo ObjectOutputStream
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Recorro mi lista para traer los objetos y guardarlos en el archivo
            for(Modelo elemento: lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "Los datos se registraron con exito.");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ControladorSerializable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo el fos");
        }
        
    }
    
    
    //metodo para escribir en el fichero Bibliotecario.obj
    public void EscribirFSBibliotecario(ArrayList<ModeloBibliotecario>lista, File a) throws IOException{
        try {
            //Creamos un objeto de tipo FileOutoutStream
            FileOutputStream fos=new FileOutputStream(a);
            //Creamos un objeto de tipo ObjectOutputStream
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Recorro mi lista para traer los objetos y guardarlos en el archivo
            for(ModeloBibliotecario elemento: lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "Los datos se registraron con exito.");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ControladorSerializable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo el fos");
        }
        
    }
    
    
    //metodo para escribir en el fichero Registro_Libros.obj
    public void EscribirFSLibros(ArrayList<ModeloLibros>lista, File a) throws IOException{
        try {
            //Creamos un objeto de tipo FileOutoutStream
            FileOutputStream fos=new FileOutputStream(a);
            //Creamos un objeto de tipo ObjectOutputStream
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Recorro mi lista para traer los objetos y guardarlos en el archivo
            for(ModeloLibros elemento: lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "Los datos se registraron con exito.");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ControladorSerializable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo el fos");
        }
        
    }
    
    public void BorrarFS(ArrayList<Modelo>lista, File a) throws IOException{
        try {
            //Creamos un objeto de tipo FileOutoutStream
            FileOutputStream fos=new FileOutputStream(a);
            //Creamos un objeto de tipo ObjectOutputStream
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Recorro mi lista para traer los objetos y guardarlos en el archivo
            for(Modelo elemento: lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "El Registro se elimino con éxito.");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ControladorSerializable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo el fos");
        }
        
    }
    
    
    public void ActualizarFS(ArrayList<Modelo>lista, File a) throws IOException{
        try {
            //Creamos un objeto de tipo FileOutoutStream
            FileOutputStream fos=new FileOutputStream(a);
            //Creamos un objeto de tipo ObjectOutputStream
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Recorro mi lista para traer los objetos y guardarlos en el archivo
            for(Modelo elemento: lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "Los datos se actualizaron con exito.");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ControladorSerializable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo el fos");
        }
        
    }
    
    public void ActualizarFSLibros(ArrayList<ModeloLibros>lista, File a) throws IOException{
        try {
            //Creamos un objeto de tipo FileOutoutStream
            FileOutputStream fos=new FileOutputStream(a);
            //Creamos un objeto de tipo ObjectOutputStream
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Recorro mi lista para traer los objetos y guardarlos en el archivo
            for(ModeloLibros elemento: lista){
                oos.writeObject(elemento);
            }
            JOptionPane.showMessageDialog(null, "Los datos se actualizaron con éxito.");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ControladorSerializable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo el fos");
        }
        
    }
    
    
    //Metodo para leer en el archivo Registro_Prestamo.obj
    public ArrayList<Modelo> leerFS(File archivo) throws ClassNotFoundException,IOException{
        //Declaro un objeto de tipo ObjectInputStream
        ObjectInputStream ois=null;
        //Declaro un arraylist de tipo modelo
        ArrayList<Modelo>lista=new ArrayList<Modelo>();
        try {
            FileInputStream fis=new FileInputStream(archivo);
            ois=new ObjectInputStream(fis);
            //Empezamos a leer el fichero mediante el objeto ois
            while(true){
                lista.add((Modelo) ois.readObject());
            }
        } catch (IOException ex) {
            
        }finally{
            
        }
        return lista;
    }
    
    //metodo para leer en archivo Bibliotecario.obj
    public ArrayList<ModeloBibliotecario> leerFSBibliotecario(File archivo) throws ClassNotFoundException,IOException{
        //Declaro un objeto de tipo ObjectInputStream
        ObjectInputStream ois=null;
        //Declaro un arraylist de tipo modelo
        ArrayList<ModeloBibliotecario>lista=new ArrayList<ModeloBibliotecario>();
        try {
            FileInputStream fis=new FileInputStream(archivo);
            ois=new ObjectInputStream(fis);
            //Empezamos a leer el fichero mediante el objeto ois
            while(true){
                lista.add((ModeloBibliotecario) ois.readObject());
            }
        } catch (IOException ex) {
            
        }finally{
            
        }
        return lista;
    }
    
    
    //metodo para leer en archivo Registro_Libros.obj
    public ArrayList<ModeloLibros> leerFSLibros(File archivo) throws ClassNotFoundException,IOException{
        //Declaro un objeto de tipo ObjectInputStream
        ObjectInputStream ois=null;
        //Declaro un arraylist de tipo modelo
        ArrayList<ModeloLibros>lista=new ArrayList<ModeloLibros>();
        try {
            FileInputStream fis=new FileInputStream(archivo);
            ois=new ObjectInputStream(fis);
            //Empezamos a leer el fichero mediante el objeto ois
            while(true){
                lista.add((ModeloLibros) ois.readObject());
            }
        } catch (IOException ex) {
            
        }finally{
            
        }
        return lista;
    }
    
   
    
    public boolean validarFSBibliotecario(File archivo,String nombre,String apellido) throws ClassNotFoundException,IOException{
        //Declaro variable de tipo booleano
        boolean uv=true;
        //Declaro un objeto de tipo ObjectInputStream
        ObjectInputStream ois=null;
        //Declaro un arraylist de tipo modelo
        ArrayList<ModeloBibliotecario>lista=new ArrayList<ModeloBibliotecario>();
        try {
            FileInputStream fis=new FileInputStream(archivo);
            ois=new ObjectInputStream(fis);
            //Empezamos a leer el fichero mediante el objeto ois
            while(true){
                lista.add((ModeloBibliotecario) ois.readObject());
                for(ModeloBibliotecario e:lista){
                    if(e.getNombre().equals(nombre)&& e.getApellido().equals(apellido)){
                        uv=true;
                        break;
                    }else{
                        uv=false;
                    }
                }
            }
        } catch (IOException ex) {
            
        }finally{
            
        }
        return uv;
    }
}
