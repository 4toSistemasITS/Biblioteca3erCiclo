/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Modelo;
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
    
 
    //
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
    
    
    //Metodo para leer un archivo serializable
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
}
