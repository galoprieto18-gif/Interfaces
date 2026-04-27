/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.guia.telefonica.clases;

/**
 *
 * @author ASUS_USER
 */
public class OperadoraTelefonica {
    
    private int codigo;
    private String nombre; 
    
    
    public OperadoraTelefonica( int codigo, String nombre) {
        
        this.codigo = codigo;
        this.nombre = nombre;
   
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public OperadoraTelefonica() {
        
    }
    
}
