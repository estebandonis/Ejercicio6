import java.time.LocalDate;
import Intefaces.Sonportables;
import Intefaces.Tomanfotos;
import Intefaces.Hacenllamadas;

public class SmartWatch extends Producto implements Tomanfotos, Sonportables, Hacenllamadas, Comparable<Producto> {
    
    SmartWatch(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("SmartWatch");
    }

    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con mi " + getTipo()+" " + getMarca());
    }

    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
    }

    @Override
    public void llamar() {
        System.out.println("Llamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

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
