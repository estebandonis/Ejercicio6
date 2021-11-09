import java.time.LocalDate;
import Intefaces.Ejecutarjuegos;
import Intefaces.Navegarinternet;
import Intefaces.Reproducirvideos;

public class Desktop extends Producto implements Navegarinternet, Reproducirvideos, Ejecutarjuegos, Comparable<Producto>{
    
    Desktop(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("Desktop");
    }

    @Override
    public void navegar() {
        System.out.println("Visitando la direccion web desde mi "+getTipo()+" "+getMarca());
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video desde mi "+getTipo()+ " "+ getMarca());
    }

    @Override
    public void jugar() {
        System.out.println("Ejecutando un juego en mi "+getTipo()+" "+getMarca());
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
