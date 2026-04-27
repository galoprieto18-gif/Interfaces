
package ec.edu.ups.guiatelefonica.clases;

/**
 *
 * @author ASUS_USER
 */
public class Telefono {
    private int numero;
    private String tipo;
    //Los siguentes atributos se crean a partir de las relaciones del diagrams
    private Persona unaPersona;
    private OperadoraTelefonica unaOperadora;

    public Telefono(int numero, String tipo, Persona unaPersona, OperadoraTelefonica unaOperadora) {
        this.numero = numero;
        this.tipo = tipo;
        this.unaPersona = unaPersona;
        this.unaOperadora = unaOperadora;
        
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public void setUnaOperadora(OperadoraTelefonica unaOperadora) {
        this.unaOperadora = unaOperadora;
    }
    @Override
    public String toString(){
        String resultado = "Datos del telefono: \n";
        resultado += "Numero de Telefono:" + numero + "\n";
        resultado += "Tipo de telefono: " + tipo + "\n";
        resultado += "Nombre de la Persona:" + unaPersona.getNombre() + "\n";
        resultado += "Nombre de la Operadora:"+ unaOperadora.getNombre()+ "\n";
              
        return resultado; 
    }
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public OperadoraTelefonica getUnaOperadora() {
        return unaOperadora;
    }
    
    
    
   
}
    
