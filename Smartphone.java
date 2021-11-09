import java.time.LocalDate;
import Intefaces.Hacenllamadas;
import Intefaces.Navegarinternet;
import Intefaces.Reproducirvideos;
import Intefaces.Sonportables;
import Intefaces.Tomanfotos;

/**
 * Clase para crear Smartphones
 */

public class Smartphone extends Producto implements Hacenllamadas, Tomanfotos, Navegarinternet, Reproducirvideos, Sonportables, Comparable<Producto>{
    
    /**
     * Constructor de la clase
     * @param ID
     * @param precio
     * @param serie
     * @param marca
     * @param fechaFabricacion
     */
    Smartphone(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("Smartphone");
    }
    
    /**
     * Probar funcionalidad de llamar
     */
    @Override
    public void llamar() {
        System.out.println("Llamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

    /**
     * Probar funcionalidad de tomar foto
     */
    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con mi " + getTipo()+" " + getMarca());
    }

    /**
     * Probar funcionalidad de navegar por internet
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
     * Probar funcionalidad de portabilidad
     */
    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    /**
     * Metodo que nos ayuda a ordenar los articulos con la fecha
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
