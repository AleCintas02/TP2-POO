import java.util.*;

/**
 * La clase Persona representa a una persona con DNI, nombre, apellido y año de nacimiento.
 * Proporciona métodos para establecer y obtener estos atributos, calcular la edad y mostrar la información de la persona.
 */
public class Persona {
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    /**
     * Constructor para objetos de la clase Persona.
     * 
     * @param p_dni          Número de DNI de la persona.
     * @param p_nombre       Nombre de la persona.
     * @param p_apellido     Apellido de la persona.
     * @param p_anio         Año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    /**
     * Establece el número de DNI de la persona.
     * 
     * @param p_dni Número de DNI de la persona.
     */
    private void setDNI(int p_dni) {
        this.nroDni = p_dni;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param p_nombre Nombre de la persona.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el apellido de la persona.
     * 
     * @param p_apellido Apellido de la persona.
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Establece el año de nacimiento de la persona.
     * 
     * @param p_anio Año de nacimiento de la persona.
     */
    private void setAnioNacimiento(int p_anio) {
        this.anioNacimiento = p_anio;
    }

    /**
     * Devuelve el número de DNI de la persona.
     * 
     * @param p_dni Número de DNI de la persona.
     * @return Número de DNI de la persona.
     */
    public int getDNI() {
        return this.nroDni;
    }

    /**
     * Devuelve el nombre de la persona.
     * 
     * @param p_nombre Nombre de la persona.
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el apellido de la persona.
     * 
     * @param p_apellido Apellido de la persona.
     * @return Apellido de la persona.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Devuelve el año de nacimiento de la persona.
     * 
     * @param p_anio Año de nacimiento de la persona.
     * @return Año de nacimiento de la persona.
     */
    public int getAnioNacimiento() {
        return this.anioNacimiento;
    }

    /**
     * Calcula y devuelve la edad de la persona basada en el año actual.
     * 
     * @return Edad de la persona.
     */
    public int edad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad = anioHoy - this.getAnioNacimiento();
        return edad;
    }

    /**
     * Devuelve una cadena con el nombre y apellido de la persona.
     * 
     * @return Nombre y apellido de la persona.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Muestra la información de la persona, incluyendo nombre, apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("Nombre y apellido: " + this.nomYApe() + "\nDNI: " + this.getDNI() + "\tEdad: " + this.edad());
    }
}
