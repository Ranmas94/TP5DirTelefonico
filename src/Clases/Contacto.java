/*
 toString funcion de la calse object que heredan todas las clases de java, no recuerdo si lo vimos en la materia,
si no lo vimos lo modifico al mnetodo
 */
package Clases;

/**
 *
 * @author Ranma
 */
public class Contacto {
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto(int dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCiudad() { return ciudad; }
    public String getDireccion() { return direccion; }

    @Override
    public String toString() {
        return "Contacto{" +
               "DNI='" + dni + '\'' +
               ", Nombre='" + nombre + '\'' +
               ", Apellido='" + apellido + '\'' +
               ", Ciudad='" + ciudad + '\'' +
               ", Dirección='" + direccion + '\'' +
               '}';
    }
}

