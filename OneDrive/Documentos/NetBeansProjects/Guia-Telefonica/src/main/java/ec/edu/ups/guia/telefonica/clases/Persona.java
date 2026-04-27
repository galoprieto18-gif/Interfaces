/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.guia.telefonica.clases;

import java.util.Date;

/**
 *
 * @author ASUS_USER
 */
public class Persona {
    private String cedula; 
    private String nombre;
    private Date fechaDeNacimiento; 
    
    public Persona(String cedula, String nombre, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaNacimiento;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setfechaDeNacimiento(Date fechaNacimiento) {
        this.fechaDeNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getfechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public int calcularEdad(Date fechaActual){
        return fechaActual.getYear()-fechaDeNacimiento.getYear();
        
    }
    public Persona(){
        
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    
    
}
