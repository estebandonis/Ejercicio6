import Intefaces.Navegarinternet;
import java.time.LocalDate;
import Intefaces.Reproducirvideos;

/**
 * Clase para crear SmartTvs
 */

public class SmartTV extends Producto implements Navegarinternet, Reproducirvideos, Comparable<Producto> {
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    SmartTV(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("SmartTV");
    }

    /**
     * Probar funcionalidad de navegar en internet
     */
    @Override
    public void navegar() {
        System.out.println("Visitando la direccion web: desde mi "+getTipo()+" "+getMarca());
    }

    /**
     * Probar funcionalidad de reproducir videos
     */
    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video desde mi "+getTipo()+ " "+ getMarca());
    }

    /**
     * Metodo para ordenar articulos dependiendo de la fecha de fabricacion
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
