
package ec.edu.ups.ejemplo.clases;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author ASUS_USER
 */
public class InterrupcionesDeEnfoque implements FocusListener {
    @Override
    public void focusGained(FocusEvent Evento) {
        System.out.println("Se ha entrado en el componente");
    }

    @Override
    public void focusLost(FocusEvent Evento) {
        System.out.println("Se ha salido del componente");
    }
}
