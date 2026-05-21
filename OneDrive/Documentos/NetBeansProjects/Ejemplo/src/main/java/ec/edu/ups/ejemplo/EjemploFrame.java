

package ec.edu.ups.ejemplo;

import ec.edu.ups.ejemplo.clases.EsquemaRaton;
import ec.edu.ups.ejemplo.clases.InterrupcionesDeAccion;
import ec.edu.ups.ejemplo.clases.InterrupcionesDeElemento;
import ec.edu.ups.ejemplo.clases.InterrupcionesDeEnfoque;
import ec.edu.ups.ejemplo.clases.InterrupcionesDeRaton;
import ec.edu.ups.ejemplo.clases.InterrupcionesDeTeclado;
import ec.edu.ups.ejemplo.clases.InterrupcionesDeVentana;
import ec.edu.ups.ejemplo.clases.MiVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author ASUS_USER
 */
public class EjemploFrame {
    public static void main(String[] args) {
        
//1. Creacion de ventana     
//Frame miVentana = new Frame();
//miVentana.setSize(600,400);//indica el tamaño de mi ventana.
//miVentana.setTitle("Mi ventana de ejemplo");
//miVentana.setVisible(true);//Muestra la ventana.

//2. Creacion ventanas propias
//MiVentana v1 = new MiVentana();       
//MiVentana v2 = new MiVentana("Ventana2");   
//MiVentana v3 = new MiVentana("Ventana 3",400,200);

//3. Posicionamiento de ventanas
//Frame miMarco = new Frame();
//miMarco.setSize(600,400);
//miMarco.setTitle("Mi ventana de ejemplo:");
//miMarco.setLocation(new Point (100,220));
//miMarco.setVisible(true);

//4. Posicimiento con un nuevo conductor
//MiVentana v3 = new MiVentana("Ventana3",400,200,400,100);

//Ventana sin panel-Boton1
//Frame miVentana = new Frame();
//Button botonHola = new Button("Hola");
//miVentana.setSize(400,200);
//miVentana.setTitle("Ventana con botón");
//miVentana.setVisible(true);
//miVentana.add(botonHola);

//5. Ventana con panel-Boton2
//Frame miVentana = new Frame();
//Panel miPanel = new Panel();
//Button botonArea = new Button("Calcular área");
//Button botonPerimetro = new Button("Calcular Perimetro");
//miVentana.setSize(400,200);
//miVentana.setTitle("Ventana con botones");
//miVentana.setVisible(true);
//miVentana.add(miPanel);
//miPanel.add(botonArea);
//miPanel.add(botonPerimetro);
         
//6.Utilizacion básica de paneles
//Frame MiMarco = new Frame();
//Panel PanelPrincipal = new Pane():
//Panel PanelIzq = new Panel();
//Panel PanelDcha = new Panel();
 
//Button BotonCorrer = new Button("Correr");
//Button BotonSaltar = new Button("Saltar");
//Button BotonDescansar = new Button("Descansar");
 
//MiMarco.add(PanelPrincipal);
//PanelPrincipal.add(PanelIzq);
//PanelPrincipal.add(PanelDcha);
//PanelIzq.add(BotonCorrer);
//PanelIzq.add(BotonSaltar);
//PanelDcha.add(BotonDescansar);
 
//MiMarco.setSize(400,200);
//MiMarco.setTitle("Ventana con paneles");
//MiMarco.setVisible(true);

//7. Flowlayout
//Frame miVentana = new Frame();
//Panel miPanel = new Panel();
//FlowLayout posicionamientoSecuencial = new FlowLayout();
//Button botonA = new Button("Primer botón");
//Button botonB = new Button("Segundo botón");
//Button botonC = new Button("Tercer botón");
//Button botonD = new Button("Cuarto botón");
//miPanel.setLayout(posicionamientoSecuencial);
//miVentana.add(miPanel);
//miPanel.add(botonA);
//miPanel.add(botonB);
//miPanel.add(botonC);
//miPanel.add(botonD);
//miVentana.setSize(300, 100);
//miVentana.setTitle("Ventana con flow layout");
//miVentana.setVisible(true);

//8. Borderlayout
//Frame miMarco = new Frame();
//Panel panelMenuNorte = new Panel();
//Panel panelGeneral = new Panel();
//BorderLayout puntosCardinales = new BorderLayout();
//FlowLayout opcionesMenu = new FlowLayout();
//Button botonOpcion1 = new Button("Opción 1");
//Button botonOpcion2 = new Button("Opción 2");
//Button botonOpcion3 = new Button("Opción 3");
//Button botonSur = new Button("Sur");
//Button botonEste = new Button("Este");
//Button botonOeste = new Button("Oeste");
//Button botonCentro = new Button("Centro");
//panelGeneral.setLayout(puntosCardinales);
//panelMenuNorte.setLayout(opcionesMenu);
//miMarco.add(panelGeneral);
//panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
//panelMenuNorte.add(botonOpcion1);
//panelMenuNorte.add(botonOpcion2);
//panelMenuNorte.add(botonOpcion3);
//panelGeneral.add(botonSur, BorderLayout.SOUTH);
//panelGeneral.add(botonEste, BorderLayout.EAST);
//panelGeneral.add(botonOeste, BorderLayout.WEST);
//panelGeneral.add(botonCentro, BorderLayout.CENTER);
//miMarco.setSize(400, 150);
//miMarco.setTitle("Ventana con BorderLayout");
//miMarco.setVisible(true);

//9. Gridlayout
//Frame miVentana = new Frame();
//Panel miPanel = new Panel();
//GridLayout matriz = new GridLayout(2, 3);
//Button[] botones = new Button[6];
//for (int i = 0; i < 6; i++)
//botones[i] = new Button("Botón " + i);
//miPanel.setLayout(matriz);
//for (int i = 0; i < 6; i++)
//miPanel.add(botones[i]);
//miVentana.add(miPanel);
//miVentana.setSize(300, 100);
//miVentana.setTitle("Ventana con GridLayout");
//miVentana.setVisible(true);{

//10. Clase Label-Etiqueta
//Frame miMarco = new Frame();
//Label titulo = new Label("Notas de matemáticas");
//MiMarco.add(Titulo);
//MiMarco.setSize(200,100);
//MiMarco.setTitle("Ventana con etiqueta");
//MiMarco.setVisible(true);

//11. Clase TextField-CampoDeTexto 
//Frame MiMarco = new Frame();
//Panel EntradaDeDatos = new Panel(new FlowLayout());
//TextField Nombre = new TextField(15);
//TextField Apellidos = new TextField(60);
//TextField Nacionalidad = new TextField("Española",15);

//EntradaDeDatos.add(Nombre);
//EntradaDeDatos.add(Apellidos);
//EntradaDeDatos.add(Nacionalidad);

//MiMarco.add(EntradaDeDatos);
//MiMarco.setSize(500,130);
//MiMarco.setTitle("Ventana con campos de texto");
//MiMarco.setVisible(true);

//12. MouseListener
//Frame miVentana = new Frame("Esquema de eventos");
//Panel miPanel = new Panel();
//Button botonHola = new Button("Saludo");
//Button botonAdios = new Button("Despedida");
//miPanel.add(botonHola);
//miPanel.add(botonAdios);
//miVentana.add(miPanel);
//miVentana.setSize(200, 100);
//miVentana.setVisible(true);
//botonHola.addMouseListener(new EsquemaRaton());
//botonAdios.addMouseListener(new EsquemaRaton());

//13. MouseAdapter
//final int NUM_OPCIONES = 12;
//Label mensaje = new Label("Mensaje asociado al botón pulsado");
//Button[] botones = new Button[NUM_OPCIONES];
        
//for (int i = 0; i < NUM_OPCIONES; i++) {
   //botones[i] = new Button("Opcion " + i);
   //if (i < 10) {
        //botones[i].setName("0" + i);
  //} else {
      // botones[i].setName(String.valueOf(i));
    //}
//}
//Frame miVentana = new Frame("Prueba eventos de raton");
//Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
//panelPrincipal.add(mensaje);   
//for (int i = 0; i < NUM_OPCIONES; i++) {
        //panelPrincipal.add(botones[i]);
//}
//miVentana.add(panelPrincipal);
//miVentana.setSize(400, 600);
//miVentana.setVisible(true);
//for (int i = 0; i < NUM_OPCIONES; i++) {
    //botones[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
 //}
 
//14. KeyAdapter
//Frame miVentana = new Frame("Prueba eventos de raton");
//Panel miPanel = new Panel();
//Button boton1 = new Button("Silencio");
//Button boton2 = new Button("Máquina de escribir");
//miPanel.add(boton1);
//miPanel.add(boton2);
//miVentana.add(miPanel);
//miVentana.setSize(400, 400);
//miVentana.setVisible(true);
//boton2.addKeyListener(new InterrupcionesDeTeclado());

//15. WindowListener
//Frame miVentana = new Frame("Prueba eventos de ventana");
//miVentana.setSize(200, 100);
//miVentana.setVisible(true);   
//Frame otraVentana = new Frame("Prueba eventos de ventana");
//otraVentana.setSize(100, 50);
//otraVentana.setLocation(200, 0);
//otraVentana.setVisible(true); 
//miVentana.addWindowListener(new InterrupcionesDeVentana());
//otraVentana.addWindowListener(new InterrupcionesDeVentana());

//16. ActionListener
//Frame miVentana = new Frame("Prueba eventos de acción");
//Panel miPanel = new Panel(new GridLayout(3, 1));
//Button boton = new Button("Etiqueta del boton");
//TextField campoDeTexto = new TextField("Texto del campo 8");
//List lista = new List(3);
//lista.add("Opcion 1 de la lista");
//lista.add("Opcion 2 de la lista");
//ista.add("Opcion 3 de la lista");
//lista.add("Opcion 4 de la lista");
//miPanel.add(boton);
//miPanel.add(campoDeTexto);
//miPanel.add(lista);
//boton.addActionListener(new InterrupcionesDeAccion());
//campoDeTexto.addActionListener(new InterrupcionesDeAccion());
//lista.addActionListener(new InterrupcionesDeAccion());
//miVentana.add(miPanel);
//miVentana.setSize(400, 200);
//miVentana.setVisible(true);

//17. FocuaListener
//Frame miVentana = new Frame("Prueba eventos de enfoque");
//Panel miPanel = new Panel();
//Button boton1 = new Button("Componente 1");
//Button boton2 = new Button("Componente 2");
//miPanel.add(boton1);
//miPanel.add(boton2);
//miVentana.add(miPanel);
//miVentana.setSize(300, 200);
//miVentana.setVisible(true);
//boton2.addFocusListener(new InterrupcionesDeEnfoque());

//18. ItemListener
//Frame miVentana = new Frame("Prueba eventos de elemento");
//Panel miPanel = new Panel(new GridLayout(4, 1));
//Checkbox diesel = new Checkbox("Diesel", true);
//Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
//Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
//Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
//miPanel.add(diesel);
//miPanel.add(farosXenon);
//miPanel.add(llantasAleacion);
//miPanel.add(pinturaMetalizada);
//diesel.addItemListener(new InterrupcionesDeElemento());
//farosXenon.addItemListener(new InterrupcionesDeElemento());
//llantasAleacion.addItemListener(new InterrupcionesDeElemento());
//pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
//miVentana.add(miPanel);
//miVentana.setSize(400, 200);
//miVentana.setVisible(true);
}
  }
               
