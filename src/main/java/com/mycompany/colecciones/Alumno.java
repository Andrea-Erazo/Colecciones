/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.colecciones;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private int carnet;
    private String nombre;
    private String apellidos;
    private String correo;

    public Alumno() {
    }

    public Alumno(int carnet, String nombre, String apellidos, String correo) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}
