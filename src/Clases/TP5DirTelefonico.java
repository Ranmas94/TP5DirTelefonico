/*
 Trabajo Práctico 5
Un directorio telefónico posee una lista de Contactos de los que interesa conocer su
DNI, nombre, apellido, ciudad y dirección. Un contacto se empareja con un teléfono tipo Long.

El directorio telefónico posee además las siguientes funcionalidades:
-A. agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de
teléfono. Siendo el nro. del teléfono la clave del mismo.
-B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo.
-C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números
de teléfono asociados a dicho apellido.
-D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los
Contactos asociados a dicha ciudad.
-E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio.
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java
con TreeMap<Long, Cliente> y TreeSet. Recuerde el uso de: Iterator y keySet()
En el main, crear un Directorio, entre 4 y 5 Contactos, y probar todos los métodos entre A y E.
 */
package Clases;

/**
 *
 * @author Ranma
 */
public class TP5DirTelefonico {

    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // Agregar contactos, tenemos que agregar L o l para indicar que es long, sino lo toma como int por defecto y dice que es demasiado grande en este caso
        directorio.agregarContacto(2664747024L, new Contacto("37234567", "Lourdes", "Escudero", "San Luis", "Calle Falsa 123"));
        directorio.agregarContacto(2664578760L, new Contacto("38123456", "Maximiliano", "Matilla", "La Toma", "España 456"));
        directorio.agregarContacto(2664927113L, new Contacto("36123456", "Federico", "Grippo", "Merlo", "Las Heras 789"));
        directorio.agregarContacto(3544660382L, new Contacto("36234567", "Victor", "Aguilera", "La Toma", "Illia 101"));

        // Buscar un contacto
        System.out.println("Buscar contacto con telefono 2664747024: " + directorio.buscarContacto(2664747024L));

        // Buscar teléfonos por apellido
        System.out.println("Telefonos asociados al apellido Aguilera: " + directorio.buscarTelefono("Aguilera"));

        // Buscar contactos por ciudad
        System.out.println("Contactos que viven en La Toma: " + directorio.buscarContactos("La Toma"));

        // Borrar un contacto
        directorio.borrarContacto(2664747024L);
        System.out.println("Contacto con telefono 2664747024 después de borrar: " + directorio.buscarContacto(2664747024L));
    }
    
}
