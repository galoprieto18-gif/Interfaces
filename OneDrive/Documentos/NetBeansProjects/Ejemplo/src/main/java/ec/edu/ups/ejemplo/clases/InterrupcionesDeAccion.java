
package ec.edu.ups.ejemplo.clases;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS_USER
 */
public class InterrupcionesDeAccion implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent evento) {
        Component componente = (Component) evento.getSource();
        String accionRealizada = evento.getActionCommand();
        System.out.println("Componente: " + componente.getName());
        System.out.println("Suceso: " + accionRealizada);
        System.out.println();
    }
}
