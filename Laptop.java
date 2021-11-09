import java.time.LocalDate;
import Intefaces.Ejecutarjuegos;
import Intefaces.Navegarinternet;
import Intefaces.Reproducirvideos;
import Intefaces.Sonportables;

/**
 * Clase para crear laptops
 */

public class Laptop extends Producto implements Navegarinternet, Reproducirvideos, Ejecutarjuegos, Sonportables, Comparable<Producto> {
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    Laptop(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("Laptop");
    }

    /**
     * Probar la funcionalidad de navegar
     */
    @Override
    public void navegar() {
        System.out.println("Visitando la direccion web: desde mi "+getTipo()+" "+getMarca());
    }

    /**
     * Probar la funcionalidad de reproducir videos
     */
    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video desde mi "+getTipo()+ " "+ getMarca());
    }

    /**
     * Probar la funcionalidad de ejecutar juegos
     */
    @Override
    public void jugar() {
        System.out.println("Ejecutando un juego en mi "+getTipo()+" "+getMarca());
    }

    /**
     * Probar la funcionalidad de portabilidad
     */
    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    /**
     * Metodo que nos ayuda a ordenar los articulos dependiendo su fecha de fabricacion
     */
    @Override
    public int compareTo(Producto o) {
        if (o.getFechaFabricacion().isBefore(getFechaFabricacion())){
            return 1;
        }
        else if (o.getFechaFabricacion().isAfter(getFechaFabricacion())){
            return -1;
        }
        else{
            return 0;
        }
    }
}
