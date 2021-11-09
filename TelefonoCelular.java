import java.time.LocalDate;
import Intefaces.Hacenllamadas;
import Intefaces.Sonportables;


public class TelefonoCelular extends Producto implements Hacenllamadas, Sonportables, Comparable<Producto> {
    
    TelefonoCelular(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("TelefonoCelular");
    }
    
    @Override
    public void llamar() {
        System.out.println("Lamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

    @Override
    public void portable() {
        System.out.println("Llevando mi "+getTipo()+" "+getMarca());
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