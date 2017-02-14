/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author DELL
 */
public class Modelo {
    
    public String cedula;
    public String nombres;
    public String apellidos;
    public String titulo_libro;
    public String cod_libro;
    public String fecha;

    public Modelo() {
    }

    public Modelo(String cedula, String nombres, String apellidos, String titulo_libro, String cod_libro, String fecha) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.titulo_libro = titulo_libro;
        this.cod_libro = cod_libro;
        this.fecha = fecha;
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
    
    
    
}
