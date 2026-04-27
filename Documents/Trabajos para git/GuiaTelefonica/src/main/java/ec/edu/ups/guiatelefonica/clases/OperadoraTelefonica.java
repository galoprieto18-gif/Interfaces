
package ec.edu.ups.guiatelefonica.clases;

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


