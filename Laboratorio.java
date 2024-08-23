/**
 * La clase Laboratorio representa un laboratorio con información sobre su nombre,
 * domicilio, teléfono, compra mínima y día de entrega.
 */
public class Laboratorio {
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Constructor para objetos de la clase Laboratorio.
     * 
     * @param p_nombre      Nombre del laboratorio.
     * @param p_domicilio   Domicilio del laboratorio.
     * @param p_telefono    Teléfono del laboratorio.
     * @param p_compraMin   Compra mínima del laboratorio.
     * @param p_diaEnt      Día de entrega del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }

    /**
     * Constructor para objetos de la clase Laboratorio con compra mínima y día de entrega predeterminados.
     * 
     * @param p_nombre      Nombre del laboratorio.
     * @param p_domicilio   Domicilio del laboratorio.
     * @param p_telefono    Teléfono del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(0);
        this.setDiaEntrega(0);
    }

    /**
     * Establece el nombre del laboratorio.
     * 
     * @param p_nombre El nombre del laboratorio.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el domicilio del laboratorio.
     * 
     * @param p_domicilio El domicilio del laboratorio.
     */
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    /**
     * Establece el teléfono del laboratorio.
     * 
     * @param p_telefono El teléfono del laboratorio.
     */
    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    /**
     * Establece la compra mínima del laboratorio.
     * 
     * @param p_compraMin La compra mínima del laboratorio.
     */
    private void setCompraMin(int p_compraMin) {
        this.compraMinima = p_compraMin;
    }

    /**
     * Establece el día de entrega del laboratorio.
     * 
     * @param p_diaEntrega El día de entrega del laboratorio.
     */
    private void setDiaEntrega(int p_diaEntrega) {
        this.diaEntrega = p_diaEntrega;
    }

    /**
     * Devuelve el nombre del laboratorio.
     * 
     * @return El nombre del laboratorio.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el domicilio del laboratorio.
     * 
     * @return El domicilio del laboratorio.
     */
    public String getDomicilio() {
        return this.domicilio;
    }

    /**
     * Devuelve el teléfono del laboratorio.
     * 
     * @return El teléfono del laboratorio.
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * Devuelve la compra mínima del laboratorio.
     * 
     * @return La compra mínima del laboratorio.
     */
    public int getCompraMin() {
        return this.compraMinima;
    }

    /**
     * Devuelve el día de entrega del laboratorio.
     * 
     * @return El día de entrega del laboratorio.
     */
    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    /**
     * Establece una nueva compra mínima para el laboratorio.
     * 
     * @param p_compraMin   Nueva compra mínima.
     */
    public void nuevaCompraMinima(int p_compraMin) {
        this.setCompraMin(p_compraMin);
    }

    /**
     * Establece un nuevo día de entrega para el laboratorio.
     * 
     * @param p_diaEnt      Nuevo día de entrega.
     */
    public void nuevoDiaEntrega(int p_diaEnt) {
        this.setDiaEntrega(p_diaEnt);
    }

    /**
     * Devuelve una cadena con la información del laboratorio.
     * 
     * @return Información del laboratorio.
     */
    public String mostrar() {
        String info = "Laboratorio: " + this.getNombre();
        info += "\nDomicilio: " + this.getDomicilio() + " - Teléfono: " + this.getTelefono();
        return info;
    }
}
