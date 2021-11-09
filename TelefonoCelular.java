import java.time.LocalDate;
import Intefaces.Hacenllamadas;
import Intefaces.Sonportables;

/**
 * Clase para crear Telefonos Celulares
 */

public class TelefonoCelular extends Producto implements Hacenllamadas, Sonportables, Comparable<Producto> {
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    TelefonoCelular(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("TelefonoCelular");
    }
    
    /**
     * Probar funcionalidad de llamar
     */
    @Override
    public void llamar() {
        System.out.println("Lamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

    /**
     * Probar funcionalidad de portabilidad
     */
    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    /**
     * Metodo para ordenar los articulos acorde a la fecha de fabricación
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