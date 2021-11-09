import java.time.LocalDate;
import Intefaces.Sonportables;
import Intefaces.Tomanfotos;
import Intefaces.Hacenllamadas;

/**
 * Clase para crear SmartWatch
 */

public class SmartWatch extends Producto implements Tomanfotos, Sonportables, Hacenllamadas, Comparable<Producto> {
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    SmartWatch(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("SmartWatch");
    }

    /**
     * Probar funcionalidad de tomar foto
     */
    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con mi " + getTipo()+" " + getMarca());
    }

    /**
     * Probar funcionalidad de portabilidad
     */
    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    /**
     * Probar funcionalidad de llamar
     */
    @Override
    public void llamar() {
        System.out.println("Llamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

    /**
     * Metodo para ordenar dependiendo de la fecha de fabricacion
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
