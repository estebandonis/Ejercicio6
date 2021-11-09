import java.time.LocalDate;

public abstract class Producto implements Comparable<Producto>{
    private int ID;
    private String tipo;
    private double precio;
    private String serie;
    private String marca;
    private LocalDate fechaFabricacion;

    Producto(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        this.ID = ID;
        this.precio = precio;
        this.serie = serie; 
        this.marca = marca;
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getID() {
        return ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getSerie() {
        return serie;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
}
