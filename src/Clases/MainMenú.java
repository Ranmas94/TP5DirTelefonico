/*
El directorio telefónico posee además las siguientes funcionalidades:
A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro. del teléfono la clave del mismo.
B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.
C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados a dicho apellido.
D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad.
E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java con TreeMap<Long, Cliente>
y TreeSet. Recuerde el uso de: Iterator y keySet()
En el main, crear un Directorio, entre 4 y 5 Contactos, y probar todos los métodos entre A y E.
 */
package Clases;

import static Vistas.Menu.directorio;
import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Stefani Escobar
 */
public class MainMenú {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un Directorio, entre 4 y 5 Contactos, y probar todos los métodos entre A y E.
        //Contacto(int dni, String nombre, String apellido, String ciudad, String direccion)
        
        Contacto con1= new Contacto (38752519,"Stefani","Escobar","La Punta","CalleNorte27");
        Contacto con2= new Contacto (43840092,"Lourdes","Escudero","San Luis","Sarmiento 1543");
        Contacto con3= new Contacto (37640911,"Dante","Poblete","San Luis","Chacarita 420");
        Contacto con4= new Contacto (36220045,"Victor","Aguilera","Tucuman","CalleSur 111");
        Contacto con5= new Contacto (46333123,"Máximiliano","Matilla","Cordoba","CalleEste66");
        Contacto con6= new Contacto (44752589,"Federico","Grippo","San Luis","CalleOeste227");
        
      //agregarContacto(Long telefono, Contacto contacto)
        directorio.agregarContacto(2664009457L, con1);
        directorio.agregarContacto(2664747024L, con2);
        directorio.agregarContacto(2664680234L, con3);
        directorio.agregarContacto(3544660382L, con4);
        directorio.agregarContacto(2664578760L, con5);
        directorio.agregarContacto(2664927113L, con6);
        
       // Probar los metodos
        Contacto contactoEncontrado = directorio.buscarContacto(2664009457L);
            System.out.println("Contacto encontrado: " + contactoEncontrado);
            
        Set<Long> telefonosAsociados = directorio.buscarTelefono("Escudero");
            System.out.println("Teléfonos asociasdos al apellido Escudero: " + telefonosAsociados);
            
        ArrayList<Contacto> contactosCiudad = directorio.buscarContactos("San Luis");
        System.out.println("Contactos en Buenos Aires:");
        for (Contacto contacto : contactosCiudad) {
            System.out.println(contacto);
            
        }
        // Eliminar un contacto
        directorio.borrarContacto(2664009457L);
        System.out.println("Contacto eliminado");

        // Buscar el contacto eliminado
        Contacto contactoEliminado = directorio.buscarContacto(2664009457L);
        System.out.println("Contacto eliminado (debería ser null): " + contactoEliminado);
    }
    
}
