
package ec.edu.ups.guia.telefonica;
import ec.edu.ups.guia.telefonica.clases.OperadoraTelefonica;
import ec.edu.ups.guia.telefonica.clases.Persona;
//import ec.edu.ups.guia.telefonica.clases.Telefono;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Galo
 */
public class GuiaTelefonica {

    public static void main(String[] args) {

        //Date fechaDeNacimientoUno = new Date(2000, 0, 15);
        //Persona personaUno = new Persona("010101", "Pepito Perez", fechaDeNacimientoUno);
        //OperadoraTelefonica operadoraUno = new OperadoraTelefonica(1, "Claro");
        //Telefono telefonoUno = new Telefono(991275411, "Movil", personaUno, operadoraUno);
        
        //System.out.println("Datos del Telefono:" + telefonoUno.toString());

        //Manejo de Listas en Java
        ArrayList<Persona> contactos = new ArrayList<>();
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        int opcion;
        do {

            System.out.println("-----MENÚ----");
            System.out.println("1. Registrar Contactos:");
            System.out.println("2. Registar Operadoras:");
            System.out.println("3.Registar Telefonos (no implementar):");
            System.out.println("4. Salir:");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
           
            switch (opcion) {
                
                case 1: {
                    String continuar1;
                    do {
                        System.out.println("\n-----Registro de Contactos--------");
                        System.out.println("Ingrese la cédula de la persona: ");
                        String ID = entrada.next();
                        System.out.println("Ingrese el nombre de la persona: ");
                        String nombre = entrada.next();
                        System.out.println("Ingrese la fecha de nacimiento: ");
                        System.out.println("Dia");
                        int dia = entrada.nextInt();
                        System.out.println("Mes");
                        int mes = entrada.nextInt();
                        System.out.println("Anio:0");
                        int anio = entrada.nextInt();
                        Date fechaDeNacimiento = new Date(anio - 1900, mes - 1, dia);

                        Persona contacto = new Persona();
                        contacto.setCedula(ID);
                        contacto.setNombre(nombre);
                        contacto.setfechaDeNacimiento(fechaDeNacimiento);
                        contactos.add(contacto);
                        System.out.println("¿Desea agregar otra persona? (S/N)");
                        continuar1 = entrada.next();
                    } while (continuar1.equalsIgnoreCase("S"));

                    for (Persona personitas : contactos) {
                        System.out.println(personitas);
                    }
                }
                case 2: {
                    String continuar2;
                    do {
                        System.out.println("\n-----Registro de Operadoras-------");
                        System.out.println("Ingrese el nombre de la operadora:");
                        String nombre = entrada.next();
                        System.out.println("Ingrese el codigo de la operadora: ");
                        int codigo = entrada.nextInt();

                        OperadoraTelefonica operadora = new OperadoraTelefonica();
                        operadora.setNombre(nombre);
                        operadora.setCodigo(codigo);
                        operadoras.add(operadora);
                        System.out.println("¿Deseas agregar otra operadora? (S/N):");
                        continuar2 = entrada.next();
                    } while (continuar2.equalsIgnoreCase("S"));

                    for (OperadoraTelefonica operadorita : operadoras) {
                        System.out.println(operadorita);
                    }
                }
                case 3:
                    System.out.println("Registro de Telefono no implementado");
                case 4:
                    System.out.println("Saliendo ahora del programa.......");
                default: 
                        System.out.println("Opción invalida, ingresar de nuevo");
            }

        } while (opcion != 4);
        System.out.println("El programa ha finalizado");
    }
}
