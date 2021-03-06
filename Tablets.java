import java.time.LocalDate;
import Intefaces.Navegarinternet;
import Intefaces.Reproducirvideos;
import Intefaces.Sonportables;
import Intefaces.Tomanfotos;

/**
 * Clase para crear tablets
 */

public class Tablets extends Producto implements Tomanfotos, Navegarinternet, Reproducirvideos, Sonportables, Comparable<Producto> {
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    Tablets(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("Tablets");
    }

    /**
     * Probar la funcionalidad de navegar en internet
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
     * Probar la funcionalidad de portabilidad
     */
    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    /**
     * Probar la funcionalidad de tomar foto
     */
    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con mi " + getTipo()+" " + getMarca());
    }

    /**
     * Metodo que nos ayuda a ordenar los articulos dependiendo de su fecha de fabricacion
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
