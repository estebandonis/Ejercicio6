import java.time.LocalDate;
import Intefaces.Ejecutarjuegos;
import Intefaces.Navegarinternet;
import Intefaces.Reproducirvideos;

/**
 * Clase para crear desktops
 */

public class Desktop extends Producto implements Navegarinternet, Reproducirvideos, Ejecutarjuegos, Comparable<Producto>{
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    Desktop(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("Desktop");
    }

    /**
     * Probar funcionalidad de navegar
     */
    @Override
    public void navegar() {
        System.out.println("Visitando la direccion web desde mi "+getTipo()+" "+getMarca());
    }

    /**
     * Probar funcionalidad de reproducir videos
     */
    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video desde mi "+getTipo()+ " "+ getMarca());
    }

    /**
     * Probar funcionalidad de ejecutar videojuegos
     */
    @Override
    public void jugar() {
        System.out.println("Ejecutando un juego en mi "+getTipo()+" "+getMarca());
    }

    /**
     * Metodo que sirve para ordenar los articulos dependiendo de su fecha de fabricacion
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
