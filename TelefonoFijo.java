import java.time.LocalDate;
import Intefaces.Hacenllamadas;

/**
 * Default para crear Telefonos fijos
 */

public class TelefonoFijo extends Producto implements Hacenllamadas, Comparable<Producto> {
    
    /**
     * Constructor para la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    TelefonoFijo(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("TelefonoFijo");
    }
    
    /**
     * Probar funcionalidad de llamar
     */
    @Override
    public void llamar() {
        System.out.println("Lamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

    /**
     * Metodo que nos ayuda a ordenar los articulos dependiendo de la fecha de fabricacion
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
