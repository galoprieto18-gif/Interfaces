
package ec.edu.ups.ejemplo.clases;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ASUS_USER
 */
public class EsquemaRaton implements MouseListener {
@Override
public void mouseClicked(MouseEvent evento) {
    Frame MiMarco = new Frame();
      java.awt.Panel EntradaDeDatos = new java.awt.Panel(new FlowLayout());
      TextField Nombre = new TextField(15);
      TextField Apellidos = new TextField(60);
      TextField Nacionalidad = new TextField("Española",15);
      
      EntradaDeDatos.add(Nombre);
      EntradaDeDatos.add(Apellidos);
      EntradaDeDatos.add(Nacionalidad);
      
      MiMarco.add(EntradaDeDatos);
      MiMarco.setSize(500,130);
      MiMarco.setTitle("Ventana con campos de textos");
      MiMarco.setVisible(true);
    
         
// aqui se implementa la accion deseada
}
@Override
public void mousePressed(MouseEvent evento) {
}
@Override
public void mouseReleased(MouseEvent evento) {
}
@Override
public void mouseEntered(MouseEvent evento) {
evento.getComponent().setBackground(Color.red);
}
@Override
public void mouseExited(MouseEvent evento) {
evento.getComponent().
setBackground(Color.gray);
}
}
