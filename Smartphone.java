import java.time.LocalDate;
import Intefaces.Hacenllamadas;
import Intefaces.Navegarinternet;
import Intefaces.Reproducirvideos;
import Intefaces.Sonportables;
import Intefaces.Tomanfotos;

public class Smartphone extends Producto implements Hacenllamadas, Tomanfotos, Navegarinternet, Reproducirvideos, Sonportables, Comparable<Producto>{
    
    Smartphone(int ID, double precio, String serie, String marca, LocalDate fechaFabricacion){
        super(ID, precio, serie, marca, fechaFabricacion);
        setTipo("Smartphone");
    }
    
    @Override
    public void llamar() {
        System.out.println("Llamando al numero desde mi " + getTipo()+ " "+ getMarca());
    }

    @Override
    public void tomarFoto() {
        System.out.println("Tomando una foto con mi " + getTipo()+" " + getMarca());
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
