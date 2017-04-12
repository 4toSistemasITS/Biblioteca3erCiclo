/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class ModeloLibros implements Serializable{
    public String Titulo;
    public String Autor;
    public String Codigo;

    public ModeloLibros() {
    }

    public ModeloLibros(String Titulo, String Autor, String Codigo) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

   
    //metodo para buscar por titulo de libro
    public boolean BuscarLibro(String inicio){
        if(inicio.isEmpty()||inicio.length()>Titulo.length())
            return false;
        for (int i=0;i<inicio.length();++i)
            if (inicio.charAt(i)!=Titulo.charAt(i))
                return false;
        return true;
        
    }
    
    
    
    
}
