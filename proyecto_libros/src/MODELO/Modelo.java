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
public class Modelo implements Serializable{
    
    public String cedula;
    public String nombres;
    public String apellidos;
    public String titulo_libro;
    public String cod_libro;
    public String fecha;
    public String Empleado;

    public Modelo() {
}

    public Modelo(String cedula, String nombres, String apellidos, String titulo_libro, String cod_libro, String fecha, String Empleado) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.titulo_libro = titulo_libro;
        this.cod_libro = cod_libro;
        this.fecha = fecha;
        this.Empleado = Empleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public String getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(String cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }
    
    
    //metodo para buscar por numero de cedula
    public boolean BuscarPrestamo(String inicio){
        if(inicio.isEmpty()||inicio.length()>cedula.length())
            return false;
        for (int i=0;i<inicio.length();++i)
            if (inicio.charAt(i)!=cedula.charAt(i))
                return false;
        return true;
        
    }
    
   
    
    
}
