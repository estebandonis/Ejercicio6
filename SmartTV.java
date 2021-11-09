import Intefaces.Navegarinternet;
import java.time.LocalDate;
import Intefaces.Reproducirvideos;

public class SmartTV extends Producto implements Navegarinternet, Reproducirvideos, Comparable<Producto> {
    SmartTV(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("SmartTV");
    }

    @Override
    public void navegar() {
        System.out.println("Visitando la direccion web: desde mi "+getTipo()+" "+getMarca());
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video desde mi "+getTipo()+ " "+ getMarca());
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
