import java.time.LocalDate;

/**
 * Clase abtracta para fabricar articulos
 */

public abstract class Producto implements Comparable<Producto>{
    private int ID;
    private String tipo;
    private double precio;
    private String serie;
    private String marca;
    private LocalDate fechaFabricacion;

    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    Producto(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        this.ID = ID;
        this.precio = precio;
        this.serie = serie; 
        this.marca = marca;
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Obtenemos el valor de ID
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtenemos le valor de tipo
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Determinamos el valor de tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtenemos el valor de precio
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtenemos el numero de serie
     * @return
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Obtenemos la marca del producto
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtenemos la fecha de fabricacion
     * @return
     */
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
}
