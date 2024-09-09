/*
Memo: TreeMaps es una coleccion de pares clave y valor.
.put añade entradas deml Map o las actualiza/sobreescribe
 */
package Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Ranma
 */
public class Directorio {
     private TreeMap<Long, Contacto> numMasContactos;

    public Directorio() {
        numMasContactos = new TreeMap<>();
    }

    public void agregarContacto(Long telefono, Contacto contacto) {
        numMasContactos.put(telefono, contacto);
    }

    public Contacto buscarContacto(Long telefono) {
        return numMasContactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> numTelefono = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : numMasContactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                numTelefono.add(entry.getKey());
            }
        }
        return numTelefono;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> lista = new ArrayList<>();
        for (Contacto contacto : numMasContactos.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                lista.add(contacto);
            }
        }
        return lista;
    }

    public void borrarContacto(Long telefono) {
        numMasContactos.remove(telefono);
    }
}

